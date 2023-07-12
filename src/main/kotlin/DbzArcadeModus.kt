import kotlin.random.Random

class DbzArcadeModus(name: String, lP: Int, istBesiegt: Boolean = false) : Charakter(name, lP, istBesiegt = false) {

    // Hilfsvariablen für Kampfstatistik
    private var gewonneneRundenSpieler: Int = 0
    private var gewonneneMatchesSpieler: Int = 0
    private var gewonneneRundenComputer: Int = 0
    private var gewonneneMatchesComputer: Int = 0
    private val arcadeCharakter = mutableListOf<Charakter>()

    // Liste mit Namen der Charaktere, Transformationslisten und Spezialfähikeiten
    val namenListe = listOf("Son Goku", "Son Gohan", "Trunks", "Piccolo", "Krelin", "Vegeta", "Freezer", "Cell", "Boo", "C17")
    val transformation1Liste = listOf("Super Saiyan", "Mystic Gohan", "Super Saiyan", "Super Fusion", "Power Up", "Super Saiyan", "Super Freezer", "Perfekte Form", "Bad Boo", "Metal Head")
    val transformation2Liste = listOf("Super Saiyan Blue", "Ultimate Gohan", "Super Saiyan 2", "Namek Fusion", "Kajoken", "Ultra Saiyajin", "Golden Freezer", "Harakiri", "Chuck Norris Fusion", "Robo Fusion")
    val spezialFaehigkeitListe = listOf("Kamehameha", "Masenko", "Finish Buster", "Beam Cannon", "Destructo Disc", "Final Flash", "Death Ball", "Absorbieren", "Genkidama", "Dönner Attack")

    // Hilfsvariablen um die Kampflogik komplexer und für den Spieler interessanter zu gestalten
    private val angriffHoch = "Faustschlag"
    private val angriffTief = "Fußtritt"

    // man kann so mit diesem Aufbau relativ, schnell ein Komplexes Spiel Programmieren
    private val verteidigungHoch = "Block"
    private val verteidigungTief = "Ausweichen"

    // Funktion für Arcade Modus, somit kann ich schnell unterschiedliche Charaktere aus listen erstellen
    fun erstelleArcadeCharakter(): List<Charakter> {
        for (i in namenListe.indices) {
            val name = namenListe[i]
            val lP = 10000
            val charakterTransformation1 = transformation1Liste[i]
            val charakterTransformation2 = transformation2Liste[i]
            val charakterSpezialFaehigkeit = spezialFaehigkeitListe[i]

            val charakter = Charakter(name, lP)
            arcadeCharakter.add(charakter)
        }
        return arcadeCharakter
    }

