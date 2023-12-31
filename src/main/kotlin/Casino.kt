// erbt von der abstract "Utils" Basisklasse, ich überschreibe die abstrakten funktionen individuell aufs Casino Spiel abgestimmt
class Casino : Utils() {

    // ist eine abstrakte Funktion in der Utils Klasse, damit muss sie individuell Überschrieben werden, um sie aufzurufen
    override fun spielStarten() {
        println("\nWelches Spiel möchtest du Spielen?")
        println("${Utils.cyan}[1] Hoch / Tief${Utils.reset}")
        println("${Utils.yellow}[2] Roulette")
        println("${Utils.yellow}[3] Poker")
        println("${Utils.yellow}[4] Black Jack")
        println("${Utils.purple}[5] Beenden${Utils.reset}")

        val auswahlModus = readln().toIntOrNull() ?: 0
        when (auswahlModus) {
            1 -> {
                menuImSpiel()
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
                spielBeenden()
            }

            else -> {
                println("\nUngültige Eingabe! Ganzzahl eingeben.")
                spielStarten()
            }
        }
    }

    // die Klammern {} was normal hinter "while" steht, steht jetzt davor (mit do), das bedeutet, dass das Menu auf
    // jeden Fall angezeigt wird und dann wird erst überprüft, was der User eingegeben hat
    override fun menuImSpiel() {
        var index: Int
        do {
            println("Menu")
            println("$cyan[1] Spiel Starten$reset")
            println("$yellow[2] Spiel Speichern$reset")
            println("$yellow[3] Spiel Fortsetzen$reset")
            println("$cyan[4] Spiel Beenden$reset")
            index = readln().toIntOrNull() ?: 0

            when (index) {
                1 -> {
                    val casioHochTief = CasinoHochTief()
                    casioHochTief.startHochTief()
                }

                2 -> spielSpeichern()
                3 -> spielFortsetzen()
                4 -> spielBeenden()
                else -> {
                    println("Ungültige Eingabe, bitte eine Zahl zwischen 1 und 4 eingeben!")
                    //countdown(3)
                    continue
                }
            }
        } while (index != 4)
    }

    override fun spielSpeichern() {
        println("\nSpiel wird gespeichert. Coming Soon...")
        // countdown(3)
        // hier irgendwann Logik, wenn Spiel gespeichert ist, wird funktion "spielFortsetzen" aufgerufen
        spielStarten()
    }

    override fun spielFortsetzen() {
        println("\nSpiel wird in kürze fortgesetzt. Coming Soon...")
        // countdown(3)
        // hier irgendwann Logik, bei dem Aufbau sehr flexibel, steht noch nicht fest, ob nur "Pause", oder und "Fortsetzen"
        spielStarten()
    }

    // ich wollte das mal anders lösen und ohne ".toLowerCase", alle gültigen Eingaben sind in einer Liste gespeichert. Vorsicht ohne "break" Endlosschleife
    override fun spielBeenden() {

        // Instanziierung der auswahlSpiele Funktion, aus der AuswahlSpiele Klasse, wenn Funktion "Beenden" fertig Implementiert ist, nach Beenden zurück ins AuswahlSpiele Menu
        val auswahlSpieleKlasse = AuswahlSpiele()

        val gueltigeEingaben = listOf("Ja", "JA", "ja", "jA", "Nein", "NEIN", "nein", "NeIn", "NeiN", "neiN", "niEN")
        while (true) {                                                // das erzeugt eine Endlosschleife, solange der User keine gültige Eingabe macht, läuft sie immer weiter bis zum "break" Befehl
            println("\nBeenden ohne zu Speichern? ${Utils.green}[Ja/Nein]${Utils.reset}")         // wenn richtige Eingabe durch "break" wird die Schleife verlassen
            val eingabe = readln()

            if (eingabe in gueltigeEingaben) {                        // ich überprüfe ob die Eingabe mit den gültigen Eingaben in der Liste übereinstimmen
                if (eingabe.equals("Ja", ignoreCase = true)
                ) {                                                   // wenn die Eingabe "ja" unabhängig von Groß/Klein, dann wird die Funktion "auswahlSpiele" aufgerufen,
                    println("\nSpiel wird Beendet.\n")
                    countdown(3)
                    auswahlSpieleKlasse.auswahlSpiele()
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