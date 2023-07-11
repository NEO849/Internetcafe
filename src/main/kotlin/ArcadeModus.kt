

class ArcadeModus(name: String, lP: Int,istBesiegt: Boolean = false) : Charakter(name, lP) {

    val arcadeAuswahl = mutableListOf<Charakter>()

    val namenListe = listOf("Son Goku", "Son Gohan", "Trunks", "Piccolo", "Krelin","Vegeta", "Freezer", "Cell", "Boo", "Soldat")
    val transformation1Liste = listOf("Super Saiyan", "Mystic Gohan", "Super Saiyan", "Super Fusion", "Power Up")
    val transformation2Liste = listOf("Super Saiyan Blue", "Ultimate Gohan", "Super Saiyan 2", "Namek Fusion", "Kajoken")
    val spezialFaehigkeitListe = listOf("Kamehameha", "Masenko", "Finish Buster", "Beam Cannon", "Destructo Disc")
    val lPWerte:Int = 10000

    //
    fun angreifen(ziel: Charakter,schaden:Int):Pair<Int,Boolean>{
        ziel.lP -= schaden
        val istBesiegt = ziel.lP <= 0
        if (istBesiegt) {
            println("$name  ist K.O gegangen!")
        }
        return Pair(ziel.lP, istBesiegt)
    }

    //
    fun verteidigen(schaden: Int):Int {
        lP = lP
        return lP
    }

    //
    fun spezialFaehigkeit(ziel: Charakter,schaden:Int):Pair<Int,Boolean>{
        ziel.lP -= schaden * 2
        val istBesiegt = ziel.lP <= 0
        if (istBesiegt) {
            println("$name  ist K.O gegangen!")
        }
        return Pair(ziel.lP, istBesiegt)
    }

    //
    fun transformation(lPErhoehung: Int):Int {
        lP += lPErhoehung
        return lP
    }

    //
    fun heilen(heilung: Int):Int{
        lP += heilung
        return lP
    }


    // Funktion für Arcade Modus, somit schnell, unterschiedliche Helden
    fun erstelleArcadeModus():List<Charakter>{
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

}