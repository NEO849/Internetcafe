


// eine funktion erstellt mit der, der User eine Spielauswahl treffen kann, mit Schleife und Eingabe Überprüfung
class StartAuswahl {
    fun startAuswahl() {
        println("Wähle ein Spiel. (Zahl eingeben und Bestätigen)")
        println("1. RPG")
        println("2. Hangman")
        println("3. Casino")
        println("4. Exit")

        // versuche die Eingabe in eine Ganzzahl umzuwandeln, wenn dies klappt, wird die Zahl der variable tierart zugewiesen, ansonsten wird sie null und durch 0 ersetzt
        val startAuswahl = readln().toIntOrNull() ?: 0

        return when (startAuswahl) {
            1 -> {
                // Instanziierung von der Klasse RPG und Aufruf vom "menuImSpiel" mit punkt-Notation nach print-Statement und countdown
                val rpgMenu = RPG()
                println("RPG-Spiel wird in kürze geladen...")
                Utils.countdown(3)
                rpgMenu.menuImSpiel()
            }

            2 -> {
                println("Hier Hangman Spiel, noch in Arbeit. Coming Soon...")
                Utils.countdown(3)
                startAuswahl()
            }

            3 -> {
                println("Hier Casino, noch in Arbeit. Coming Soon...")
                Utils.countdown(3)
                startAuswahl()
            }

            4 -> {
                println("EXIT")
                Utils.countdown(3)
                startAuswahl()                      // evtl. wenn ich Zeit hab, zurück zum Eingang vom "Internet-Cafe"
            }

            else -> {
                println("Ungültige Eingabe! Bitte wähle eine Zahl zwischen 1 und 4.")
                startAuswahl()
            }
        }
    }
}