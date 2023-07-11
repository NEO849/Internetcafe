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

    //    private var spezialFaehigkeit :String = ""
//    private var transformation1 :String = ""
//    private var transformation2 :String = ""
//    private var angriffTief :String = ""
//    private var angriffHoch :String = ""
//    private var verteidigungTief :String = ""
//    private var verteidigungHoch :String = ""
//
//    override fun erstelleCharakter():Gegner {
//        return Gegner(name, lP)
//    }
//
//    // so erstelle ich für jeden Helden individuelle Eigenschaften
//    fun erstelleGegnerStoryModus(){
//        for (name in gegnerNamen){
//            val gegner = erstelleCharakter()
//            gegner.name = name
//
//            when (name) {
//                "Vegeta" -> {
//                    gegner.lP = 15000
//                    gegner.spezialFaehigkeit = "Final Flash"
//                    gegner.setTransformation1("Super Saiyajin")
//                    gegner.setTransformation2("Ultra Saiyajin")
//                }
//                "Freezer" -> {
//                    gegner.lP = 20000
//                    gegner.spezialFaehigkeit = "Death Ball"
//                    gegner.setTransformation1("Super Freezer")
//                    gegner.setTransformation2("Golden Freezer")
//                }
//                "Cell" -> {
//                    gegner.lP = 25000
//                    gegner.spezialFaehigkeit = "Absorbieren"
//                    gegner.setTransformation1("Perfekte Form")
//                    gegner.setTransformation2("Ultimate Form")
//                }
//                "Soldat" -> {
//                    gegner.lP = 5000
//                    gegner.spezialFaehigkeit("Schießen")
//                }
//                "Boo" -> {
//                    gegner.lP = 30000
//                    gegner.spezialFaehigkeit("Genkidama")
//                    gegner.setTransformation1("Bigfoot")
//                    gegner.setTransformation2("Chuck Norris")
//                }
//            }
//            gegner.angriffTief("Fuß Tritt")
//            gegner.angriffHoch("Faust Schlag")
//            gegner.verteidigungTief("Ausweichen")
//            gegner.verteidigungHoch("Block")
//            gegnerListeStoryModus.add(gegner)
//        }
//    }
//
//    // so erstelle ich Helden Objekte dynamisch aus einer Liste, gut wenn man viele, schnell erstellen möchte
//    fun erstelleGegnerArcadeModus() {
//        for (name in gegnerNamen) {
//            val gegner = erstelleCharakter()
//            gegner.name = name
//            gegner.lP = 10000
//
//            when (name) {
//                "Vegeta" -> {
//                    gegner.spezialFaehigkeit("Final Flash")
//                    gegner.setTransformation1("Super Saiyajin")
//                    gegner.setTransformation2("Ultra Saiyajin")
//                }
//
//                "Freezer" -> {
//                    gegner.spezialFaehigkeit("Death Ball")
//                    gegner.setTransformation1("Super Freezer")
//                    gegner.setTransformation2("Golden Freezer")
//                }
//
//                "Cell" -> {
//                    gegner.spezialFaehigkeit("Absorbieren")
//                    gegner.setTransformation1("Perfekte Form")
//                    gegner.setTransformation2("Ultimate Form")
//                }
//
//                "Soldat" -> {
//                    gegner.spezialFaehigkeit("Schießen")
//                }
//
//                "Boo" -> {
//                    gegner.spezialFaehigkeit("Genkidama")
//                    gegner.setTransformation1("Bigfoot")
//                    gegner.setTransformation2("Chuck Norris")
//                }
//            }
//            gegner.angriffTief("Fuß Tritt")
//            gegner.angriffHoch("Faust Schlag")
//            gegner.verteidigungTief("Ausweichen")
//            gegner.verteidigungHoch("Block")
//            gegnerListeArcadeModus.add(gegner)
//        }
//    }
//
//    // funktion zum Ausgeben der Helden in der Konsole
//    override fun charakterAusgeben() {
//        super.charakterAusgeben()                   // Aufruf der Methode in der Basisklasse
//        println("Gegner:")
//        for (gegner in gegnerListeArcadeModus) {
//            println(gegner.name)
//        }
//    }
//
//    fun setSpezialFaehigkeit(neueSpezialFaehigkeit: String) {
//        spezialFaehigkeit = neueSpezialFaehigkeit
//    }
//
//    fun setTransformation1(neueTransformation: String) {
//        transformation1 = neueTransformation
//    }
//
//    fun setTransformation2(neueTransformation: String) {
//        transformation2 = neueTransformation
//    }
//
//    fun angriffTief(neuerAngriff: String) {
//        angriffTief = neuerAngriff
//    }
//
//    fun angriffHoch(neuerAngriff: String) {
//        angriffHoch = neuerAngriff
//    }
//
//    fun verteidigungTief(neueVerteidigung: String) {
//        verteidigungTief = neueVerteidigung
//    }
//
//    fun verteidigungHoch(neueVerteidigung: String) {
//        verteidigungHoch = neueVerteidigung
//    }
//
//
//
//    //
//    override fun angreifen() {
//        println("$name  greift an")
//    }
//
//    //
//    override fun verteidigen() {
//        println("$name  verteidigt sich")
//    }
//
//    //
//    fun spezialFaehigkeit(faehigkeit: String) {
//        println("$name  setzt die Spezialfähigkeit $faehigkeit  ein")
//    }
//
//    //
//    override fun transformation1() {
//        println("$name  Transformiert sich zu  $transformation1")
//    }
//
//    //
//    override fun transformation2() {
//        println("$name  Transformiert sich zu  $transformation2")
//    }
//
//    //
//    override fun magischeBohnen(){
//        println("$name  verwendet eine magische Bohne um sich zu Heilen")
//    }
//}

    // hier allgemeine Eigenschaften der Helden, damit ich sie abrufen und definieren kann
