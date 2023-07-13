// erbt von der abstract "Utils" Basisklasse, ich überschreibe die abstrakten funktionen individuell aufs Casino Spiel abgestimmt
class Casino : Utils() {

    // V. Instanziierung der auswahlSpiele Funktion, aus der AuswahlSpiele Klasse, wenn Funktion "Beenden" fertig Implementiert ist, nach Beenden zurück ins AuswahlSpiele Menu
    private val auswahlSpiele = AuswahlSpiele()

    // ist eine abstrakte Funktion in der Utils Klasse, damit muss sie individuell Überschrieben werden, um sie aufzurufen
    override fun spielStarten() {
        println("\nWelchen Modus möchtest du Spielen?")
        println("[1] Hoch / Tief")
        println("[2] Roulette")
        println("[3] Poker")
        println("[4] Black Jack")
        println("[5] Exit")

        val auswahlModus = readln().toIntOrNull() ?: 0
        when (auswahlModus) {
            1 -> {
                startHochTief()
            }

            2 -> {
                println("\nComing Soon... \"Roulette\"\n")
                // Utils.countdown(3)
                spielStarten()
            }

            3 -> {
                println("\nComing Soon... \"Poker\"\n")
                // Utils.countdown(3)
                spielStarten()
            }

            4 -> {
                println("\nComing Soon... \"Black Jack\"\n")
                // Utils.countdown(3)
                spielStarten()
            }

            5 -> {
                menuImSpiel()                                       // befindet sich in der Utils Klasse
            }

            else -> {
                println("\nUngültige Eingabe! Ganzzahl eingeben.")
                spielStarten()
            }
        }
    }

    private fun startHochTief() {
        println("\nGlücksspiel Hoch/Tief wird in kürze geladen...")
        println()
        countdown(3)

        // Instanziierung der startHochTief Funktion aus der CasinoHochTief Klasse
        val hochTief = CasinoHochTief()
        hochTief.startHochTief()

        // wenn Story Modus beendet ist, wird Funktion "spielStarten" aufgerufen und wir gelangen ins DBZ Spiel Menu, sofern im storyModus nichts anderes definiert ist
        countdown(3)
        spielStarten()
    }



    override fun spielSpeichern() {
        println("\nSpiel wird gespeichert. Coming Soon...")
        // countdown(3)
        // hier irgendwann Logik, wenn Spiel gespeichert ist, wird funktion "spielFortsetzen" aufgerufen
        spielFortsetzen()
    }

    override fun spielFortsetzen() {
        println("\nSpiel wird in kürze fortgesetzt. Coming Soon...")
        // countdown(3)
        // hier irgendwann Logik, bei dem Aufbau sehr flexibel, steht noch nicht fest, ob nur "Pause", oder und "Fortsetzen"
        spielStarten()
    }

    // ich wollte das mal anders lösen und ohne ".toLowerCase", alle gültigen Eingaben sind in einer Liste gespeichert. Vorsicht ohne "break" Endlosschleife
    override fun spielBeenden() {
        val gueltigeEingaben = listOf("Ja", "JA", "ja", "jA", "Nein", "NEIN", "nein", "NeIn", "NeiN", "neiN", "niEN")
        while (true) {                                                // das erzeugt eine Endlosschleife, solange der User keine gültige Eingabe macht, läuft sie immer weiter bis zum "break" Befehl
            println("\nBeenden ohne zu Speichern? [Ja/Nein]")         // wenn richtige Eingabe durch "break" wird die Schleife verlassen
            val eingabe = readln()

            if (eingabe in gueltigeEingaben) {                        // ich überprüfe ob die Eingabe mit den gültigen Eingaben in der Liste übereinstimmen
                if (eingabe.equals("Ja", ignoreCase = true)
                ) {                                                   // wenn die Eingabe "ja" unabhängig von Groß/Klein, dann wird die Funktion "auswahlSpiele" aufgerufen,
                    println("\nSpiel wird Beendet.\n")
                    countdown(3)
                    auswahlSpiele.auswahlSpiele()
                } else {                                             // andernfalls ist die Eingabe also nicht ja, sondern ein anderes gültiges Wort wie "nein", dann wird die Funktion "spieleSpeichern" aufgerufen
                    spielSpeichern()
                }
                break                                                // Schleife wird beendet, da eine gültige Eingabe erfolgt ist
            } else {
                println("\nUngültige Eingabe! Bitte `Ja´ oder ´Nein´ eingeben.")
            }                                                        // weil ich im else Block keine Bedingung oder weiter eine Überprüfung vornehme, wird "break" benötigt um die Schleife zu verlassen,
        }                                                            // so ist das aber gewollt, das die Schleife wieder beginnt bei ungültiger Eingabe
    }
}