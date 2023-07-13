//
class Internetcafe {

    // II. Ich Instanziiere die Funktion "anmelden" aus der erbenden Klasse "anmeldung"
    // "private" dadurch kann nicht direkt von anderen Klassen oder Objekten darauf zugegriffen werden
    private val anmeldung = Anmeldung()
    fun eingang() {
        println("\nWillkommen im Internetcafe.")

        // hier kann ich unkompliziert die Funktionen erweitern...

        anmeldung.anmelden()
    }

    // evtl, "Ausgang", exit, sequenz...
    fun ausgang() {
        println("\nAuf Wiedersehen...")
        println("... hier dann Exit Sequenz, etc...")

        // hier kann ich unkompliziert die Funktionen erweitern...

        anmeldung.anmelden()
    }
}