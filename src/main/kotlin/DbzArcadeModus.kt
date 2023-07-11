import kotlin.random.Random

class DbzArcadeModus(name: String, lP: Int, istBesiegt: Boolean = false) : Charakter(name, lP, istBesiegt = false) {

    private  var gewonneneRunden:Int = 0
    private  var gewonneneMatches:Int = 0
    private val arcadeAuswahl = mutableListOf<Charakter>()

    val namenListe = listOf("Son Goku", "Son Gohan", "Trunks", "Piccolo", "Krelin", "Vegeta", "Freezer", "Cell", "Boo", "C17")
    val transformation1Liste = listOf("Super Saiyan", "Mystic Gohan", "Super Saiyan", "Super Fusion", "Power Up","Super Saiyan", "Super Freezer", "Perfekte Form", "Bad Boo","Metal Head")
    val transformation2Liste = listOf("Super Saiyan Blue", "Ultimate Gohan", "Super Saiyan 2", "Namek Fusion", "Kajoken", "Ultra Saiyajin", "Golden Freezer", "Harakiri", "Chuck Norris Fusion", "Robo Fusion")
    val spezialFaehigkeitListe = listOf("Kamehameha", "Masenko", "Finish Buster", "Beam Cannon", "Destructo Disc", "Final Flash", "Death Ball", "Absorbieren", "Genkidama", "Dönner Attack")

    // Funktion für Arcade Modus, somit schnell, unterschiedliche Charaktere aus listen zu erstellen
    private fun erstelleArcadeAuswahl(): List<Charakter> {
        for (i in namenListe.indices) {
            val name = namenListe[i]
            val lP = 10000
            val transformation1 = transformation1Liste[i]
            val transformation2 = transformation2Liste[i]
            val spezialFaehigkeit = spezialFaehigkeitListe[i]
            val angriffHoch = "Faustschlag"
            val angriffTief = "Fußtritt"
            val verteidigungHoch = "Block"
            val verteidigungTief = "Ausweichen"
            val heilen = "Heilen"

            val charakter = Charakter(name, lP)
            arcadeAuswahl.add(charakter)
        }
        return arcadeAuswahl
    }

    //
    fun angreifen(ziel: Charakter, schaden: Int) {
        ziel.lP -= schaden
        if (ziel.lP >= 0) {
            println("\n$name  ist K.O gegangen!")
        }
    }

    //
    fun verteidigen(schaden: Int): Int {
        lP = lP
        return lP
    }

    //
    fun spezialFaehigkeit(ziel: Charakter, schaden: Int): Pair<Int, Boolean> {
        ziel.lP -= schaden * 2
        val istBesiegt = ziel.lP <= 0
        if (istBesiegt) {
            println("\n$name  ist K.O gegangen!")
        }
        return Pair(ziel.lP, istBesiegt)
    }

    //
    fun transformation(lPErhoehung: Int): Int {
        lP += lPErhoehung
        return lP
    }

    //
    fun heilen(heilung: Int): Int {
        lP += heilung
        return lP
    }

    // startet Arcade Spiellogik
    fun startArcadeModus() {
        erstelleArcadeAuswahl()
        println("\nWähle deinen Kämpfer")
        arcadeAuswahl.forEachIndexed { index, charakter ->
            println("[${index +1}]   ${charakter.name}")
        }
        val auswahl = readln().toIntOrNull()
        if (auswahl != null && auswahl in 1..arcadeAuswahl.size) {
            val gewaehlterHeld = arcadeAuswahl[auswahl -1]
            println("\nDu hast Kämpfer  ${gewaehlterHeld.name}  ausgewählt")

            // Gegner per Zufall Auswählen
            val zufallIndex = (0 until arcadeAuswahl.size).random()
            val zufallGegner = arcadeAuswahl[zufallIndex]
            println("Dein Gegner ist  ${zufallGegner.name}")

            // Kampfsequenz/ Logik, so könnte ich ziemlich einfach, neue Spiele programmieren
            kampsequenz1(gewaehlterHeld,zufallGegner)

        } else {
            println("\nUngültige Auswahl!")
        }
    }

    // erste Kampfsequenz
    private fun kampsequenz1(held:Charakter, gegner: Charakter) {
        println("\nKampf wird geladen...\n")
//      Utils.countdown(3)
        println("\nDein Kämpfer:  ${held.name}  lP:  ${held.lP}")
        println("Dein Gegner:   ${gegner.name}  lP:  ${gegner.lP}")

        // Runde 1
        println("\n---  Round 1 ---")
        spielerZug(held,gegner)
        if (gegner.lP >0) {
            computerZug(gegner,held)
        }

        // Runde 2
        if (held.lP > 0 && gegner.lP > 0) {
            println("\n---  Round 2 ---")
            spielerZug(held,gegner)
            if (gegner.lP >0) {
                computerZug(gegner,held)
            }
        }

        // Runde 3
        if (held.lP > 0 && gegner.lP > 0 && gewonneneRunden == 0) {
            println("\n---  Round 3 ---")
            spielerZug(held,gegner)
            if (gegner.lP >0) {
                computerZug(gegner,held)
            }
        }

        // Kampfende
        println("\nKampf Beendet!")
        if (held.lP > gegner.lP) {
            gewonneneRunden ++
            gewonneneMatches ++
            println("\nYou Win!")
        } else if (gegner.lP > held.lP) {
            gewonneneMatches ++
            println("\nYou Looose!")
        } else {
            println("\nUnentschieden!")
        }
        println("\nStatistik, gewonnene Runden:  $gewonneneRunden  von  $gewonneneMatches")
    }

    // Spieler Züge
    private fun spielerZug(held:Charakter, gegner: Charakter) {
        println("Dein Zug")
        println("[1]  Angriff")
        println("[2]  Verteidigung")

        val zug = readln().toIntOrNull()
        when(zug) {
            1 -> {
                val schaden = Random.nextInt(1000, 2000)
                gegner.angreifen()
                println("${held.name}  hat noch  ${held.lP}  lP  übrig!")
                if (held.lP <= 0) {
                    println("${gegner.name}  ist K.O!")
                } else {
                    println("${gegner.name}  hat noch  ${held.lP}  lP  übrig!")
                }
            }
            2 -> {
                println("Du verteidigst dich")
            }
            else -> {
                println("Ungültige Eingabe!")
            }
        }
    }

    // Computer Züge
    private fun computerZug(held:Charakter, gegner: Charakter) {
        println("Gegner ist dran!")
        val zug = Random.nextInt(1, 2)

        when(zug) {
            1 -> {
                val schaden = Random.nextInt(1000, 2000)
                held.angreifen()
                println("${gegner.name}  hat noch  ${gegner.lP}  lP  übrig!")
                if (gegner.lP <= 0) {
                    println("${held.name}  ist K.O!")
                } else {
                    println("${held.name}  hat noch  ${gegner.lP} lP  übrig!")
                }
            }
            2 -> {
                println("Der Gegner verteidigt sich!")
            }
        }
    }
}