//
class Anmeldung {

    // III. Instanziierung der auswahlSpiele Funktion, aus der AuswahlSpiele Klasse
    private val auswahlSpieleKlasse = AuswahlSpiele()

    fun anmelden() {
        println("\nBereits Kunde? [${Utils.cyan}Ja${Utils.reset}/${Utils.yellow}Nein]${Utils.reset}")

        // ist es sinnvoll die readln ohne Hilfsvariable (in-line) zu nutzen?
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
        auswahlSpieleKlasse.auswahlSpiele()
    }

    private fun profilErstellen() {
        println("\nBitte Profil erstellen:")
        println("In Progress, coming Soon...")
        // Utils.countdown(3)
        // logik
        auswahlSpieleKlasse.auswahlSpiele()
    }
}