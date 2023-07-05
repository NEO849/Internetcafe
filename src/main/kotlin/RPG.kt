
// erbt von der abstract Utils Basisklasse, ich überschreibe die abstrakten funktionen individuell aufs RPG Spiel abgestimmt,
// bevor ich sie in der funktion spielMenu aufrufe
class RPG :Utils() {

    //
    override fun menuImSpiel () {
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
                    countdown(3)
                    continue
                }
            }
        } while (index != 4)
    }

    override fun spielStarten(){
        println("Spiel wird in kürze gestartet...")
        countdown(3)}

    override fun spielSpeichern(){
        println("Spiel wird in kürze gestartet...")
    }

    override fun spielFortsetzen(){
        println("Spiel wird in kürze fortgesetzt...")
        countdown(3)}

    override fun spielBeenden(){
        println("Spiel Beenden!")
        countdown(3)}

}