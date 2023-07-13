// Bei diesem Aufbau sehr schnelle Implementierung, neuer Funktionen und neuer Spiele, etc
class AuswahlSpiele {

    // IV. hier ohne spezifischen Rückgabewert, da die "when" Kontrollstruktur die gewünschten Aktionen durchführt, ich finde so den Code "runder"
    fun auswahlSpiele() {
        println("\nWähle ein Spiel. (Zahl eingeben und Bestätigen)")
        println("${Farben.green}[1] Dragon Ball Z${Farben.reset}")
        println("[2] Hangman")
        println("[3] Casino")
        println("[4] Restaurant")
        println("[5] Exit")

        // versuche die Eingabe in eine Ganzzahl umzuwandeln, wenn dies klappt, wird die Zahl der variable "auswahlSpiele" zugewiesen, ansonsten wird sie "null", also durch 0 ersetzt und somit keine gültige Eingabe
        val auswahlSpiele = readln().toIntOrNull() ?: 0

        when (auswahlSpiele) {
            1 -> {
                // Instanziierung die Klasse DBZ und Aufruf vom "menuImSpiel", die Aus der Utils Klasse überschrieben worden sind, mit punkt-Notation nach print-Statement und countdown
                val dBZMenu = DBZ()
                println("\nDragon Ball Z wird geladen...\n")
                // Utils.countdown(3)
                dBZMenu.menuImSpiel()
            }

            2 -> {
                println("\nComing Soon... \"Hangman\"\n")
                // Utils.countdown(3)
                auswahlSpiele()
            }

            3 -> {
                // Instanziierung die Klasse Casino und Aufruf vom "menuImSpiel", die Aus der Utils Klasse überschrieben worden sind, mit punkt-Notation nach print-Statement und countdown
                val casinoMenu = Casino()
                println("Casino wird in kürze geladen...\n")
                // Utils.countdown(3)
                casinoMenu.menuImSpiel()
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