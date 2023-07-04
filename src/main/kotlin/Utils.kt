
    // hier steht "objekt" anstelle von "class", dadurch erstelle ich eine "Singleton-Instanz" dieser Klasse, das bedeutet,
    // das ich über den Namen der Klasse und punkt-Notation, die Funktionen aufrufen kann, ohne eine Instanz der Klasse erstellen zu müssen
    class Utils {

        // ermöglicht den Zugriff auf die Elemente/Funktionen einer Klasse, ohne dafür eine Instanz zu erstellen
        companion object {

            // solange x größer als "5" ist wird x um eins verkleinert und auf der Konsole ausgegeben und dies so lange bis x 0 ist
            fun countdown1(sekunden: Int) {
                var x = sekunden
                while (x > 0) {
                    print(x)
                    x = x - 1
                    Thread.sleep(1000)
                }
            }
            fun countdown2(sekunden: Int){
                var x = sekunden
                while(x > 0) {
                    print("\r ")                // mit "\r" setze ich den Cursor zur Anfangsposition der Zeile zurück, ohne Zeilenumbruch. mit ("  ") ersetze ich die zahl mit leerzeichen
                    Thread.sleep(500)
                    print("\r$x")               // wieder Cursor und aktuelle zahl anzeigen
                    Thread.sleep(1000)
                    x = x -1
                }
                print("\r ")                   // somit ersezte ich die letzte 1 auch mit einem leerzeichen
                println()                      // neue Zeile nach Countdown
            }
        }
    }