//private var spezialAngriff :String = ""
//private var transformation1 :String = ""
//private var transformation2 :String = ""
//private var angriffTief :String = ""
//private var angriffHoch :String = ""
//private var verteidigungTief :String = ""
//private var verteidigungHoch :String = ""

//// sekundär Konstruktor
//constructor(
//name:String,
//lP:Int,
//transformation1:String,
//transformation2:String,
//angriffTief:String,
//angriffHoch:String,
//verteidigungTief:String,
//verteidigungHoch:String,
//spezialAngriff :String
//) :this(name,lP) {
//    this.transformation1 = transformation1
//    this.transformation2 = transformation2
//    this.angriffTief = angriffTief
//    this.angriffHoch = angriffHoch
//    this.verteidigungTief = verteidigungTief
//    this.verteidigungHoch = verteidigungHoch
//    this.spezialAngriff= spezialAngriff
//}

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

    // ,transformation1,transformation2,spezialAngriff,angriffHoch,angriffTief,verteidigungHoch,verteidigungTief,heilen

//
//    // Konstruktor für den Arcade Mode
//    constructor(
//            name:String,
//            lP:Int,
//            angriffHoch:String,
//            verteidigungHoch:String
//    ) :this(name,lP) {
//        this.angriffHoch = angriffHoch
//        this.verteidigungHoch = verteidigungHoch
//    }
//
//    // funktion um schnell und einfach einen "Arcade" Modus zu erstellen (bis das gestanden ist, hat es mich 4-5 Tage gekostet!)
//
//
//    fun spezialAngriff(spezialAngriff: String) {
//        spezialAngriff = spezialAngriff
//    }
//
//    fun setTransformation1(neueTransformation: String) {
//        transformation1 = neueTransformation
//    }
//
//    fun setTransformation2(neueTransformation: String) {
//        transformation2 = neueTransformation
//    }
//
//    fun angriffTief(neuerAngriff: String) {
//        angriffTief = neuerAngriff
//    }
//
//    fun angriffHoch(neuerAngriff: String) {
//        angriffHoch = neuerAngriff
//    }
//
//    fun verteidigungTief(neueVerteidigungTief: String) {
//        verteidigungTief = neueVerteidigungTief
//    }
//
//    fun verteidigungHoch(neueVerteidigungHoch: String) {
//        verteidigungHoch = neueVerteidigungHoch
//    }
//
//    // Funktion zum Ausgeben der Helden in der Konsole
//    override fun charakterAusgeben() {
//        println("Helden")
//        for (held in heldenListe) {
//            println(held.name)
//        }
//    }
//
//    //
//    override fun erstelleCharakter():Held {
//        return Held(name, lP)
//    }
//
//    //
//    override fun angreifen() {
//        println("$name  greift an")
//    }
//
//    //
//    override fun verteidigen() {
//        println("$name  verteidigt sich")
//    }
//
//    //
//    fun spezialAngriff(faehigkeit: String) {
//        println("$name  setzt die Spezialfähigkeit $faehigkeit  ein")
//    }
//
//    //
//    override fun transformation1() {
//        println("$name  Transformiert sich zu  $transformation1")
//    }
//
//    //
//    override fun transformation2() {
//        println("$name  Transformiert sich zu  $transformation2")
//    }
//
//    //
//    override fun magischeBohnen(){
//        println("$name  verwendet eine magische Bohne um sich zu Heilen")
//    }
//
//}

    // rum experimentiert...
