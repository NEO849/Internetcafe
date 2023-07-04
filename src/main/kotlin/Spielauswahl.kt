
    // 1. eine funktion erstellt mit der der User eine Spielauswahl treffen kann, mit Schleife und Eingabe Überprüfung
fun spielAuswahl(): Unit {
    println("Wähle ein Spiel. (Zahl eingeben und Bestätigen)")
    println("1. RPG")
    println("2. Hangman")
    println("3. Casino")
    println("4. Exit")

    // versuche die Eingabe in eine Ganzzahl umzuwandeln, wenn dies klappt, wird die Zahl der variable tierart zugewiesen, ansonsten wird sie null und durch 0 ersetzt
    val spielAuswahl = readln()?.toIntOrNull() ?: 0

    return when (spielAuswahl) {
        1 -> {
            println("RPG-Spiel wird geladen...")
            Utils.countdown2(3)
        }

        2 -> {
            println("Hier Hangman Spiel")
        }

        3 -> {
            println("Hier Casino")
        }

        4 -> {
            println("EXIT")
        }

        else -> {
            println("Ungültige Eingabe! Bitte wähle eine Zahl zwischen 1 und 4.")
            spielAuswahl()
        }
    }
}
