//
class Internetcafe {

    // Ich Instanziiere die Funktion "anmelden" aus der erbenden Klasse "anmeldung"
    // "private" dadurch kann nicht direkt von anderen Klassen oder Objekten darauf zugegriffen werden
    private val anmeldung = Anmeldung()
    fun eingang() {
        println("\nWillkommen im Internetcafe.")
        anmeldung.anmelden()

    }

    // evtl, "Ausgang", exit, sequenz...
    fun ausgang() {
        println("\nAuf Wiedersehen...")
    }
}