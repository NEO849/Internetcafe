
// erbt von Klasse Charakter
class Held(name: String, lP: Int) : Charakter(name, lP) {

    // hier werden miene Helden gespeichert und mit "protected" ist die Liste von der Klasse DBZ aus zugänglich
    private var heldenListeStoryModus = mutableListOf<Held>()

    private var heldenListeArcadeModus = mutableListOf<Held>()

    private var transformation1 :String = ""

    private var transformation2 :String = ""

    private var heldenListe :List<String> = listOf(
        "Son Goku",
        "Son Gohan",
        "Trunks",
        "Piccolo",
        "Krelin"
    )

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
    fun erstelleHeldenStoryModus(){
        for (name in heldenListe){
            val held = erstelleCharakter()
            held.setName(name)

            when (name) {
                "Son Goku" -> {
                    held.setLP(10000)
                    held.spezialFaehigkeit("Kamehameha")
                    held.setTransformation1("Super Saiyajin")
                    held.setTransformation2("Ultra Saiyajin")
                }
                "Son Gohan" -> {
                    held.setLP(7000)
                    held.spezialFaehigkeit("Masenko")
                    held.setTransformation1("Super Saiyajin")
                    held.setTransformation2("Ultimate Gohan")
                }
                "Trunks" -> {
                    held.setLP(7000)
                    held.spezialFaehigkeit("Burning Attack")
                    held.setTransformation1("Super Saiyajin")
                    held.setTransformation2("Super Saiyajin2")
                }
                "Piccolo" -> {
                    held.setLP(5000)
                    held.spezialFaehigkeit("Special Beam")
                    held.setTransformation1("Namekianer Fusion")
                    held.setTransformation2("Elder Namekianer")
                }
                "Krelin" -> {
                    held.setLP(2000)
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
        held.setName(name)
        held.setLP(lP)
        heldenListeArcadeModus.add(held)
    }

    // funktion zum Ausgeben der Helden in der Konsole
    override fun charakterAusgeben() {
        println("Helden:")
        for (held in heldenListeArcadeModus) {
            println(held.getName())
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
    override fun spezialFaehigkeit() {
        println("$name  setzt Spezialfähigkeit ein")
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