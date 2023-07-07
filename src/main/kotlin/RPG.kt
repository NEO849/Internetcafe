
// erbt von der abstract Utils Basisklasse, ich überschreibe die abstrakten funktionen individuell aufs RPG Spiel abgestimmt
class RPG : Utils() {

    override fun spielStarten() {
        println("Spiel wird in kürze gestartet...")
        // Spiel-Logik

    }

    override fun spielSpeichern() {
        println("Spiel wird gespeichert. Coming Soon...")
        auswahlSpiele()
        // Logik
    }

    override fun spielFortsetzen() {
        println("Spiel wird in kürze fortgesetzt. Coming Soon...")
        countdown(3)
        auswahlSpiele()
        // Logik
    }

    override fun spielBeenden() {
        println("Beenden ohne zu Speichern? [Ja/Nein]")
        val index = readln()
        if (index == "Nein"){
            spielSpeichern()
        } else {
            println("Spiel wird Beendet...")
            countdown(3)
            auswahlSpiele()
        }
    }
}