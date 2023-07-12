import kotlin.random.Random

// Das ist eine open Basis Klasse, in der ich einen Defaultkonstruktor definiert habe und noch mehrere Konstruktoren damit kann ich in den Klassen DbzStoryModus und DbzArcadeModus
// einfach, Charaktere mit unterschiedlichen Eigenschaften und Parameter erstellen

open class Charakter(
    var name: String,
    var lP: Int,
    private var istBesiegt: Boolean = false
) {

    // 2er Konstruktor
    constructor(name: String, lP: Int, angriffHoch: String, verteidigungHoch: String) : this(name, lP, false) {
        // bei Bedarf könnte ich hier zusätzliche Parameter verarbeiten
    }

    // 3er Konstruktor
    constructor(
        name: String,
        lP: Int,
        angriffHoch: String,
        angriffTief: String,
        transformation: String
    ) : this(name, lP, false) {
    }

    // 4er Konstruktor
    constructor(
        name: String,
        lP: Int,
        angriffHoch: String,
        angriffTief: String,
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
        verteidigung: String,
        spezialFaehigkeit: String,
        transformation: String
    ) : this(name, lP, false) {
    }

    // 6er Konstruktor
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
    }

    // gemeinsame fun zum Erstellen und zurückgeben von Charakter-Objekten mit Name und LP und "istBesiegt" auf false
    open fun erstelleCharakter(): Charakter {
        return Charakter(name, lP,false)
    }

    //
    open fun angreifen(schaden: Int, angriff: String): String {
        return "$name  greift mit  $angriff  an!"
    }

    //
    open fun verteidigen(schaden: Int , verteidigung: String): String {
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
    open fun heilen(heilenWert: Int): String {
        return "$name  verwendet eine magische Bohne um sich zu Heilen!"
    }

    //
    open fun schadenErleiden(schaden: Int): String {
        return "$name  erleidet Schaden!"
    }
}

