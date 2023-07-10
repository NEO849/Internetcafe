
// erbt von Klasse Charakter
class Held(name: String, lP: Int) : Charakter(name, lP) {

    // hier werden meine Helden gespeichert und mit "protected" ist die Liste von der Klasse DBZ aus zugänglich
    val heldenListeStoryModus: MutableList<Held> = mutableListOf()

    val heldenListeArcadeModus: MutableList<Held> = mutableListOf()

    private var spezialFaehigkeit :String = ""

    private var transformation1 :String = ""

    private var transformation2 :String = ""

    private var heldenListe :List<String> = listOf(
        "Son Goku",
        "Son Gohan",
        "Trunks",
        "Piccolo",
        "Krelin"
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

    override fun erstelleCharakter():Held {
        return Held(name, lP)
    }

    // so erstelle ich für jeden Helden individuelle Eigenschaften
    fun erstelleHeldenStoryModus(heldenListe: List<String>){
        for (name in heldenListe){
            val held = erstelleCharakter()
            held.name = name

            when (name) {
                "Son Goku" -> {
                    held.lP = 10000
                    held.spezialFaehigkeit("Kamehameha")
                    held.setTransformation1("Super Saiyajin")
                    held.setTransformation2("Ultra Saiyajin")
                }
                "Son Gohan" -> {
                    held.lP = 7000
                    held.spezialFaehigkeit("Masenko")
                    held.setTransformation1("Super Saiyajin")
                    held.setTransformation2("Ultimate Gohan")
                }
                "Trunks" -> {
                    held.lP = 7000
                    held.spezialFaehigkeit("Burning Attack")
                    held.setTransformation1("Super Saiyajin")
                    held.setTransformation2("Super Saiyajin2")
                }
                "Piccolo" -> {
                    held.lP = 5000
                    held.spezialFaehigkeit("Special Beam")
                    held.setTransformation1("Namekianer Fusion")
                    held.setTransformation2("Elder Namekianer")
                }
                "Krelin" -> {
                    held.lP = 2000
                    held.spezialFaehigkeit("Destructo Disk")
                    held.setTransformation1("Bigfoot")
                    held.setTransformation2("Chuck Norris")
                }
            }
            heldenListeStoryModus.add(held)
        }
    }

    // so erstelle ich Helden Objekte dynamisch aus einer Liste, gut wenn man viele, schnell erstellen möchte
    fun erstelleHeldenArcadeModus(namen: List<String>, lP: Int){
        val held = erstelleCharakter()
        held.name = namen.firstOrNull() ?:""
        held.lP = lP
        heldenListeArcadeModus.add(held)
    }

    // funktion zum Ausgeben der Helden in der Konsole
    override fun charakterAusgeben() {
        println("Helden:")
        for (held in heldenListeStoryModus) {
            println(held.name)
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