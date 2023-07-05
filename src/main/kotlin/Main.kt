
// Globale variable, erleichtert den Aufruf erheblich und bei fun countdown, nicht so essenziell
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

fun main(){
    
    startAuswahl()


}