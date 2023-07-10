
// erbt von Klasse Charakter
class Held(name: String, lP: Int) : Charakter(name, lP) {

    val heldenArcade = mutableListOf<Held>()       // hier speichere ich die erstellten Heldobjekte für den Arcade Modus
    val heldenStory = mutableListOf<Held>()       // hier speichere ich die erstellten Heldobjekte für den Story Modus

    val namenListe = listOf("Son Goku", "Son Gohan", "Trunks", "Piccolo", "Krelin")
    val lPWerte = listOf(20000, 15000, 12000, 8000, 2000)
    val transformation1Liste = listOf("Super Saiyan", "Mystic Gohan", "Super Saiyan", "Super Fusion", "Power Up")
    val transformation2Liste = listOf("Super Saiyan Blue", "Ultimate Gohan", "Super Saiyan 2", "Namek Fusion", "Kajoken")
    val spezialAngriffListe = listOf("Kamehameha", "Masenko", "Finish Buster", "Beam Cannon", "Destructo Disc")

    // hier allgemeine Eigenschaften der Helden
    private var spezialAngriff :String = ""
    private var transformation1 :String = ""
    private var transformation2 :String = ""
    private var angriffTief :String = ""
    private var angriffHoch :String = ""
    private var verteidigungTief :String = ""
    private var verteidigungHoch :String = ""

    // sekundär Konstruktor
    constructor(
            name:String,
            lP:Int,
            transformation1:String,
            transformation2:String,
            angriffTief:String,
            angriffHoch:String,
            verteidigungTief:String,
            verteidigungHoch:String,
            spezialAngriff :String
    ) :this(name,lP) {
        this.transformation1 = transformation1
        this.transformation2 = transformation2
        this.angriffTief = angriffTief
        this.angriffHoch = angriffHoch
        this.verteidigungTief = verteidigungTief
        this.verteidigungHoch = verteidigungHoch
        this.spezialAngriff= spezialAngriff
    }

    // Funktion für Arcade Modus, somit schnell, unterschiedliche Helden
    fun erstelleArcadeModus():List<Held>{
        for (i in namenListe.indices) {
            val name = namenListe[i]
            val lP = 10000
            val transformation1 = transformation1Liste[i]
            val transformation2 = transformation2Liste[i]
            val spezialAngriff = spezialAngriffListe[i]
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

    // Funktion für Story Modus, somit schnell, unterschiedliche Helden
    fun erstelleStoryModus():List<Held> {
        for (i in namenListe.indices) {
            val name = namenListe[i]
            val lP = lPWerte[i]
            val transformation1 = transformation1Liste[i]
            val transformation2 = transformation2Liste[i]
            val spezialAngriff = spezialAngriffListe[i]
            val angriffHoch = "Faustschlag"
            val angriffTief = "Fußtritt"
            val verteidigungHoch = "Block"
            val verteidigungTief = "Ausweichen"
            val heilen = "Heilen"

            val held = Held(name, lP)
            heldenStory.add(held)
        }
        return heldenStory
    }

    // Funktion zum Ausgeben der Helden in der Konsole
    override fun charakterAusgeben() {
        println("Helden")
        for (held in heldenArcade) {
            println(held.name)
        }
    }

}

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



