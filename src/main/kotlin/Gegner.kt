
// erbt von Klasse Charakter
class Gegner (name:String, lP:Int):Charakter(name, lP) {

    // hier werden meine Helden gespeichert und mit "protected" ist die Liste von der Klasse DBZ aus zugänglich
    val gegnerListeStoryModus: MutableList<Gegner> = mutableListOf()
    val gegnerListeArcadeModus: MutableList<Gegner> = mutableListOf()

    private var spezialFaehigkeit :String = ""
    private var transformation1 :String = ""
    private var transformation2 :String = ""
    private var angriffTief :String = ""
    private var angriffHoch :String = ""
    private var verteidigungTief :String = ""
    private var verteidigungHoch :String = ""

    private var gegnerNamen :List<String> = listOf(
            "Vegeta",
            "Freezer",
            "Cell",
            "Soldat",
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

    fun angriffTief(neuerAngriff: String) {
        angriffTief = neuerAngriff
    }

    fun angriffHoch(neuerAngriff: String) {
        angriffHoch = neuerAngriff
    }

    fun verteidigungTief(neueVerteidigung: String) {
        verteidigungTief = neueVerteidigung
    }

    fun verteidigungHoch(neueVerteidigung: String) {
        verteidigungHoch = neueVerteidigung
    }

    override fun erstelleCharakter():Gegner {
        return Gegner(name, lP)
    }

    // so erstelle ich für jeden Helden individuelle Eigenschaften
    fun erstelleGegnerStoryModus(){
        for (name in gegnerNamen){
            val gegner = erstelleCharakter()
            gegner.name = name

            when (name) {
                "Vegeta" -> {
                    gegner.lP = 15000
                    gegner.spezialFaehigkeit("Final Flash")
                    gegner.setTransformation1("Super Saiyajin")
                    gegner.setTransformation2("Ultra Saiyajin")
                }
                "Freezer" -> {
                    gegner.lP = 20000
                    gegner.spezialFaehigkeit("Death Ball")
                    gegner.setTransformation1("Super Freezer")
                    gegner.setTransformation2("Golden Freezer")
                }
                "Cell" -> {
                    gegner.lP = 25000
                    gegner.spezialFaehigkeit("Absorbieren")
                    gegner.setTransformation1("Perfekte Form")
                    gegner.setTransformation2("Ultimate Form")
                }
                "Soldat" -> {
                    gegner.lP = 5000
                    gegner.spezialFaehigkeit("Schießen")
                }
                "Boo" -> {
                    gegner.lP = 30000
                    gegner.spezialFaehigkeit("Genkidama")
                    gegner.setTransformation1("Bigfoot")
                    gegner.setTransformation2("Chuck Norris")
                }
            }
            gegner.angriffTief("Fuß Tritt")
            gegner.angriffHoch("Faust Schlag")
            gegner.verteidigungTief("Ausweichen")
            gegner.verteidigungHoch("Block")
            gegnerListeStoryModus.add(gegner)
        }
    }

    // so erstelle ich Helden Objekte dynamisch aus einer Liste, gut wenn man viele, schnell erstellen möchte
    fun erstelleGegnerArcadeModus() {
        for (name in gegnerNamen) {
            val gegner = erstelleCharakter()
            gegner.name = name
            gegner.lP = 10000

            when (name) {
                "Vegeta" -> {
                    gegner.spezialFaehigkeit("Final Flash")
                    gegner.setTransformation1("Super Saiyajin")
                    gegner.setTransformation2("Ultra Saiyajin")
                }

                "Freezer" -> {
                    gegner.spezialFaehigkeit("Death Ball")
                    gegner.setTransformation1("Super Freezer")
                    gegner.setTransformation2("Golden Freezer")
                }

                "Cell" -> {
                    gegner.spezialFaehigkeit("Absorbieren")
                    gegner.setTransformation1("Perfekte Form")
                    gegner.setTransformation2("Ultimate Form")
                }

                "Soldat" -> {
                    gegner.spezialFaehigkeit("Schießen")
                }

                "Boo" -> {
                    gegner.spezialFaehigkeit("Genkidama")
                    gegner.setTransformation1("Bigfoot")
                    gegner.setTransformation2("Chuck Norris")
                }
            }
            gegner.angriffTief("Fuß Tritt")
            gegner.angriffHoch("Faust Schlag")
            gegner.verteidigungTief("Ausweichen")
            gegner.verteidigungHoch("Block")
            gegnerListeArcadeModus.add(gegner)
        }
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