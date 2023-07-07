

class Anmeldung {

    private val auswahlSpiele = AuswahlSpiele()

    fun anmelden() {
        println("Bereits Kunde? [Ja/Nein]")
        when (readln()?.lowercase()) {
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
        // logik
        auswahlSpiele.auswahlSpiele()
    }

    private fun profilErstellen() {
        println("\nBitte Profil erstellen:")
        // logik
        auswahlSpiele.auswahlSpiele()
    }
}