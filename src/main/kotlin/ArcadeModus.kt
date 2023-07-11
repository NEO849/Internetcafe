

class ArcadeModus(name: String, lP: Int, istBesiegt: Boolean = false) : Charakter(name, lP) {

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
    fun angreifen(ziel: Charakter, schaden: Int): Pair<Int, Boolean> {
        ziel.lP -= schaden
        val istBesiegt = ziel.lP <= 0
        if (istBesiegt) {
            println("\n$name  ist K.O gegangen!")
        }
        return Pair(ziel.lP, istBesiegt)
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
            println("[$index]  ${charakter.name}")
        }
        val auswahl = readln().toIntOrNull()
        if (auswahl != null && auswahl in 0 until arcadeAuswahl.size) {
            val gewaehlterHeld = arcadeAuswahl[auswahl]
            println("Du hast Kämpfer  ${gewaehlterHeld.name}  ausgewählt")

            // Gegner per Zufall Auswählen
            val zufallIndex = (0 until arcadeAuswahl.size).random()
            val zufallGegner = arcadeAuswahl[zufallIndex]
            println("Dein Gegner ist  ${zufallGegner.name}")

            // Kampfsequenz/ Logik

        } else {
            println("Ungültige Auswahl!")
        }
    }
}