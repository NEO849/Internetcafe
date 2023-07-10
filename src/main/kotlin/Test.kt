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

    // erbt von Klasse Charakter
//    class Held(name: String, lP: Int) : Charakter(name, lP) {
//
//        // hier werden meine Helden gespeichert und mit "protected" ist die Liste von der Klasse DBZ aus zugänglich
//        val heldenListeStoryModus: MutableList<Held> = mutableListOf()
//        val heldenListeArcadeModus: MutableList<Held> = mutableListOf()
//
//        // hier allgemeine Schaden der spezial Fähigkeiten
//        private var spezialSchaden :Int = 0
//
//        private var spezialFaehigkeit :String = ""
//        private var transformation1 :String = ""
//        private var transformation2 :String = ""
//        private var angriffTief :String = ""
//        private var angriffHoch :String = ""
//        private var verteidigungTief :String = ""
//        private var verteidigungHoch :String = ""
//
//        private var heldenNamen :List<String> = listOf(
//                "Son Goku",
//                "Son Gohan",
//                "Trunks",
//                "Piccolo",
//                "Krelin"
//        )
//
//        // so erstelle ich für jeden Helden individuelle Eigenschaften
//        fun erstelleHeldenStoryModus(){
//            for (name in heldenNamen){
//                val held = erstelleCharakter()
//                held.name = name
//
//                when (name) {
//                    "Son Goku" -> {
//                        held.lP = 10000
//                        held.setTransformation1("Super Saiyajin")
//                        held.setTransformation2("Ultra Saiyajin")
//                    }
//                    "Son Gohan" -> {
//                        held.lP = 7000
//                        held.setTransformation1("Super Saiyajin")
//                        held.setTransformation2("Ultimate Gohan")
//                    }
//                    "Trunks" -> {
//                        held.lP = 7000
//                        held.setTransformation1("Super Saiyajin")
//                        held.setTransformation2("Super Saiyajin2")
//                    }
//                    "Piccolo" -> {
//                        held.lP = 5000
//                        held.setTransformation1("Namekianer Fusion")
//                        held.setTransformation2("Elder Namekianer")
//                    }
//                    "Krelin" -> {
//                        held.lP = 2000
//                        held.setTransformation1("Bigfoot")
//                        held.setTransformation2("Chuck Norris")
//
//                    }
//                }
//                held.angriffTief("Fuß Tritt")
//                held.angriffHoch("Faust Schlag")
//                held.verteidigungTief("Ausweichen")
//                held.verteidigungHoch("Block")
//                heldenListeStoryModus.add(held)
//            }
//        }
//
//        // so erstelle ich für jeden Helden individuelle Eigenschaften
//        fun erstelleHeldenArcadeModus(){
//            for (name in heldenNamen){
//                val held = erstelleCharakter()
//                held.name = name
//                held.lP = 10000
//
//                when (name) {
//                    "Son Goku" -> {
//                        held.setTransformation1("Super Saiyajin")
//                        held.setTransformation2("Ultra Saiyajin")
//                    }
//                    "Son Gohan" -> {
//                        held.setTransformation1("Super Saiyajin")
//                        held.setTransformation2("Ultimate Gohan")
//                    }
//                    "Trunks" -> {
//                        held.setTransformation1("Super Saiyajin")
//                        held.setTransformation2("Super Saiyajin2")
//                    }
//                    "Piccolo" -> {
//                        held.setTransformation1("Namekianer Fusion")
//                        held.setTransformation2("Elder Namekianer")
//                    }
//                    "Krelin" -> {
//                        held.setTransformation1("Bigfoot")
//                        held.setTransformation2("Chuck Norris")
//                    }
//                }
//                held.angriffTief("Fuß Tritt")
//                held.angriffHoch("Faust Schlag")
//                held.verteidigungTief("Ausweichen")
//                held.verteidigungHoch("Block")
//                heldenListeArcadeModus.add(held)
//            }
//        }
//
//        // funktion zum Ausgeben der Helden in der Konsole
//        override fun charakterAusgeben() {
//            println("Helden:")
//            for (held in heldenListeArcadeModus) {
//                println(held.name)
//            }
//        }
//
//        fun setSpezialFaehigkeit(neueSpezialFaehigkeit: String) {
//            spezialFaehigkeit = neueSpezialFaehigkeit
//        }
//
//        fun setTransformation1(neueTransformation: String) {
//            transformation1 = neueTransformation
//        }
//
//        fun setTransformation2(neueTransformation: String) {
//            transformation2 = neueTransformation
//        }
//
//        fun angriffTief(neuerAngriff: String) {
//            angriffTief = neuerAngriff
//        }
//
//        fun angriffHoch(neuerAngriff: String) {
//            angriffHoch = neuerAngriff
//        }
//
//        fun verteidigungTief(neueVerteidigung: String) {
//            verteidigungTief = neueVerteidigung
//        }
//
//        fun verteidigungHoch(neueVerteidigung: String) {
//            verteidigungHoch = neueVerteidigung
//        }
//
//        //
//        override fun erstelleCharakter():Held {
//            return Held(name, lP)
//        }
//
//        //
//        override fun angreifen() {
//            println("$name  greift an")
//        }
//
//        //
//        override fun verteidigen() {
//            println("$name  verteidigt sich")
//        }
//
//        //
//        fun spezialFaehigkeit(faehigkeit: String) {
//            println("$name  setzt die Spezialfähigkeit $faehigkeit  ein")
//        }
//
//        //
//        override fun transformation1() {
//            println("$name  Transformiert sich zu  $transformation1")
//        }
//
//        //
//        override fun transformation2() {
//            println("$name  Transformiert sich zu  $transformation2")
//        }
//
//        //
//        override fun magischeBohnen(){
//            println("$name  verwendet eine magische Bohne um sich zu Heilen")
//        }
//    }

    // Konstruktor für den Arcade Mode
