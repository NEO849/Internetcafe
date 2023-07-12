// ist eine open Basisklasse von der die Klassen Held und gegner erben sollen, jedoch name, lp und Status "istBesiegt" sollen nicht von aussen verändert werden können
// extra alle "var" und nicht "val" weil bei DBZ durch "Nahtoderfahrung","Magische Bohnen","Super Sayajin Mode" machen dies nötig um den Status unter dem Kampf zu aktualisieren

// default constructor, protected damit in den unterklassen darauf zugegriffen werden kann
open class Charakter(
    var name: String,
    var lP: Int,
    private var istBesiegt: Boolean = false,
) {

    // 2er Konstruktor
    constructor(name: String, lP: Int, angriff: String, verteidigung: String) : this(name, lP, false) {}

    // 3er Konstruktor
    constructor(name: String, lP: Int, angriff: String, verteidigung: String, spezialFaehigkeit: String) : this(
        name,
        lP,
        false
    ) {
    }

    // 4er Konstruktor
    constructor(
        name: String,
        lP: Int,
        angriff: String,
        verteidigung: String,
        spezialFaehigkeit: String,
        transformation: String
    ) : this(name, lP, false) {
    }

    // 5er Konstruktor
    constructor(
        name: String,
        lP: Int,
        angriffHoch: String,
        angriffTief: String,
        verteidigungHoch: String,
        verteidigungTief: String,
        spezialFaehigkeit: String,
        transformation: String,
        heilen: String
    ) : this(name, lP, false) {
        // hier kann ich die zusätzlichen Parameter verarbeiten
    }

    // gemeinsame fun zum Erstellen und zurückgeben von Charakter-Objekten mit Name und LP und "istBesiegt" auf false
    open fun erstelleCharakter(): Charakter {
        return Charakter(name, lP)
    }

    //
    open fun angreifen(schaden: Int, angriff: String): String {
        return "$name  greift mit  $angriff  an!"
    }

    //
    open fun verteidigen(schaden: Int, verteidigung: String): String {
        return "$name  verteidigt sich mit  $verteidigung!!"
    }

    //
    open fun spezialFaehigkeit(schaden: Int, spezialFaehigkeit: String): String {
        return "$name  setzt die Spezialfähigkeit  $spezialFaehigkeit  ein!"
    }

    //
    open fun transformation(schaden: Int, spezialFaehigkeit: String): String {
        return "$name  Transformiert sich!"
    }

    //
    open fun heilen(schaden: Int): String {
        return "$name  verwendet eine magische Bohne um sich zu Heilen!"
    }

    //
    open fun schadenErleiden(schaden: Int): String {
        return "$name  erleidet Schaden!"
    }
}