//    override fun spielBeenden() {
//        val gueltigeEingaben = listOf("Ja", "Nein")
//        while (true) {
//            println("\nBeenden ohne zu Speichern? [Ja/Nein]")        // wenn richtige Eingabe durch "break" wird die Schleife verlassen
//            val eingabe = readln().lowercase()
//
//            if (eingabe in gueltigeEingaben) {                       // ich überprüfe ob die Eingabe mit den gültigen Eingaben in der Liste übereinstimmen
//                if (eingabe == "ja") {
//                    println("\nSpiel wird Beendet.")
//                    countdown(3)
//                    auswahlSpiele.auswahlSpiele()
//                } else {
//                    spielSpeichern()
//                }
//                break                                               // Schleife wird beendet, da eine gültige Eingabe erfolgt ist
//            } else {
//                println("\nUngültige Eingabe! Bitte `Ja´ oder ´Nein´ eingeben.")
//            }
//        }
//    }

    // Funktion um Listen aus String durch nummeriert auszugeben
//    fun indexNummeriert(liste:List<String>): List<String> {
//        return liste.mapIndexed { index, name -> "${index + 1}.$name" }
//    }

    //    hier nicht alle Möglichkeiten, wie User Ja/Nein schreiben könnte abgesichert...
//    override fun spielBeenden() {
//        println("Beenden ohne zu Speichern? [Ja/Nein]")
//        var eingabe = readln()
//        while (!eingabe.equals("Ja", ignoreCase = true) && !eingabe.equals("Nein", ignoreCase = true)) {
//            println("Achtung! Ungültige Eingabe. Bitte ´Ja´ oder ´Nein´ eingeben.")
//            eingabe = readln()
//        }
//        if (eingabe.equals("nein", ignoreCase = true)) {
//            spielSpeichern()
//        } else {
//            println("Spiel wird Beendet...")
//            auswahlSpiele()
//        }
//    }

    //    // Funktion zum Ausgeben der Helden in der Konsole
//    override fun charakterAusgeben() {
//        for (held in heldenArcade) {
//            println(held.name)
//        }
//    }

    // Funktion zum Ausgeben der Helden in der Konsole