//    constructor(
//            name:String,
//            lP:Int,
//            transformation1:String,
//            transformation2:String,
//            angriffTief:String,
//            angriffHoch:String
//    ) :this(name,lP) {
//        this.transformation1 = transformation1
//        this.transformation2 = transformation2
//        this.angriffTief = angriffTief
//        this.angriffHoch = angriffHoch
//        this.verteidigungTief = verteidigungTief
//        this.verteidigungHoch = verteidigungHoch
//    }

//held.spezialFaehigkeit("Kamehameha")
//held.spezialFaehigkeit("Masenko")
//held.spezialFaehigkeit("Burning Attack")
//held.spezialFaehigkeit("Special Beam")
//held.spezialFaehigkeit("Destructo Disk")
//
//
//held.spezialFaehigkeit("Kamehameha")
//held.spezialFaehigkeit("Masenko")
//held.spezialFaehigkeit("Burning Attack")
//held.spezialFaehigkeit("Special Beam")
//held.spezialFaehigkeit("Destructo Disk")


    // methode zum Erleiden von Schaden
//    protected fun schadenErleiden(schaden: Int) {
//        lP -= schaden
//        if (lP <= 0) {
//            lP = 0
//            istBesiegt = true
//            println("$name  ist K.O!!!")
//        }
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

//    // zweter Konstruktior, für schnelle Charaktererstellung, ruft nur name und lp auf, mit this rufe ich Hauptkonstruktor auf und setze "istBesiegt" für alle auf "false"
//    constructor(name: String,lP: Int) :this(name,lP,false)


//    protected fun erstelleCharakter (name:String, lP:Int):Charakter{
//        val charakter = Charakter(name, lP)
//        heldenListe.add(charakter)
//        return charakter
//    }

//    fun heldenAusgeben():List<Charakter>{
//        return heldenListe
//    }

//    fun getName(): String{
//        return name
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

    // so erstelle ich Helden Objekte dynamisch aus einer Liste, gut wenn man viele, schnell erstellen möchte
//    fun erstelleHeldenArcadeModus(namen: List<String>, lP: Int){
//        val held = erstelleCharakter()
//        held.name = namen.firstOrNull() ?:""
//        held.lP = lP
//        heldenListeArcadeModus.add(held)
//    }

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

    // funktion zum Ausgeben der Helden in der Konsole
//    override fun charakterAusgeben() {
//        println("Helden:")
//        for (held in heldenListeArcadeModus) {
//            println(held.name)
//        }
//    }

    // Funktion zum Erstellen der Helden für den Arcade Modus
//    fun erstelleArcadeHelden():List<Held>{
//        for (name in namenListe) {
//            val held = Held("", 10000, "", "")
//            heldenListe.add(held)
//        }
//        return heldenListe
//    }
//
//    // Funktion zum Erstellen der Helden für den Story Modus
//    fun erstelleStoryHelden():List<Held>{
//        for (i in namenListe.indices) {
//            val held = Held(namenListe[i], lPWerte[i], "", "","","","")
//            heldenListe.add(held)
//        }
//        return heldenListe
//    }

}