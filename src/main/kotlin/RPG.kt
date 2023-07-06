
// erbt von der abstract Utils Basisklasse, ich überschreibe die abstrakten funktionen individuell aufs RPG Spiel abgestimmt
class RPG : Utils() {

    // damit nur diese Klasse darauf Zugriff hat
    private val startAuswahl = StartAuswahl()

    override fun spielStarten() {
        println("Spiel wird in kürze gestartet...")
        countdown(3)
        // Spiel-Logik

    }

    override fun spielSpeichern() {
        println("Spiel wird in kürze gestartet...")
    }

    override fun spielFortsetzen() {
        println("Spiel wird in kürze fortgesetzt...")
        countdown(3)
    }

    override fun spielBeenden() {
        println("Spiel Beenden!")
        countdown(3)
        startAuswahl.startAuswahl()
    }

}