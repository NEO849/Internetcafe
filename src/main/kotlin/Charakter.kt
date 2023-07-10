
// ist eine open Basisklasse von der die Klassen Held und gegner erben sollen, jedoch name, lp und Status "istBesiegt" sollen nicht von aussen verändert werden können
// extra alle "var" und nicht "val" weil bei DBZ durch "Nahtoderfahrung","Magische Bohnen","Super Sayajin Mode" machen dies nötig um den Status unter dem Kampf zu aktualisieren
open class Charakter(
    protected var name: String,       // default constructor, protected damit in den unterklassen darauf zugegriffen werden kann
    protected var lP: Int,
    private var istBesiegt: Boolean = false,
) {

    // ich nutze "getter" um den "Wert" von ausserhalb zu lesen und zurückzugeben, so kann ich den "Wert" einfach für Logiken nutzen, ohne das von aussen darauf zugegriffen werden kann
    fun getLP(): Int {
        return lP
    }

    //
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

    //
    fun setIstBesiegt(neuerStatus :Boolean) {
        istBesiegt = neuerStatus
    }

    // gemeinsame fun zum Erstellen und zurückgeben von Charakter-Objekten mit Name und LP und "istBesiegt" auf false
    open fun erstelleCharakter():Charakter{
        return Charakter(name,lP)
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

    // sind Platzhalter und werden in den Unterklassen überschrieben
    open fun charakterAusgeben() {}

    //
    open fun angreifen() {}

    //
    open fun verteidigen() {}

    //
    open fun spezialFaehigkeit() {}

    //
    open fun transformation1() {}

    //
    open fun transformation2() {}

    //
    open fun magischeBohnen(){}
}