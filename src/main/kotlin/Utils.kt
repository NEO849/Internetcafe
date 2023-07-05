// ich definiere die Klasse "abstract" dadurch kann sie nicht direkt instanziiert werden, aber ich kann die funktionen
// erben lassen und sie in den abgeleiteten Klassen überschreiben und eine eigene Logik implementieren.
// Der code wird leichter zu Warten und Änderungen an der gemeinsamen Basis auf alle abgeleiteten Spiele übertragen wird, companion Object bleibt bestehen
abstract class Utils {

    // muss von einer Unterklasse individuell überschrieben werden, macht den Code lesbarer
    abstract fun menuImSpiel()

    //
    abstract fun spielSpeichern()

    //
    abstract fun spielFortsetzen()

    //
    abstract fun spielBeenden()

    //
    abstract fun spielStarten()

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