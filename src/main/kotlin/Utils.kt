// hier 3 Methodenaufrufe

// mit dem Key abstract können methoden nicht direkt Instanziiert werden, sondern zuerst überschrieben werden,
// der code wird leichter zu Warten und Änderungen an der gemeinsamen Basis werden auf alle abgeleiteten Spiele übertragen,
// normaler Methodenaufruf ist weiterhin möglich, wenn man abstract entfernt,
// companion Object bleibt auch bestehen und ermöglicht den Aufruf ohne Instanz, sondern direkt über den Namen
// protected, ermöglicht den Zugriff nur hier und in den abgeleiteten Klassen
abstract class Utils {

    // muss von einer Unterklasse individuell überschrieben werden, macht den Code lesbarer
    abstract fun spielStarten()
    abstract fun spielSpeichern()
    abstract fun spielFortsetzen()
    abstract fun spielBeenden()

    // die Klammern {} was normal hinter "while" stehen stehen jetzt davor (mit do), das bedeutet das das Menu auf
    // jeden Fall angezeigt wird und dann wird erst überprüft was der User eingegeben hat
    fun menuImSpiel() {
        var index = 0
        do {
            println("Menu")
            println("[1] Spiel Starten")
            println("[2] Spiel Speichern")
            println("[3] Spiel Fortsetzen")
            println("[4] Spiel Beenden")
            index = readln().toIntOrNull() ?: 0

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

    // damit kann ich NUR die eine funktion direkt ohne Instanziierung mit punkt Notation aufrufen
    companion object {
        fun countdown(sekunden: Int) {
            var x = sekunden
            while (x > 0) {
                print("\r  ")                // mit "\r" setze ich den Cursor zur Anfangsposition der Zeile zurück, ohne Zeilenumbruch. mit ("  ") ersetze ich die zahl mit leerzeichen
                Thread.sleep(500)
                print("\r$x")               // wieder Cursor und aktuelle zahl anzeigen
                Thread.sleep(1000)
                x -= 1                     // das gleiche wie "x = x -1"
            }
            print("\r ")                   // somit ersetze ich die letzte 1 auch mit einem leerzeichen
            println()                      // neue Zeile nach Countdown
        }

        // fun um übergebene Listen/Elemente zu nummerieren
        fun nummeriereObjekte(liste:List<String>): List<String> {
            return liste.mapIndexed { index,name -> "${index + 1}. $name"}
        }

        fun countdownPrint(sekunden: Int): Int { // hier mit Rückgabewert, dadurch individuellere Print Statement Ausgaben
            var x = sekunden
            while (x > 0) {
                print("\r  ")                // mit "\r" setze ich den Cursor zur Anfangsposition der Zeile zurück, ohne Zeilenumbruch. mit ("  ") ersetze ich die zahl mit leerzeichen
                Thread.sleep(500)
                print("\r$x")               // wieder Cursor und aktuelle zahl anzeigen
                Thread.sleep(1000)
                x -= 1
            }
            print("\r ")                   // somit ersetze ich die letzte 1 auch mit einem leerzeichen
            println()                      // neue Zeile nach Countdown
            return sekunden
        }

        fun clear(zeilen: Int) {
            repeat(zeilen) {
                print("\r" + " ".repeat(80))  // 80 Leerzeichen für gewünschte Konsolen breite
                Thread.sleep(500)
            }
            println()  // Neue Zeile am Ende, um den Cursor in die nächste Zeile zu setzen
        }
    }
}
