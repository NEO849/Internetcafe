
// erbt von Klasse Charakter
class Gegner (name:String, lP:Int):Charakter(name, lP) {

    // hier werden meine Helden gespeichert und mit "protected" ist die Liste von der Klasse DBZ aus zugänglich
    val gegnerListeStoryModus: MutableList<Gegner> = mutableListOf()

    val gegnerListeArcadeModus: MutableList<Gegner> = mutableListOf()

    private var spezialFaehigkeit :String = ""

    private var transformation1 :String = ""

    private var transformation2 :String = ""

    private var gegnerListe :List<String> = listOf(
            "Vegeta",
            "Freezer",
            "Cell",
            "Broly",
            "Boo"
    )

    fun setSpezialFaehigkeit(neueSpezialFaehigkeit: String) {
        spezialFaehigkeit = neueSpezialFaehigkeit
    }

    fun setTransformation1(neueTransformation: String) {
        transformation1 = neueTransformation
    }

    fun setTransformation2(neueTransformation: String) {
        transformation2 = neueTransformation
    }

    override fun erstelleCharakter():Gegner {
        return Gegner(name, lP)
    }

    // so erstelle ich für jeden Helden individuelle Eigenschaften
    fun erstelleGegnerStoryModus(gegnerListe: List<String>){
        for (name in gegnerListe){
            val gegner = erstelleCharakter()
            gegner.name = name

            when (name) {
                "Vegeta" -> {
                    gegner.lP = 10000
                    gegner.spezialFaehigkeit("Kamehameha")
                    gegner.setTransformation1("Super Saiyajin")
                    gegner.setTransformation2("Ultra Saiyajin")
                }
                "Freezer" -> {
                    gegner.lP = 7000
                    gegner.spezialFaehigkeit("Masenko")
                    gegner.setTransformation1("Super Saiyajin")
                    gegner.setTransformation2("Ultimate Gohan")
                }
                "Cell" -> {
                    gegner.lP = 7000
                    gegner.spezialFaehigkeit("Burning Attack")
                    gegner.setTransformation1("Super Saiyajin")
                    gegner.setTransformation2("Super Saiyajin2")
                }
                "Broly" -> {
                    gegner.lP = 5000
                    gegner.spezialFaehigkeit("Special Beam")
                    gegner.setTransformation1("Namekianer Fusion")
                    gegner.setTransformation2("Elder Namekianer")
                }
                "Boo" -> {
                    gegner.lP = 2000
                    gegner.spezialFaehigkeit("Destructo Disk")
                    gegner.setTransformation1("Bigfoot")
                    gegner.setTransformation2("Chuck Norris")
                }
            }
            gegnerListeStoryModus.add(gegner)
        }
    }

    // so erstelle ich Helden Objekte dynamisch aus einer Liste, gut wenn man viele, schnell erstellen möchte
    fun erstelleGegnerArcadeModus(namen: List<String>, lP: Int){
        val gegner = erstelleCharakter()
        gegner.name = namen.firstOrNull() ?:""
        gegner.lP = lP
        gegnerListeArcadeModus.add(gegner)
    }

    // funktion zum Ausgeben der Helden in der Konsole
    override fun charakterAusgeben() {
        println("Gegner:")
        for (gegner in gegnerListeStoryModus) {
            println(gegner.name)
        }
    }

    //
    override fun angreifen() {
        println("$name  greift an")
    }

    //
    override fun verteidigen() {
        println("$name  verteidigt sich")
    }

    //
    fun spezialFaehigkeit(faehigkeit: String) {
        println("$name  setzt die Spezialfähigkeit $faehigkeit  ein")
    }

    //
    override fun transformation1() {
        println("$name  Transformiert sich zu  $transformation1")
    }

    //
    override fun transformation2() {
        println("$name  Transformiert sich zu  $transformation2")
    }

    //
    override fun magischeBohnen(){
        println("$name  verwendet eine magische Bohne um sich zu Heilen")
    }
}