// Bei diesem Aufbau sehr schnelle Implementierung, neuer Funktionen und neuer Spiele, etc
class AuswahlSpiele {

    // IV. hier ohne spezifischen Rückgabewert, da die "when" Kontrollstruktur die gewünschten Aktionen durchführt, ich finde so den Code "runder"
    fun auswahlSpiele() {
        println("\nWähle ein Spiel. (Zahl eingeben und Bestätigen)")
        println("${Utils.cyan}[1] Casino${Utils.reset}")
        println("${Utils.cyan}[2] Dragon Ball Z${Utils.reset}")
        println("${Utils.yellow}[3] Hangman${Utils.reset}")
        println("${Utils.yellow}[4] Restaurant${Utils.reset}")
        println("${Utils.purple}[5] Exit${Utils.reset}")

        // versuche die Eingabe in eine Ganzzahl umzuwandeln, wenn dies klappt, wird die Zahl der variable "auswahlSpiele" zugewiesen, ansonsten wird sie "null", also durch 0 ersetzt und somit keine gültige Eingabe
        val auswahlSpieler = readln().toIntOrNull() ?: 0

        when (auswahlSpieler) {
            1 -> {
                // Instanziierung die Klasse Casino und Aufruf vom "menuImSpiel", die Aus der Utils Klasse überschrieben worden sind, mit punkt-Notation nach print-Statement und countdown
                val casinoKlasse = Casino()
                println("Casino wird in kürze geladen...\n")
                // Utils.countdown(3)
                casinoKlasse.spielStarten()
            }

            2 -> {
                // Instanziierung die Klasse DBZ und Aufruf vom "menuImSpiel", die Aus der Utils Klasse überschrieben worden sind, mit punkt-Notation nach print-Statement und countdown
                val dbzKlasse = DBZ()
                println("\nDragon Ball Z wird geladen...")
                // Utils.countdown(3)
                dbzKlasse.spielStarten()                           // über DBZ rufe ich die fun menuImSpiel aus der Utils Klasse auf
            }

            3 -> {
                println("\nComing Soon... \"Hangman\"\n")
                // Utils.countdown(3)
                auswahlSpiele()
            }

            4 -> {
                println("\nComing Soon... \"Restaurant\"\n")
                // Utils.countdown(3)
                auswahlSpiele()
            }

            5 -> {
                println("\nComing Soon... Auf Wiedersehen\n")
                // Utils.countdown(3)
                auswahlSpiele()
            }

            else -> {
                println("\nUngültige Eingabe! Bitte wähle eine Zahl zwischen 1 und 5.\n")
                // Utils.countdown(3)
                auswahlSpiele()
            }
        }
    }
}