    // startet den Arcade Modus, ermöglicht die Kämpfer Auswahl und STEUERT die Spiellogik
    fun startArcadeModus() {
        erstelleArcadeCharakter()

        println("\nWähle deinen Kämpfer")

        // Gibt die verfügbaren Charaktere, mit aufsteigendem Index (+1), angefangen bei 1, zur Auswahl aus
        arcadeCharakter.forEachIndexed { index, charakter ->
            println("[${index + 1}]   ${charakter.name}")
        }
        val auswahl = readln().toIntOrNull()

        // ich Überprüfe ob die Auswahl Gültig ist, wenn Auswahl NICHT "null" ist UND sich innerhalb der Range der Liste befindet
        if (auswahl != null && auswahl in 1..arcadeCharakter.size) {

            // weist die Auswahl des Spielers var gewaehlterHeld zu, die Auswahl -1, weil Com von 0 zählt und über [bekomme ich das Element an der Position]
            val gewaehlterHeld = arcadeCharakter[auswahl - 1]
            println("\nDu hast Kämpfer:  ${gewaehlterHeld.name}")

            //  Endlosschleife, solange
            var weiterSpielen = true
            while (weiterSpielen) {

                // Gegner per Zufall Auswählen, zwischen Position 0 und und der letzten der gesamten Liste wird zufälliger Index in var zufallIndex gespeicheichert
                // mit Hilfe von dem zufälligen Index, weise ich den dazugehörigen Charakter aus der arcadeCharakter liste der var zufallGegner zu
                val zufallIndex = (0 until arcadeCharakter.size).random()
                val zufallGegner = arcadeCharakter[zufallIndex]
                println("Dein Gegner ist:  ${zufallGegner.name}")

                var runde = 1

                // Kampfszenario: eine while Schleife die so lange läuft bis ein Charakter KO ist
                while(gewaehlterHeld.lP >= 0 && zufallGegner.lP >= 0) {
                    println("\n---  Hit  $runde  ---")

                    spielerZug(gewaehlterHeld, zufallGegner)
                    if (zufallGegner.lP <= 0) {
                        break
                    }
                    computerZug(zufallGegner, gewaehlterHeld)
                    if (gewaehlterHeld.lP <= 0) {
                        break
                    }
                    runde ++
                }

                // Kampfende
                println("\nKampf Beendet!")

                if (zufallGegner.lP <= 0) {
                    println("Runde 1 You Win!!!")
                    gewonneneRundenSpieler ++
                    if (gewonneneRundenSpieler >= 2) {
                        gewonneneMatchesSpieler ++
                        println("Runde 2 You Win, Match-Point!")
                    }
                }else {
                    println("Runde 1 Computer Wins!!")
                    gewonneneRundenComputer ++
                    if (gewonneneRundenComputer >= 2) {
                        gewonneneMatchesComputer ++
                        println("Runde 2 Computer Win, Match-Point!")
                    }
                }

                println("\nSpielstatistik")
                println("Gewonnene Runden  (Spieler):    $gewonneneRundenSpieler")
                println("Gewonnene Matches (Spieler):    $gewonneneMatchesSpieler")
                println("Gewonnene Runden  (Computer):    $gewonneneRundenComputer")
                println("Gewonnene Matches (Computer):    $gewonneneMatchesComputer")

                println("\nDBZ- Arcademodus erneut Spielen:  [Ja/Nein]")
                val anwort = readln().lowercase()
                weiterSpielen = anwort == "ja"
            }
        }else {
            println("\nUngültige Eingabe!")
        }
    }

    // Spieler Züge, hier kann ich schnell Logiken erweitern, funktionen, etc...
    private fun spielerZug(spieler: Charakter, computer: Charakter) {
        println("Dein Zug")
        println("[1]  Angriff Hoch")
        println("[2]  Angriff Tief")
        println("[3]  Spezialfähigkeit")
        println("[4]  Transformation")
        println("[5]  Heilen")

        //
        var aktion: Int? = null

        // liest die Eingabe des Spielers ein und wiederholt diese sobald sie ungültig ist
        while (aktion == null){
            aktion = readln().toIntOrNull()
            if (aktion !in 1..5) {
                println("\nUngültige Zug! Bitte wähle WEISE!")
                aktion = null
            }
        }

        //
        when (aktion) {
            1 -> {
                val schaden = Random.nextInt(500, 1000)                 // zufälliger Schaden, um Spielfluß spannender, unberechenbarer machen
                val angriffsArtHoch = angriffHoch                                  // mit Auswahl 1 verwendet Spieler hohen Angriff
                println(spieler.angreifen(schaden, angriffsArtHoch))
                computer.schadenErleiden(schaden)
                computer.lP -= schaden
                println("Der hohe Angriff hat  $schaden  Schaden verursacht!")
                println("${computer.name}  hat noch  ${computer.lP} LP übrig!")
            }

            2 -> {
                val schaden = Random.nextInt(300, 1300)
                val angriffsArtTief = angriffTief
                println(spieler.angreifen(schaden, angriffsArtTief))
                computer.schadenErleiden(schaden)
                computer.lP -= schaden
                println("Der tiefe Angriff hat  $schaden  Schaden verursacht!")
                println("${computer.name}  hat noch  ${computer.lP} LP übrig!")
            }

            3 -> {
                val schaden = Random.nextInt(700, 1500)
                val spielerIndex = arcadeCharakter.indexOf(spieler)
                val spezialfaehigkeit = spezialFaehigkeitListe[spielerIndex]
                println(spieler.spezialFaehigkeit(schaden, spezialfaehigkeit))
                computer.schadenErleiden(schaden)
                computer.lP -= schaden
                println("Die Spezialfähigkeit hat  $schaden  Schaden verursacht!")
                println("${computer.name}  hat noch ${computer.lP} LP übrig!")
            }

            4 -> {
                val schaden = Random.nextInt(700, 1500)
                val spielerIndex = arcadeCharakter.indexOf(spieler)
                val transformation1 = transformation1Liste[spielerIndex]
                println(spieler.transformation(schaden, transformation1))
                computer.schadenErleiden(schaden)
                computer.lP -= schaden
                println("Die Transformation hat  $schaden  Schaden verursacht!")
                println("${computer.name}  hat noch ${computer.lP} LP übrig!")
                // 1.Variante war Random   //  val transformation = if (Random.nextBoolean()) transformation1Liste.random() else transformation2Liste.random()
            }

            5 -> {
                val heilenWert = Random.nextInt(700, 3000)
                println(spieler.heilen(heilenWert))
                spieler.lP += heilenWert
                println("Die magische Bohne hat dich um  $heilenWert  lP geheilt!!")
                println("${spieler.name}  hat jetzt wieder  {$spieler.lP}  lP!")
            }

            else -> {
                println("Ungültiger Zug!")
            }
        }
    }

