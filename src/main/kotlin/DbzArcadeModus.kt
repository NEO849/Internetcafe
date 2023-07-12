import kotlin.random.Random

class DbzArcadeModus(name: String, lP: Int, istBesiegt: Boolean = false) : Charakter(name, lP, istBesiegt = false) {

    private var gewonneneRunden: Int = 0
    private var gewonneneMatches: Int = 0
    private val arcadeCharakter = mutableListOf<Charakter>()

    val namenListe =
        listOf("Son Goku", "Son Gohan", "Trunks", "Piccolo", "Krelin", "Vegeta", "Freezer", "Cell", "Boo", "C17")
    val transformation1Liste = listOf(
        "Super Saiyan",
        "Mystic Gohan",
        "Super Saiyan",
        "Super Fusion",
        "Power Up",
        "Super Saiyan",
        "Super Freezer",
        "Perfekte Form",
        "Bad Boo",
        "Metal Head"
    )
    val transformation2Liste = listOf(
        "Super Saiyan Blue",
        "Ultimate Gohan",
        "Super Saiyan 2",
        "Namek Fusion",
        "Kajoken",
        "Ultra Saiyajin",
        "Golden Freezer",
        "Harakiri",
        "Chuck Norris Fusion",
        "Robo Fusion"
    )
    val spezialFaehigkeitListe = listOf(
        "Kamehameha",
        "Masenko",
        "Finish Buster",
        "Beam Cannon",
        "Destructo Disc",
        "Final Flash",
        "Death Ball",
        "Absorbieren",
        "Genkidama",
        "Dönner Attack"
    )

    val angriffHoch = "Faustschlag"
    val angriffTief = "Fußtritt"
    val verteidigungHoch = "Block"
    val verteidigungTief = "Ausweichen"
    val heilen = "Heilen"


    // Funktion für Arcade Modus, somit schnell, unterschiedliche Charaktere aus listen zu erstellen
    private fun erstelleArcadeCharakter(): List<Charakter> {
        for (i in namenListe.indices) {
            val name = namenListe[i]
            val lP = 10000
            val transformation1 = transformation1Liste[i]
            val transformation2 = transformation2Liste[i]
            val spezialFaehigkeit = spezialFaehigkeitListe[i]

            val charakter = Charakter(name, lP)
            arcadeCharakter.add(charakter)
        }
        return arcadeCharakter
    }

    // startet Arcade Modus, Kämpfer Auswahl und Spiellogik
    fun startArcadeModus() {
        erstelleArcadeCharakter()

        println("\nWähle deinen Kämpfer")
        arcadeCharakter.forEachIndexed { index, charakter ->
            println("[${index + 1}]   ${charakter.name}")
        }
        val auswahl = readln().toIntOrNull()
        if (auswahl != null && auswahl in 1..arcadeCharakter.size) {
            val gewaehlterHeld = arcadeCharakter[auswahl - 1]
            println("\nDu hast Kämpfer  ${gewaehlterHeld.name}  ausgewählt")

            // Gegner per Zufall Auswählen
            val zufallIndex = (0 until arcadeCharakter.size).random()
            val zufallGegner = arcadeCharakter[zufallIndex]
            println("Dein Gegner ist  ${zufallGegner.name}")

            // Kampfsequenz/ Spiellogik für 3 Runden
            for (runde in 1..3) {
                println("\n---  Round $runde ---")
                spielerZug(gewaehlterHeld, zufallGegner)
                if (gewaehlterHeld.lP <= 0 || zufallGegner.lP <= 0) {
                    break
                }
                computerZug(zufallGegner, gewaehlterHeld)
                if (gewaehlterHeld.lP <= 0 || zufallGegner.lP <= 0) {
                    break
                }
            }

            // Kampfende
            println("\nKampf Beendet!")
            if (gewaehlterHeld.lP > zufallGegner.lP) {
                gewonneneRunden++
                gewonneneMatches++
                println("\nYou Win!")
            } else if (gewaehlterHeld.lP < zufallGegner.lP) {
                gewonneneMatches++
                println("\nYou Looose!")
            } else {
                println("\nUnentschieden!")
            }
        } else {
            println("\nUngültige Auswahl!")
        }
    }

