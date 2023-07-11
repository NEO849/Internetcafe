
// ist eine open Basisklasse von der die Klassen Held und gegner erben sollen, jedoch name, lp und Status "istBesiegt" sollen nicht von aussen verändert werden können
// extra alle "var" und nicht "val" weil bei DBZ durch "Nahtoderfahrung","Magische Bohnen","Super Sayajin Mode" machen dies nötig um den Status unter dem Kampf zu aktualisieren

// default constructor, protected damit in den unterklassen darauf zugegriffen werden kann
open class Charakter(
    protected var name: String,
    var lP: Int,
    private var istBesiegt: Boolean = false,
) {

    // 2er Konstruktor
    constructor(name: String,lP: Int,angriff:String,verteidigung:String) :this (name, lP,false) {}

    // 3er Konstruktor
    constructor(name: String,lP: Int,angriff:String,verteidigung:String,spezialFaehigkeit:String) :this (name, lP,false) {}

    // 4er Konstruktor
    constructor(name: String,lP: Int,angriff:String,verteidigung:String,spezialFaehigkeit:String,transformation: String) :this (name, lP,false) {}

    // 5er Konstruktor
    constructor(
        name: String,
        lP: Int,
        angriffHoch:String,
        angriffTief:String,
        verteidigungHoch:String,
        verteidigungTief:String,
        spezialFaehigkeit:String,
        transformation:String,
        heilen:String
    ) :this (name, lP,false) {
        // hier kann ich die zusätzlichen Parameter verarbeiten
    }

    // gemeinsame fun zum Erstellen und zurückgeben von Charakter-Objekten mit Name und LP und "istBesiegt" auf false
    open fun erstelleCharakter():Charakter{
        return Charakter(name,lP)
    }

    // sind Platzhalter und werden in den Unterklassen überschrieben
    open fun charakterAusgeben(): String{
        return name
    }

    //
    open fun angreifen() {
        println("$name  greift an!")
    }

    //
    open fun verteidigen():String {
        return "$name  verteidigt sich!"
    }

    //
    open fun spezialFaehigkeit() {
        println("$name  setzt die Spezialfähigkeit ein!")
    }

    //
    open fun transformation() {
        println("$name  Transformiert sich!")
    }

    //
    open fun heilen(){
        println("$name  verwendet eine magische Bohne um sich zu Heilen!")
    }

    //
    open fun schadenErleiden(){
        println("$name  erleidet Schaden!")
    }

}

