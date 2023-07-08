
//
class Internetcafe {

    // dadurch kann nicht direkt von anderen Klassen oder Objekten darauf zugegriffen werden
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