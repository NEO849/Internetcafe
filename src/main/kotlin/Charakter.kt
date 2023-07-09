
// ist eine open Basisklasse von der die Klassen Held und gegner erben sollen, jedoch name, lp und Status "istBesiegt" sollen nicht von aussen verändert werden können
// extra alle "var" und nicht "val" weil bei DBZ durch "Nahtoderfahrung","Magische Bohnen","Super Sayajin Mode" machen dies nötig um den Status unter dem Kampf zu aktualisieren
open class Charakter(
    private var name: String,       // default constructor
    private var lP: Int,
    private var istBesiegt: Boolean = false
) {
    private  val heldenListe = mutableListOf<Charakter>()
    private  var charakterCounter = 0

    init{
        charakterCounter ++
        name = "$charakterCounter, $name"
    }

    // ich nutze "getter" um den "Wert" von ausserhalb zu lesen und zurückzugeben, so kann ich den "Wert" einfach für Logiken nutzen, ohne das von aussen darauf zugegriffen werden kann
    fun getName(): String {
        return name
    }

    fun getLP(): Int {
        return lP
    }

    fun getIstBesiegt(): Boolean {
        return istBesiegt
    }

    // dadurch stelle ich sicher, dass die schreibgeschützten var nur unter meinen kontrollierten Bedingungen verändert werden
    fun setName(neuerName: String) {
        name = neuerName
    }

    fun setLP(neueLP: Int) {
        lP = neueLP
    }

    protected fun erstelleCharakter (name:String, lP:Int):Charakter{
        val charakter = Charakter(name, lP)
        heldenListe.add(charakter)
        return charakter
    }

    // methode zum Erleiden von Schaden
    protected fun schadenErleiden(schaden: Int) {
        lP -= schaden
        if (lP <= 0) {
            lP = 0
            istBesiegt = true
            println("$name  ist K.O!!!")
        }
    }

    fun heldenAusgeben():List<Charakter>{
        return heldenListe
    }

    // sind Platzhalter und werden in den Unterklassen überschrieben
    open fun angreifen() {}

    //
    open fun verteidigen() {}

    //
    open fun spezielleFaehigkeiten() {}

}