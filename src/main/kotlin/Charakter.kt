
// ist eine open Basisklasse von der die Klassen Held und gegner erben sollen, jedoch name, lp und Status "istBesiegt" sollen nicht von aussen verändert werden können
// extra alle "var" und nicht "val" weil bei DBZ durch "Nahtoderfahrung","Magische Bohnen","Super Sayajin Mode" machen dies nötig um den Status unter dem Kampf zu aktualisieren
open class Charakter(
    protected var name: String,       // default constructor, protected damit in den unterklassen darauf zugegriffen werden kann
    protected var lP: Int,
    private var istBesiegt: Boolean = false,
) {

    // gemeinsame fun zum Erstellen und zurückgeben von Charakter-Objekten mit Name und LP und "istBesiegt" auf false
    open fun erstelleCharakter():Charakter{
        return Charakter(name,lP)
    }

    // sind Platzhalter und werden in den Unterklassen überschrieben
    open fun charakterAusgeben() {}

    //
    open fun schadenErleiden(){}

    //
    open fun angreifen() {}

    //
    open fun verteidigen() {}

    //
    open fun spezialAngriff() {}

    //
    open fun transformation1() {}

    //
    open fun transformation2() {}

    //
    open fun magischeBohnen(){}
}