//    override fun charakterAusgeben() {
//        for (gegner in gegnerArcade) {
//            println(gegner.name)
//        }
//    }
//  private val charakterListe = mutableListOf("Son Goku", "Son Gohan", "Trunks", "Piccolo", "Krelin","Vegeta", "Freezer", "Cell", "Boo", "Soldat")

    // fun um eine Liste als Ergebnis zurückzugeben
//    override fun charakterAusgeben(): List<String> {
//        return nummeriereObjekte(namenListe)
//    }

    // fun um die Liste als Ergebnis zurückzugeben
//    override fun charakterAusgeben(): List<String> {
//        return gegnerArcade.map { it.name }
//    }

    // ist eine open Basisklasse von der die Klassen Held und gegner erben sollen, jedoch name, lp und Status "istBesiegt" sollen nicht von aussen verändert werden können
// extra alle "var" und nicht "val" weil bei DBZ durch "Nahtoderfahrung","Magische Bohnen","Super Sayajin Mode" machen dies nötig um den Status unter dem Kampf zu aktualisieren
//    open class Charakter(
//        protected var name: String,       // default constructor, protected damit in den unterklassen darauf zugegriffen werden kann
//        protected var lP: Int,
//        private var istBesiegt: Boolean = false,
//    ) {
//
//
//
//        // gemeinsame fun zum Erstellen und zurückgeben von Charakter-Objekten mit Name und LP und "istBesiegt" auf false
//        open fun erstelleCharakter():Charakter{
//            return Charakter(name,lP)
//        }
//
//        // sind Platzhalter und werden in den Unterklassen überschrieben
//        open fun charakterAusgeben(): String{
//            return name
//        }
//
//        //
//        open fun schadenErleiden(schaden:Int):Pair<Int,Boolean>{
//            val neueLP = lP - schaden
//            val istBesiegt = neueLP <= 0
//            if (istBesiegt) {
//                println("$name  ist K:O gegangen!")
//            }
//            return Pair(neueLP, istBesiegt)
//        }
//
//        //
//        open fun angreifen(ziel:Charakter, schaden: Int):Pair<Int,Boolean> {
//            val (neueLP, istBesiegt) = ziel.schadenErleiden(schaden)
//            ziel.lP = neueLP
//            if (istBesiegt) {
//                println("${ziel.name}  ist K:O gegangen!")
//            }
//            return Pair(neueLP, istBesiegt)
//        }
//
//        //
//        open fun verteidigen(schaden: Int):Int {
//            return schaden                          // wird in unterklassen definiert
//        }
//
//        //
//        open fun spezialAngriff(ziel: Charakter, schaden: Int):Pair<Int,Boolean>  {
//            val (neueLP, istBesiegt) = ziel.schadenErleiden(schaden * 2)    // verursacht doppelten schaden
//            ziel.lP = neueLP
//            if (istBesiegt) {
//                println("${ziel.name}  ist K:O gegangen!")
//            }
//            return Pair(neueLP, istBesiegt)
//        }
//
//        //
//        open fun transformation1(lPErhoehung: Int):Int {
//            lP += lPErhoehung
//            return lP
//        }
//
//        //
//        open fun transformation2(lPErhoehung: Int):Int {
//            lP += lPErhoehung
//            return lP
//        }
//
//        //
//        open fun magischeBohnen(lPErhoehung: Int):Int{
//            lP += lPErhoehung
//            return lP
//        }
//    }

    // erbt von Klasse Charakter
