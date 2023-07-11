

class Anmeldung {

    private val auswahlSpiele = AuswahlSpiele()

    fun anmelden() {
        println("\nBereits Kunde? [Ja/Nein]")
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
        //Utils.countdown(3)
        // logik
        auswahlSpiele.auswahlSpiele()
    }

    private fun profilErstellen() {
        println("\nBitte Profil erstellen:")
        println("In Progress, coming Soon...")
        //Utils.countdown(3)
        // logik
        auswahlSpiele.auswahlSpiele()
    }
}