//
class Anmeldung {

    // III. Instanziierung der auswahlSpiele Funktion, aus der AuswahlSpiele Klasse
    private val auswahlSpiele = AuswahlSpiele()

    fun anmelden() {
        println("\nBereits Kunde? [${Utils.cyan}Ja${Utils.reset}/${Utils.yellow}Nein]${Utils.reset}")
        when (readln().lowercase()) {
            "ja" -> einloggen()
            "nein" -> profilErstellen()
            else -> {
                println("\nUngültige Eingabe!")
                anmelden()
            }
        }
    }

    private fun einloggen() {
        println("\nBitte Einloggen:")
        println("In Progress, coming Soon...")
        // Utils.countdown(3)
        // logik
        auswahlSpiele.auswahlSpiele()
    }

    private fun profilErstellen() {
        println("\nBitte Profil erstellen:")
        println("In Progress, coming Soon...")
        // Utils.countdown(3)
        // logik
        auswahlSpiele.auswahlSpiele()
    }
}