//    class Held(name: String, lP: Int) : Charakter(name, lP) {
//
//        private val heldenArcade = mutableListOf<Held>()       // hier speichere ich die erstellten Heldobjekte für den Arcade Modus
//        private val heldenStory = mutableListOf<Held>()       // hier speichere ich die erstellten Heldobjekte für den Story Modus
//
//        val namenListe = listOf("Son Goku", "Son Gohan", "Trunks", "Piccolo", "Krelin","Vegeta", "Freezer", "Cell", "Boo", "Soldat")
//        val lPWerte = listOf(20000, 15000, 12000, 8000, 2000)
//        val transformation1Liste = listOf("Super Saiyan", "Mystic Gohan", "Super Saiyan", "Super Fusion", "Power Up")
//        val transformation2Liste = listOf("Super Saiyan Blue", "Ultimate Gohan", "Super Saiyan 2", "Namek Fusion", "Kajoken")
//        val spezialFaehigkeitListe = listOf("Kamehameha", "Masenko", "Finish Buster", "Beam Cannon", "Destructo Disc")
//
//
//        //
//        override fun angreifen(ziel:Charakter, schaden: Int):Pair<Int,Boolean> {
//            val (neueLP, istBesiegt) = ziel.schadenErleiden(schaden)
//            ziel.lP = neueLP
//            if (istBesiegt) {
//                println("${ziel.name}  ist K:O gegangen!")
//            }
//            return Pair(neueLP, istBesiegt)
//        }
//
//        //
//        override fun verteidigen(schaden: Int):Int {
//            lP == lP
//            return lP
//        }
//
//        //
//        override fun spezialFaehigkeit(ziel: Charakter, schaden: Int):Pair<Int,Boolean>  {
//            val (neueLP, istBesiegt) = ziel.schadenErleiden(schaden * 2)    // verursacht doppelten schaden
//            ziel.lP = neueLP
//            if (istBesiegt) {
//                println("${ziel.name}  ist K:O gegangen!")
//            }
//            return Pair(neueLP, istBesiegt)
//        }
//
//        //
//        override fun transformation(lPErhoehung: Int):Int {
//            lP += lPErhoehung
//            return lP
//        }
//
//        //
//        override fun heilen(heilung: Int):Int{
//            lP += heilung
//            return lP
//        }
//
//        //
//        override fun schadenErleiden(schaden:Int):Pair<Int,Boolean>{
//            val neueLP = lP - schaden
//            val istBesiegt = neueLP <= 0
//            if (istBesiegt) {
//                println("$name  ist K:O gegangen!")
//            }
//            return Pair(neueLP, istBesiegt)
//        }
//
//
//        // Funktion für Arcade Modus, somit schnell, unterschiedliche Helden
//        fun erstelleArcadeModus():List<Held>{
//            for (i in namenListe.indices) {
//                val name = namenListe[i]
//                val lP = 10000
//                val transformation1 = transformation1Liste[i]
//                val transformation2 = transformation2Liste[i]
//                val spezialFaehigkeit = spezialFaehigkeitListe[i]
//                val angriffHoch = "Faustschlag"
//                val angriffTief = "Fußtritt"
//                val verteidigungHoch = "Block"
//                val verteidigungTief = "Ausweichen"
//                val heilen = "Heilen"
//
//                val held = Held(name, lP)
//                heldenArcade.add(held)
//            }
//            return heldenArcade
//        }
//
//        // Funktion für Story Modus, somit schnell, unterschiedliche Helden
//        fun erstelleStoryModus():List<Held> {
//            for (i in namenListe.indices) {
//                val name = namenListe[i]
//                val lP = lPWerte[i]
//                val transformation1 = transformation1Liste[i]
//                val transformation2 = transformation2Liste[i]
//                val spezialFaehigkeit = spezialFaehigkeitListe[i]
//                val angriffHoch = "Faustschlag"
//                val angriffTief = "Fußtritt"
//                val verteidigungHoch = "Block"
//                val verteidigungTief = "Ausweichen"
//                val heilen = "Heilen"
//
//                val held = Held(name, lP)
//                heldenStory.add(held)
//            }
//            return heldenStory
//        }
//    }

    // erbt von der abstract "Utils" Basisklasse, ich überschreibe die abstrakten funktionen individuell aufs RPG Spiel abgestimmt
