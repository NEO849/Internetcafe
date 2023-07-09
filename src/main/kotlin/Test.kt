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

    // in diesem Szenario, Ende erste Woche, hab ich schon zurückgeschraubt, aber ich denke es geht einfacher für fünf/sechs Charaktere
//    fun erstelleHelden():List<Charakter> {
//        val heldenNamen = listOf("Son Goku", "Son Gohan", "Piccolo", "Krelin", "Trunks")  // eine gewünschte Liste mit Namen, alle die selbe lP
//        val lP = 10000
//        val heldenListe = mutableListOf<Charakter>()
//
//        for (name in heldenNamen){
//            val held = erstelleCharakter(name,lP)
//            heldenListe.add(held)
//        }
//        return heldenListe
//    }

    // hier werden miene Helden gespeichert und mit protected ist die Liste von der Klasse DBZ aus zugänglich
//    private var heldenListe = mutableListOf<Held>()
//
//    fun erstelleHelden(){
//        val goku = Held("Son Goku",10000)
//        val gohan = Held("Son Gohanu",10000)
//        val krelin = Held("Krelin",10000)
//        val piccolo = Held("Piccolo",10000)
//        val trunks = Held("Trunks",10000)
//
//        heldenListe.add(goku)
//        heldenListe.add(gohan)
//        heldenListe.add(krelin)
//        heldenListe.add(piccolo)
//        heldenListe.add(trunks)
//    }

    //    override fun erstelleCharakter(): Held {
//        val held = Held(name,lP)
//        heldenListe.add(held)
//        return held
//    }

    // funktion zum Ausgeben der Helden in der Konsole
//    override fun charakterAusgeben() {
//        println("Helden:")
//        for (held in heldenListe){
//            println(held.getName())
//        }
//    }

//    // zweiter Konstruktor, für schnelle Charaktererstellung, ruft nur name und lp auf, mit this rufe ich Hauptkonstruktor auf und setze "istBesiegt" für alle auf "false"
//    constructor(name: String,lP: Int) :this(name,lP,false)


//    protected fun erstelleCharakter (name:String, lP:Int):Charakter{
//        val charakter = Charakter(name, lP)
//        heldenListe.add(charakter)
//        return charakter
//    }

//    fun heldenAusgeben():List<Charakter>{
//        return heldenListe
//    }

//    private  val heldenListe = mutableListOf<Charakter>()
//    private  var charakterCounter = 0
//
//    init{
//        charakterCounter ++
//        name = "$charakterCounter, $name"
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