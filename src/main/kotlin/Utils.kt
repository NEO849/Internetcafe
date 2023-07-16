// Basisklasse (Werkzeugkiste)

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
    abstract fun menuImSpiel()

    // damit kann ich NUR die eine funktion direkt ohne Instanziierung mit punkt Notation aufrufen
    companion object {

        // Reset
        val reset = "\u001b[0m" // Text Reset

        // Regular Colors
        val black = "\u001b[0;30m" // BLACK
        val red = "\u001b[0;31m" // RED
        val green = "\u001b[0;32m" // GREEN
        val yellow = "\u001b[0;33m" // YELLOW
        val blue = "\u001b[0;34m" // BLUE
        val purple = "\u001b[0;35m" // PURPLE
        val cyan = "\u001b[0;36m" // CYAN
        val white = "\u001b[0;37m" // WHITE

        // Bold
        val blackBold = "\u001b[1;30m" // BLACK
        val reedBold = "\u001b[1;31m" // RED
        val greenBold = "\u001b[1;32m" // GREEN
        val yellowBold = "\u001b[1;33m" // YELLOW
        val blueBold = "\u001b[1;34m" // BLUE
        val purpleBold = "\u001b[1;35m" // PURPLE
        val cyanBold = "\u001b[1;36m" // CYAN
        val whiteBold = "\u001b[1;37m" // WHITE

        // Underline
        val blackUnderlined = "\u001b[4;30m" // BLACK
        val redUnderlined = "\u001b[4;31m" // RED
        val greenUnderlined = "\u001b[4;32m" // GREEN
        val yellowUnderlined = "\u001b[4;33m" // YELLOW
        val blueUnderlined = "\u001b[4;34m" // BLUE
        val purpleUnderlined = "\u001b[4;35m" // PURPLE
        val cyanUnderlined = "\u001b[4;36m" // CYAN
        val whiteUnderlined = "\u001b[4;37m" // WHITE

        // Background
        val blackBackground = "\u001b[40m" // BLACK
        val redBackground = "\u001b[41m" // RED
        val greenBackground = "\u001b[42m" // GREEN
        val yellowBackground = "\u001b[43m" // YELLOW
        val blueBackground = "\u001b[44m" // BLUE
        val purpleBackground = "\u001b[45m" // PURPLE
        val cyanBackground = "\u001b[46m" // CYAN
        val whiteBackground = "\u001b[47m" // WHITE

        // High Intensity
        val blackBright = "\u001b[0;90m" // BLACK
        val redBright = "\u001b[0;91m" // RED
        val greenBrighT = "\u001b[0;92m" // GREEN
        val yellowBright = "\u001b[0;93m" // YELLOW
        val blueBright = "\u001b[0;94m" // BLUE
        val purpleBright = "\u001b[0;95m" // PURPLE
        val cyanBright = "\u001b[0;96m" // CYAN
        val whiteBright = "\u001b[0;97m" // WHITE

        // Bold High Intensity
        val blackBoldBright = "\u001b[1;90m" // BLACK
        val redBoldBright = "\u001b[1;91m" // RED
        val greenBoldBright = "\u001b[1;92m" // GREEN
        val yellowBoldBright = "\u001b[1;93m" // YELLOW
        val blueBoldBright = "\u001b[1;94m" // BLUE
        val purpleBoldBright = "\u001b[1;95m" // PURPLE
        val cyanBoldBright = "\u001b[1;96m" // CYAN
        val whiteBoldBright = "\u001b[1;97m" // WHITE

        // High Intensity backgrounds
        val blackBackgroundBright = "\u001b[0;100m" // BLACK
        val redBackgroundBright = "\u001b[0;101m" // RED
        val greenBackgroundBright = "\u001b[0;102m" // GREEN
        val yellowBackgroundBright = "\u001b[0;103m" // YELLOW
        val blueBackgroundBright = "\u001b[0;104m" // BLUE
        val purpleBackgroundBright = "\u001b[0;105m" // PURPLE
        val cyanBackgroundBright = "\u001b[0;106m" // CYAN
        val whiteBackgroundBright = "\u001b[0;107m" // WHITE

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
        fun nummeriereObjekte(liste: List<String>): List<String> {
            return liste.mapIndexed { index, name -> "${index + 1}. $name" }
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
