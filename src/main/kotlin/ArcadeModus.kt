

class ArcadeModus(name: String, lP: Int) : Charakter(name, lP) {

    val namenListe = listOf("Son Goku", "Son Gohan", "Trunks", "Piccolo", "Krelin","Vegeta", "Freezer", "Cell", "Boo", "Soldat")
    val transformation1Liste = listOf("Super Saiyan", "Mystic Gohan", "Super Saiyan", "Super Fusion", "Power Up")
    val transformation2Liste = listOf("Super Saiyan Blue", "Ultimate Gohan", "Super Saiyan 2", "Namek Fusion", "Kajoken")
    val spezialFaehigkeitListe = listOf("Kamehameha", "Masenko", "Finish Buster", "Beam Cannon", "Destructo Disc")
    val lPWerte:Int = 10000

    //
    override fun angreifen(ziel:Charakter, schaden: Int):Pair<Int,Boolean> {
        super.angreifen()
        val (neueLP, istBesiegt) = ziel.schadenErleiden(schaden)
        ziel.lP = neueLP
        if (istBesiegt) {
            println("${ziel.name}  ist K:O gegangen!")
        }
        return Pair(neueLP, istBesiegt)
    }

    //
    override fun verteidigen(schaden: Int):Int {
        lP = lP
        return lP
    }

    //
    override fun spezialFaehigkeit(ziel: Charakter, schaden: Int):Pair<Int,Boolean>  {
        super.spezialFaehigkeit()
        val (neueLP, istBesiegt) = ziel.schadenErleiden(schaden * 2)    // verursacht doppelten schaden
        ziel.lP = neueLP
        if (istBesiegt) {
            println("${ziel.name}  ist K:O gegangen!")
        }
        return Pair(neueLP, istBesiegt)
    }

    //
    override fun transformation(lPErhoehung: Int):Int {
        super.transformation()
        lP += lPErhoehung
        return lP
    }

    //
    override fun heilen(heilung: Int):Int{
        super.heilen()
        lP += heilung
        return lP
    }

    //
    override fun schadenErleiden(schaden:Int):Pair<Int,Boolean>{
        super.schadenErleiden()
        val neueLP = lP - schaden
        val istBesiegt = neueLP <= 0
        if (istBesiegt) {
            println("$name  ist K:O gegangen!")
        }
        return Pair(neueLP, istBesiegt)
    }


    // Funktion für Arcade Modus, somit schnell, unterschiedliche Helden
    fun erstelleArcadeModus():List<Held>{
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

            val held = Held(name, lP)
            heldenArcade.add(held)
        }
        return heldenArcade
    }

}