//    open class DBZ : Utils() {
//
//        private val auswahlSpiele = AuswahlSpiele()
//        private val held  = Held("",0)    // Instanziierung von der Held Klasse
//        private val gegner  = Gegner("",0)    // Instanziierung von der Held Klasse
//
//        override fun spielStarten() {
//            println("\nWelchen Modus möchtest du Spielen?")
//            println("[1] Story Mode")
//            println("[2] Arcade Mode")
//            println("[3] Exit")
//
//            val auswahlModus = readln().toIntOrNull() ?: 0
//            when (auswahlModus) {
//                1 -> {
//                    startStoryModus()
//                }
//                2 -> {
//                    startArcadeModus()
//                }
//                3 -> {
//                    menuImSpiel()
//                }
//                else -> {
//                    println("Ungültige Eingabe! Ganzzahl eingeben.")
//                    spielStarten()
//                }
//            }
//        }
//
//        private fun startStoryModus(){
//            println("Story Modus wird geladen...")
//            //countdown(3)
//            spielStarten()
//        }
//
//        private fun startArcadeModus(){
//            println("\nArcade Mode wird geladen...")
//            // countdown(3)
//            println("\nWähle deinen Kämpfer...")
//
//            val heldenListe = held.erstelleArcadeModus()
//            val gegnerListe = gegner.erstelleArcadeModus()
//            val alleCharaktere = heldenListe + gegnerListe
//            println("$alleCharaktere")
//
////        held.erstelleArcadeModus()
////        held.charakterAusgeben()
////        gegner.erstelleArcadeModus()
////        gegner.charakterAusgeben()
//
//        }
//
//        override fun spielSpeichern() {
//            println("\nSpiel wird gespeichert. Coming Soon...")
//            //countdown(3)
//            // Logik
//            auswahlSpiele.auswahlSpiele()
//        }
//
//        override fun spielFortsetzen() {
//            println("\nSpiel wird in kürze fortgesetzt. Coming Soon...")
//            //countdown(3)
//            // Logik
//            auswahlSpiele.auswahlSpiele()
//        }
//
//        // ich wollte das mal anders lösen und ohne ".toLowerCase", alle gültigen Eingaben sind in einer Liste gespeichert. Vorsicht ohne "break" Endlosschleife
//        override fun spielBeenden() {
//            val gueltigeEingaben = listOf("Ja", "JA", "ja", "jA", "Nein", "NEIN", "nein", "NeIn", "NeiN", "neiN", "niEN")
//            while (true) {                                                // das erzeugt eine Endlosschleife, solange der User keine gültige Eingabe macht, läuft sie immer weiter bis zum "break" Befehl
//                println("\nBeenden ohne zu Speichern? [Ja/Nein]")        // wenn richtige Eingabe durch "break" wird die Schleife verlassen
//                val eingabe = readln()
//
//                if (eingabe in gueltigeEingaben) {                       // ich überprüfe ob die Eingabe mit den gültigen Eingaben in der Liste übereinstimmen
//                    if (eingabe.equals(
//                            "Ja",
//                            ignoreCase = true
//                        )
//                    ) {   // wenn die Eingabe "ja" unabhängig von Groß/Klein, dann wird die Funktion "auswahlSpiele" aufgerufen,
//                        println("\nSpiel wird Beendet.")
//                        //countdown(3)
//                        auswahlSpiele.auswahlSpiele()
//                    } else {                                            // andernfalls ist die Eingabe also nicht ja, sondern ein anderes gültiges Wort wie "nein", dann wird die Funktion "spieleSpeichern" aufgerufen
//                        spielSpeichern()
//                    }
//                    break                                               // Schleife wird beendet, da eine gültige Eingabe erfolgt ist
//                } else {
//                    println("\nUngültige Eingabe! Bitte `Ja´ oder ´Nein´ eingeben.") // weil ich im else Block keine Bedingung oder weiter eine Überprüfung vornehme, wird "break" benötigt um die Schleife zu verlassen,
//                }                                                                    // so ist das aber gewollt, das die Schleife wieder beginnt bei ungültiger Eingabe
//            }
//        }
//    }

    //
