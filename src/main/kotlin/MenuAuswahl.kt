
// "open" damit ich die Funktionen und Eigenschaften vererben kann, z.B. wenn mehrere Spiele zur Auswahl stehen, dann vererbe ich die fun und ändere sie ab
open class MenuAuswahl {

    // funktion um Spiel beenden
    fun spielBeenden() {
        println("Spiel wird beendet! In Progress...")
        Utils.countdown2(3)
    }

    // funktion um Spielstand zu speichern
    fun spielSpeichern(){
        println("Spielstand wird Gespeichert. In Progress...")
        Utils.countdown2(3)
    }
}