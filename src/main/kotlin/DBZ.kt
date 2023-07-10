
// erbt von der abstract "Utils" Basisklasse, ich überschreibe die abstrakten funktionen individuell aufs RPG Spiel abgestimmt
open class DBZ : Utils() {

    private val auswahlSpiele = AuswahlSpiele()
    private val held  = Held("",0)    // Instanziierung von der Held Klasse
    private val gegner  = Gegner("",0)    // Instanziierung von der Held Klasse

    override fun spielStarten() {
        println("\nWelchen Modus möchtest du Spielen?")
        println("[1] Story Mode")
        println("[2] Arcade Mode")
        println("[3] Exit")

        val auswahlModus = readln().toIntOrNull() ?: 0
        when (auswahlModus) {
            1 -> {
                startStoryModus()
            }
            2 -> {
                startArcadeModus()
            }
            3 -> {
                menuImSpiel()
            }
            else -> {
                println("Ungültige Eingabe! Ganzzahl eingeben.")
                spielStarten()
            }
        }
    }

    private fun startStoryModus(){
        println("Story Modus wird geladen...")
        //countdown(3)
        spielStarten()
    }

    private fun startArcadeModus(){
        println("\nArcade Mode wird geladen...")
        // countdown(3)
        println("\nWähle deinen Kämpfer...")

        val heldenListe = held.erstelleArcadeModus()
        val gegnerListe = gegner.erstelleArcadeModus()
        val alleCharaktere = heldenListe + gegnerListe
        println("$alleCharaktere")

//        held.erstelleArcadeModus()
//        held.charakterAusgeben()
//        gegner.erstelleArcadeModus()
//        gegner.charakterAusgeben()

    }

    override fun spielSpeichern() {
        println("\nSpiel wird gespeichert. Coming Soon...")
        //countdown(3)
        // Logik
        auswahlSpiele.auswahlSpiele()
    }

    override fun spielFortsetzen() {
        println("\nSpiel wird in kürze fortgesetzt. Coming Soon...")
        //countdown(3)
        // Logik
        auswahlSpiele.auswahlSpiele()
    }

    // ich wollte das mal anders lösen und ohne ".toLowerCase", alle gültigen Eingaben sind in einer Liste gespeichert. Vorsicht ohne "break" Endlosschleife
    override fun spielBeenden() {
        val gueltigeEingaben = listOf("Ja", "JA", "ja", "jA", "Nein", "NEIN", "nein", "NeIn", "NeiN", "neiN", "niEN")
        while (true) {                                                // das erzeugt eine Endlosschleife, solange der User keine gültige Eingabe macht, läuft sie immer weiter bis zum "break" Befehl
            println("\nBeenden ohne zu Speichern? [Ja/Nein]")        // wenn richtige Eingabe durch "break" wird die Schleife verlassen
            val eingabe = readln()

            if (eingabe in gueltigeEingaben) {                       // ich überprüfe ob die Eingabe mit den gültigen Eingaben in der Liste übereinstimmen
                if (eingabe.equals(
                        "Ja",
                        ignoreCase = true
                    )
                ) {   // wenn die Eingabe "ja" unabhängig von Groß/Klein, dann wird die Funktion "auswahlSpiele" aufgerufen,
                    println("\nSpiel wird Beendet.")
                    //countdown(3)
                    auswahlSpiele.auswahlSpiele()
                } else {                                            // andernfalls ist die Eingabe also nicht ja, sondern ein anderes gültiges Wort wie "nein", dann wird die Funktion "spieleSpeichern" aufgerufen
                    spielSpeichern()
                }
                break                                               // Schleife wird beendet, da eine gültige Eingabe erfolgt ist
            } else {
                println("\nUngültige Eingabe! Bitte `Ja´ oder ´Nein´ eingeben.") // weil ich im else Block keine Bedingung oder weiter eine Überprüfung vornehme, wird "break" benötigt um die Schleife zu verlassen,
            }                                                                    // so ist das aber gewollt, das die Schleife wieder beginnt bei ungültiger Eingabe
        }
    }
}