//    fun spezialFaehigkeit(ziel: Charakter, schaden: Int):Pair<Int,Boolean>  {
//        val (neueLP, istBesiegt) = ziel.schadenErleiden(schaden * 2)    // verursacht doppelten schaden
//        ziel.lP = neueLP
//        if (istBesiegt) {
//            println("${ziel.name}  ist K:O gegangen!")
//        }
//        return Pair(neueLP, istBesiegt)
//    }

    // Funktion für Arcade Modus, somit schnell, unterschiedliche Helden
//    fun starteArcadeModus():List<Charakter>{
//        for (i in namenListe.indices) {
//            val name = namenListe[i]
//            val lP = 10000
//            val transformation1 = transformation1Liste[i]
//            val transformation2 = transformation2Liste[i]
//            val spezialFaehigkeit = spezialFaehigkeitListe[i]
//            val angriffHoch = "Faustschlag"
//            val angriffTief = "Fußtritt"
//            val verteidigungHoch = "Block"
//            val verteidigungTief = "Ausweichen"
//            val heilen = "Heilen"
//
//            val charakter = Charakter(name, lP)
//            arcadeAuswahl.add(charakter)
//        }
//        return arcadeAuswahl
//    }

    // erbt von Klasse Charakter
//class Gegner (name:String, lP:Int):Charakter(name, lP) {
//
//    private val gegnerArcade = mutableListOf<Gegner>()       // hier speichere ich die erstellten Heldobjekte für den Arcade Modus
//    private val gegnerStory = mutableListOf<Gegner>()       // hier speichere ich die erstellten Heldobjekte für den Story Modus
//
//    var namenListe = listOf("Vegeta", "Freezer", "Cell", "Boo", "Soldat")
//    val lPWerte = listOf(30000, 50000, 80000, 100000, 3000)
//    val transformation1Liste = listOf("Super Saiyan", "Super Freezer", "Perfekte Form", "Bad Boo", "")
//    val transformation2Liste = listOf("Ultra Saiyajin", "Golden Freezer", "Harakiri", "Chuck Norris Fusion", "")
//    val spezialFaehigkeitListe = listOf("Final Flash", "Death Ball", "Absorbieren", "Genkidama", "Schießen")
//
//    // Funktion für Arcade Modus, somit schnell, unterschiedliche Helden
//    fun erstelleArcadeModus():List<Gegner>{
//        for (i in namenListe.indices) {
//            val name = namenListe[i]
//            val lP = 10000
//            val transformation1 = transformation1Liste[i]
//            val transformation2 = transformation2Liste[i]
//            val spezialFaehigkeit = spezialFaehigkeitListe[i]
//            val angriffHoch = "Faustschlag"
//            val angriffTief = "Fußtritt"
//            val verteidigungHoch = "Block"
//            val verteidigungTief = "Ausweichen"
//            val heilen = "Heilen"
//
//            val gegner = Gegner(name, lP)
//            gegnerArcade.add(gegner)
//        }
//        return gegnerArcade
//    }
//
//    // Funktion für Story Modus, somit schnell, unterschiedliche Helden
//    fun erstelleStoryModus():List<Gegner> {
//        for (i in namenListe.indices) {
//            val name = namenListe[i]
//            val lP = lPWerte[i]
//            val transformation1 = transformation1Liste[i]
//            val transformation2 = transformation2Liste[i]
//            val spezialFaehigkeit = spezialFaehigkeitListe[i]
//            val angriffHoch = "Faustschlag"
//            val angriffTief = "Fußtritt"
//            val verteidigungHoch = "Block"
//            val verteidigungTief = "Ausweichen"
//            val heilen = "Heilen"
//
//            val gegner = Gegner(name, lP)
//            gegnerStory.add(gegner)
//        }
//        return gegnerStory
//    }
//
//}


}