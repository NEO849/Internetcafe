// erbt von der abstract "Utils" Basisklasse, ich überschreibe die abstrakten funktionen individuell aufs RPG Spiel abgestimmt
class DBZ : Utils() {

    // V. Instanziierung der auswahlSpiele Funktion, aus der AuswahlSpiele Klasse, wenn Funktion "Beenden" fertig Implementiert ist, nach Beenden zurück ins AuswahlSpiele Menu
    private val auswahlSpiele = AuswahlSpiele()

    // ist eine abstrakte Funktion in der Utils Klasse, damit muss sie individuell Überschrieben werden, um sie aufzurufen
    override fun spielStarten() {
        println("\nWelchen Modus möchtest du Spielen?")
        println("${Utils.cyan}[1] Story Mode${Utils.reset}")
        println("${Utils.cyan}[2] Arcade Mode${Utils.reset}")
        println("${Utils.purple}[3] Exit${Utils.reset}")

        val auswahlModus = readln().toIntOrNull() ?: 0
        when (auswahlModus) {
            1 -> {
                menuImSpiel(1)          // 1 für Story modus
            }

            2 -> {
                menuImSpiel(2)          // 2 für Story modus
            }

            3 -> {
                spielBeenden()
            }

            else -> {
                println("\nUngültige Eingabe! Ganzzahl eingeben.")
                menuImSpiel()
            }
        }
    }

    // die Klammern {} was normal hinter "while" steht, steht jetzt davor (mit do), das bedeutet, dass das Menu auf
    // jeden Fall angezeigt wird und dann wird erst überprüft, was der User eingegeben hat
    override fun menuImSpiel() {}
    fun menuImSpiel(modus: Int) {

        var index: Int
        do {
            println("Menu")
            println("$cyan[1] Spiel Starten$reset")
            println("$yellow[2] Spiel Speichern$reset")
            println("$yellow[3] Spiel Fortsetzen$reset")
            println("$cyan[4] Spiel Beenden$reset")
            index = readln().toIntOrNull() ?: 0


            // hier ein Beispiel, bei kleinen Sachen würde ich es so programmieren, bei größeren so wie unten
            when (index) {
                1 -> {
                    if (modus == 1) {
                        val dbzStoryModus = DbzStoryModus("", 0, false)
                        dbzStoryModus.startStoryModus()
                    } else if (modus == 2) {
                        val dbzArcadeModus = DbzArcadeModus("", 0, false)
                        dbzArcadeModus.startArcadeModus()
                    }
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
        println("\nIn Progress! Coming Soon...")
        // countdown(3)
        // hier irgendwann Logik, bei dem Aufbau sehr flexibel, steht noch nicht fest, ob nur "Pause", oder und "Fortsetzen"
        spielStarten()
    }

    // ich wollte das mal anders lösen und ohne ".toLowerCase", alle gültigen Eingaben sind in einer Liste gespeichert. Vorsicht ohne "break" Endlosschleife
    override fun spielBeenden() {
        val gueltigeEingaben = listOf("Ja", "JA", "ja", "jA", "Nein", "NEIN", "nein", "NeIn", "NeiN", "neiN", "niEN")
        while (true) {                                                                               // das erzeugt eine Endlosschleife, solange der User keine gültige Eingabe macht, läuft sie immer weiter bis zum "break" Befehl
            println("\nBeenden ohne zu Speichern? [${Utils.yellow}Ja${Utils.reset}/${Utils.cyan}Nein]${Utils.reset}")         // wenn richtige Eingabe durch "break" wird die Schleife verlassen
            val eingabe = readln()

            if (eingabe in gueltigeEingaben) {                        // ich überprüfe ob die Eingabe mit den gültigen Eingaben in der Liste übereinstimmen
                if (eingabe.equals("Ja", ignoreCase = true)
                ) {                                                   // wenn die Eingabe "ja" unabhängig von Groß/Klein, dann wird die Funktion "auswahlSpiele" aufgerufen,
                    println("\nSpiel wird Beendet.\n")
//                    countdown(3)
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