    // Computer Züge
    private fun computerZug(computer: Charakter, spieler: Charakter) {
        println("Gegner ist dran!")

        //
        val zug = Random.nextInt(1, 5)

        //
        when (zug) {
            1 -> {
                val schaden = Random.nextInt(100, 1000)
                val angriffsArt = if (Random.nextBoolean()) angriffHoch else angriffTief
                println(computer.angreifen(schaden, angriffsArt))                           // Com greift an, mit Schaden und Angriffsart
                spieler.schadenErleiden(schaden)                                            // Spieler ruft fun schaden erleiden mit dem Schaden von Angriff vorher
                spieler.lP -= schaden

                if (angriffsArt == angriffHoch) {
                    println("Der hohe Angriff hat  $schaden  Schaden verursacht!")
                    println("${spieler.name}  hat noch  ${spieler.lP} LP übrig!")
                } else{
                    println("Der tiefe Angriff hat  $schaden  Schaden verursacht!")
                    println("${spieler.name}  hat noch  ${spieler.lP} LP übrig!")
                }
            }

            2 -> {
                val schaden = Random.nextInt(700, 1500)
                val spielerIndex = arcadeCharakter.indexOf(computer)
                val spezialfaehigkeit = spezialFaehigkeitListe[spielerIndex]
                println(computer.spezialFaehigkeit(schaden, spezialfaehigkeit))
                spieler.schadenErleiden(schaden)
                spieler.lP -= schaden
                println("Die Spezialfähigkeit hat  $schaden  Schaden verursacht!")
                println("${spieler.name}  hat noch ${spieler.lP} LP übrig!")
            }

            3 -> {
                val schaden = Random.nextInt(100, 1000)
                val computerIndex = arcadeCharakter.indexOf(computer)
                val transformation1 = transformation1Liste[computerIndex]
                println(computer.transformation(schaden,transformation1))
                spieler.schadenErleiden(schaden)
                spieler.lP -= schaden
                println("Die Transformation hat  $schaden  Schaden verursacht!")
                println("${spieler.name}  hat noch ${spieler.lP} LP übrig!")
            }

            4 -> {
                val heilenWert = Random.nextInt(100, 1000)
                println(computer.heilen(heilenWert))
                computer.lP += heilenWert
                println("Die Heilung hat die lP um  $heilenWert  lP verbessert!")
                println("${computer.name}  hat jetzt wieder  ${computer.lP}  lP!")
            }

            else -> {
                println("Ungültiger Zug!")
            }
        }
    }

    override fun angreifen(schaden: Int, angriffsArt: String): String {
        return "\n$name  greift mit  $angriffsArt  an und fügt dadurch  $schaden  zu!"
    }

    override fun verteidigen(schadenReduzieren: Int, verteidigungsArt: String): String {
        return "\n$name  verteidigt sich mit  $verteidigungsArt  und reduziert den Schaden um  $schadenReduzieren  Punkt!"
    }

    override fun spezialFaehigkeit(schaden: Int, spezialfaehigkeit: String): String {
        return "\n$name  verwendet die Spezialfähigkeit  $spezialfaehigkeit  und fügt dadurch  $schaden  zu!"
    }

    override fun transformation(schaden: Int, transformation: String): String {
        return "\n$name  transformiert sich in  $transformation  und fügt dadurch  $schaden  zu!"
    }

    override fun heilen(heilenWert: Int): String {
        return "\n$name  verwendet eine magische Bohne: Heilung um  $heilenWert  lP!"
    }

    override fun schadenErleiden(schaden: Int): String {
        return "\n$name erleidet $schaden Schaden!"
    }
}