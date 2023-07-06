
// erbt von der abstract Utils Basisklasse, ich überschreibe die abstrakten funktionen individuell aufs RPG Spiel abgestimmt
class RPG : Utils() {

    override fun spielStarten() {
        println("Spiel wird in kürze gestartet...")
        // Spiel-Logik

    }

    override fun spielSpeichern() {
        println("Spiel wird gespeichert. Coming soon...")
        auswahlSpiele()
    }

    override fun spielFortsetzen() {
        println("Spiel wird in kürze fortgesetzt...")
        auswahlSpiele()
    }

    override fun spielBeenden() {
        println("Spiel Beenden!")
        countdown(3)
        auswahlSpiele()
    }
}