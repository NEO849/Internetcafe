// hier 3 Methodenaufrufe

// mit dem Key abstract können methoden nicht direkt Instanziiert werden, sondern zuerst überschrieben werden,
// der code wird leichter zu Warten und Änderungen an der gemeinsamen Basis werden auf alle abgeleiteten Spiele übertragen,
// normaler Methodenaufruf ist weiterhin möglich, wenn man abstract entfernt,
// companion Object bleibt auch bestehen und ermöglicht den Aufruf ohne Instanz, sondern direkt über den Namen
// protected, ermöglicht den Zugriff nur hier und in den abgeleiteten Klassen
abstract class Utils {

    // muss von einer Unterklasse individuell überschrieben werden, macht den Code lesbarer
    abstract fun spielSpeichern()

    //
    abstract fun spielFortsetzen()

    //
    abstract fun spielBeenden()

    //
    abstract fun spielStarten()

    //
    protected fun menuImSpiel () {
        var index = 0
        do {
            println("Menu")
            println("1. Spiel Starten")
            println("2. Spiel Speichern")
            println("3. Spiel Fortsetzen")
            println("4. Spiel Beenden")
            index = readln().toIntOrNull() ?:0

            when (index) {
                1 -> spielStarten()
                2 -> spielSpeichern()
                3 -> spielFortsetzen()
                4 -> spielBeenden()
                else -> {
                    println("Ungültige Eingabe, bitte eine Zahl zwischen 1 und 4 eingeben!")
                    //countdown(3)
                    continue
                }
            }
        } while (index != 4)
    }

    fun auswahlSpiele() {
        println("Wähle ein Spiel. (Zahl eingeben und Bestätigen)")
        println("1. RPG")
        println("2. Hangman")
        println("3. Casino")
        println("4. Restaurant")
        println("5. Exit")

        // versuche die Eingabe in eine Ganzzahl umzuwandeln, wenn dies klappt, wird die Zahl der variable tierart zugewiesen, ansonsten wird sie null und durch 0 ersetzt
        val auswahlSpiele = readln().toIntOrNull() ?: 0

        when (auswahlSpiele) {
            1 -> {
                // Instanziierung von der Klasse RPG und Aufruf vom "menuImSpiel" mit punkt-Notation nach print-Statement und countdown
                val rpgMenu = RPG()
                println("RPG-Spiel wird in kürze geladen...")
                //countdown(3)
                rpgMenu.menuImSpiel()
            }

            2 -> {
                println("Coming Soon... \"Hangman\"")
                //countdown(3)
                auswahlSpiele()
            }

            3 -> {
                println("Coming Soon... \"Casino\"")
                //countdown(3)
                auswahlSpiele()
            }

            4 -> {
                println("Coming Soon... \"Restaurant\"")
                //countdown(3)
                auswahlSpiele()
            }

            5 -> {
                println("Auf Wiedersehen")
                //countdown(3)
                auswahlSpiele()                      // evtl. wenn ich Zeit hab, zurück zum Eingang vom "Internet-Cafe"
            }

            else -> {
                println("Ungültige Eingabe! Bitte wähle eine Zahl zwischen 1 und 4.")
                //countdown(3)
                auswahlSpiele()
            }
        }
    }

    // damit kann ich NUR die eine funktion direkt ohne Instanziierung mit punkt Notation aufrufen
    companion object {
        fun countdown(sekunden: Int) {
            var x = sekunden
            while (x > 0) {
                print("\r  ")                // mit "\r" setze ich den Cursor zur Anfangsposition der Zeile zurück, ohne Zeilenumbruch. mit ("  ") ersetze ich die zahl mit leerzeichen
                Thread.sleep(500)
                print("\r$x")               // wieder Cursor und aktuelle zahl anzeigen
                Thread.sleep(1000)
                x = x - 1
            }
            print("\r ")                   // somit ersezte ich die letzte 1 auch mit einem leerzeichen
            println()                      // neue Zeile nach Countdown
        }
    }
}