
// ist eine open Basisklasse von der die Klassen Held und gegner erben sollen
open class Charakter(val name: String, var lP: Int) {

    // am Anfang ist Charakter natürlich am Leben, deshalb false, so kann ich im Spiel überprüfen, ob Charakter noch am Leben ist und entsprechend handeln
    private var istBesiegt = false

    // methode zum Erleiden von Schaden
    open fun schadenErleiden(schaden: Int) {
        lP -= schaden
        if (lP <= 0) {
            lP = 0
            istBesiegt = true
            println("$name  ist K.O!!!")
        }
    }

    // sind Platzhalter und werden in den Unterklassen überschrieben
    open fun angreifen() {}

    //
    open fun verteidigen() {}

    //
    open fun spezielleFaehigkeiten() {}

}