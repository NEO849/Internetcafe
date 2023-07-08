
// ist eine open Basisklasse von der die Klassen Held und gegner erben sollen, jedoch name, lp und Status "istBesiegt" sollen nicht von aussen verändert werden können
// extra alle "var" und nicht "val" weil bei DBZ durch "Nahtoderfahrung","Magische Bohnen","Super Sayajin Mode" machen dies nötig um den Status unter dem Kampf zu aktualisieren
open class Charakter(
    private var name: String,       // default constructor
    private var lP: Int,
    private var istBesiegt: Boolean = false
) {

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

    // fun nimmt zwei Parameter entgegen, "namen" die aus einer Liste aus "Strings" besteht und "lP" die Lebenspunkte als Ganzzahl, Rückgabewert ist eine Liste aus Charakteren
    fun erstelleCharaktere(namen: List<String>, lP: Int): List<Charakter> {
        val charaktere = mutableListOf<Charakter>()                         // eine leere Liste um die erstellten Charaktere zu Speichern
        for (name in namen) {                                               // für jedes Element in der Liste wird ein Objekt mit Name und lp erstellt
            val charakter = Charakter(name, lP)                             // und in "charakter" gespeichert
            charaktere.add(charakter)                                       // dann mit add zur Liste "Charaktere" hinzugefügt
        }
        return charaktere                                                   // nachdem alle Elemente in der Liste "namen" verarbeitet wurden, wird die Liste mit namen und lp der Charakter zurückgegeben
    }

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