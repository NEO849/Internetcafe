open class Test {

    // das war mir dann doch zu komplex für das einfache Spiel und das wäre erst der Anfang gewesen von der ganzen Logik

    // mit protected mache ich die fun nur in den untergeordneten Klassen zugänglich
    // fun nimmt zwei Parameter entgegen, "namen" die aus einer Liste aus "Strings" besteht und "lP" die aus einer Liste aus Ganzzahlen besteht, Rückgabewert ist eine Map,
    // wobei der Name(String) als Schlüssel verwendet wird und das "Charakter" Objekt selbst als Wert, so kann ich auf die erstellten Objekte über den namen darauf zugreifen
//    protected fun erstelleCharaktere(namen: List<String>, lP: List<Int>): Map<String,Charakter> {
//        val charaktere = mutableMapOf<String,Charakter>()                         // eine leere Map um die erstellten charakter Objekte zu Speichern
//        for (i in namen.indices) {                                          // für jedes Element in der Liste iterieren durch jeden index und da bei gleich groß sind, wird auf jedes Element zugegriffen
//            val charakter = Charakter(namen[i], lP[i])                     // erstellt einen Charakter mit dem Namen von der position mit dem lp Wert an der gleichen position in der anderen Liste und speichert ihn in "charakter"
//            charaktere[namen[i]] = charakter                                      // fügt den erstellten Charakter samt lp der MAp hinzu, wobei der Name als Schlüssel verwendet wird
//        }
//        return charaktere                                                   // gibt die Map mit Namen und lp zurück
//    }
//
//    class Held1 (name:String, lP:Int):Charakter(name, lP) {
//
//        private var heldenNamen = listOf("Goku", "Krelin", "Gohan")
//        private var lPListe = listOf(10000, 2000, 4000)
//
//        fun erstelleHelden():Map<String, Charakter>{
//            return erstelleCharaktere(heldenNamen, lPListe)
//        }
//
//    }
//
//    private fun startArcadeModus(){
//        println("\nArcade Modus wird geladen...")
//        //countdown(3)
//        val heldenMap = Held("Aquaman", 20000).erstelleHelden()
//        val gegnerMap = Gegner("Lucypher", 30000).erstelleGegner()
//
//        println("\nWähle deinen Kämpfer:")
//        for ((name,held) in heldenMap) {
//            println("Name :  $name , LP: ${held.getLP()}")
//        }
//        for ((name,gegner) in gegnerMap) {
//            println("Name :  $name , LP: ${gegner.getLP()}")
//        }
//        var wahlKaempfer = readln()
//        println("\nWähle deinen Gegner:")
//        for ((name,held) in heldenMap) {
//            println("Name :  $name , LP: ${held.getLP()}")
//        }
//        for ((name,gegner) in gegnerMap) {
//            println("Name :  $name , LP: ${gegner.getLP()}")
//        }
//        var wahlGegner = readln()
//
//        startArcadeModus()
//    }

//    // erbt von Klasse Charakter
//    class Gegner (name:String, lP:Int):Charakter(name, lP) {
//
//        private val gegnerNamen = listOf("Freeza", "Vegeta", "Cell")
//        private var lPListe = listOf(10000, 2000, 4000)
//
//        fun erstelleGegner():Map<String, Charakter>{
//            return erstelleCharaktere(gegnerNamen, lPListe)
//        }
//
//    }


}