    // Spieler Züge
    fun spielerZug(spieler: Charakter, computer: Charakter) {
        println("Dein Zug")
        println("[1]  Angriff")
        println("[2]  Verteidigung")
        println("[3]  Spezialfähigkeit")
        println("[4]  Transformation")
        println("[5]  Heilen")

        val zug = readln().toIntOrNull()
        when (zug) {
            1 -> {
                val schaden = Random.nextInt(100, 1000)
                val angriffsArt = if (Random.nextBoolean()) angriffHoch else angriffTief
                println(spieler.angreifen(schaden, angriffsArt))
                computer.schadenErleiden(schaden)
                println("Gegner hat noch ${computer.lP} LP übrig!")
            }

            2 -> {
                val schaden = Random.nextInt(100, 1000)
                val verteidigungsArt = if (Random.nextBoolean()) verteidigungHoch else verteidigungTief
                println(spieler.verteidigen(schaden, verteidigungsArt))
            }

            3 -> {
                val schaden = Random.nextInt(100, 1000)
                val spezialfaehigkeit = spezialFaehigkeitListe.random()
                println(spieler.spezialFaehigkeit(schaden, spezialfaehigkeit))
                computer.schadenErleiden(schaden)
                println("Gegner hat noch ${computer.lP} LP übrig!")
            }

            4 -> {
                val schaden = Random.nextInt(100, 1000)
                val transformation =
                    if (Random.nextBoolean()) transformation1Liste.random() else transformation2Liste.random()
                println(spieler.transformation(schaden, transformation))
            }

            5 -> {
                val schaden = Random.nextInt(100, 1000)
                println(spieler.heilen(schaden))
            }

            else -> {
                println("Ungültiger Zug!")
            }
        }
    }

    // Computer Züge
    private fun computerZug(computer: Charakter, spieler: Charakter) {
        println("Gegner ist dran!")
        val zug = Random.nextInt(1, 6)

        when (zug) {
            1 -> {
                val schaden = Random.nextInt(100, 1000)
                val angriffsArt = if (Random.nextBoolean()) angriffHoch else angriffTief
                println(computer.angreifen(schaden, angriffsArt))
                spieler.schadenErleiden(schaden)
                println("Spieler hat noch ${spieler.lP} LP übrig!")
            }

            2 -> {
                val schaden = Random.nextInt(100, 1000)
                val verteidigungsArt = if (Random.nextBoolean()) verteidigungHoch else verteidigungTief
                println(computer.verteidigen(schaden, verteidigungsArt))
            }

            3 -> {
                val schaden = Random.nextInt(100, 1000)
                val spezialfaehigkeit = spezialFaehigkeitListe.random()
                println(computer.spezialFaehigkeit(schaden, spezialfaehigkeit))
                spieler.schadenErleiden(schaden)
                println("Spieler hat noch ${spieler.lP} LP übrig!")
            }

            4 -> {
                val schaden = Random.nextInt(100, 1000)
                val transformation =
                    if (Random.nextBoolean()) transformation1Liste.random() else transformation2Liste.random()
                println(computer.transformation(schaden, transformation))
            }

            5 -> {
                val schaden = Random.nextInt(100, 1000)
                println(computer.heilen(schaden))
            }
        }
    }

    override fun angreifen(schaden: Int, angriffsArt: String): String {
        return "$name greift mit $angriffsArt an!"
    }

    override fun verteidigen(schaden: Int, verteidigungsArt: String): String {
        return "$name verteidigt sich mit $verteidigungsArt!"
    }

    override fun spezialFaehigkeit(schaden: Int, spezialfaehigkeit: String): String {
        return "$name setzt die Spezialfähigkeit $spezialfaehigkeit ein!"
    }

    override fun transformation(schaden: Int, transformation: String): String {
        return "$name transformiert sich in $transformation!"
    }

    override fun heilen(schaden: Int): String {
        return "$name verwendet eine magische Bohne, um sich zu heilen!"
    }

    override fun schadenErleiden(schaden: Int): String {
        return "$name erleidet $schaden Schaden!"
    }
}