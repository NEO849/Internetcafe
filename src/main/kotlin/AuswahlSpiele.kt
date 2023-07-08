
//
class AuswahlSpiele {

    // hier ohne spezifischen Rückgabewert, da die "when" Kontrollstruktur die gewünschten Aktionen durchführt, ich finde so den Code "runder"
    fun auswahlSpiele() {
        println("\nWähle ein Spiel. (Zahl eingeben und Bestätigen)")
        println("${Farben.green}1. RPG${Farben.reset}")
        println("2. Hangman")
        println("3. Casino")
        println("4. Restaurant")
        println("5. Exit")

        // versuche die Eingabe in eine Ganzzahl umzuwandeln, wenn dies klappt, wird die Zahl der variable "auswahlSpiele" zugewiesen, ansonsten wird sie "null", also durch 0 ersetzt und somit keine gültige Eingabe
        val auswahlSpiele = readln().toIntOrNull() ?: 0

        when (auswahlSpiele) {
            1 -> {
                // Instanziierung von der Klasse RPG und Aufruf vom "menuImSpiel" mit punkt-Notation nach print-Statement und countdown
                val rpgMenu = RPG()
                println("RPG-Spiel wird in kürze geladen...\n")
                Utils.countdown(3)
                rpgMenu.menuImSpiel()
            }

            2 -> {
                println("Coming Soon... \"Hangman\"\n")
                //Utils.countdown(3)
                auswahlSpiele()
            }

            3 -> {
                println("Coming Soon... \"Casino\"\n")
                //Utils.countdown(3)
                auswahlSpiele()
            }

            4 -> {
                println("Coming Soon... \"Restaurant\"\n")
                //Utils.countdown(3)
                auswahlSpiele()
            }

            5 -> {
                println("Coming Soon... Auf Wiedersehen\n")
                //Utils.countdown(3)
                auswahlSpiele()                      // evtl. wenn ich Zeit hab, zurück zum Eingang vom "Internet-Cafe"
            }

            else -> {
                println("Ungültige Eingabe! Bitte wähle eine Zahl zwischen 1 und 4.\n")
                //Utils.countdown(3)
                auswahlSpiele()
            }
        }
    }
}