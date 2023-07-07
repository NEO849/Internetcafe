
// erbt von der abstract Utils Basisklasse, ich überschreibe die abstrakten funktionen individuell aufs RPG Spiel abgestimmt
class RPG : Utils() {

    override fun spielStarten() {
        println("\nSpiel wird in kürze gestartet...")
        // Spiel-Logik

    }

    override fun spielSpeichern() {
        println("\nSpiel wird gespeichert. Coming Soon...")
        countdown(3)
        auswahlSpiele()
        // Logik
    }

    override fun spielFortsetzen() {
        println("\nSpiel wird in kürze fortgesetzt. Coming Soon...")
        countdown(3)
        auswahlSpiele()
        // Logik
    }

    // ich wollte das mal anders lösen und ohne ".toLowerCase", alle gültigen Eingaben sind in einer Liste gespeichert. Vorsicht ohne "break" Endlosschleife
    override fun spielBeenden() {
        val gueltigeEingaben = listOf("Ja", "JA", "ja", "jA", "Nein", "NEIN", "nein", "NeIn", "NeiN", "neiN", "niEN")
        while (true){                                                // das erzeugt eine Endlosschleife, solange der User keine gültige Eingabe macht, läuft sie immer weiter bis zum "break" Befehl
            println("\nBeenden ohne zu Speichern? [Ja/Nein]")          // wenn richtige Eingabe durch "break" wird die Schleife verlassen
            val eingabe = readln()

            if (eingabe in gueltigeEingaben) {                       // ich überprüfe ob die Eingabe mit den gültigen Eingaben in der Liste übereinstimmen
                if(eingabe.equals("Ja",ignoreCase = true)) {   // wenn die Eingabe "ja" unabhängig von Groß/Klein, dann wird die Funktion "auswahlSpiele" aufgerufen,
                    println("\nSpiel wird Beendet.")
                    auswahlSpiele()
                } else {                                            // andernfalls ist die Eingabe also nicht ja, sondern ein anderes gültiges Wort wie "nein", dann wird die Funktion "spieleSpeichern" aufgerufen
                    spielSpeichern()
                }
                break                                               // Schleife wird beendet, da eine gültige Eingabe erfolgt ist
            } else {
                println("\nUngültige Eingabe! Bitte `Ja´ oder ´Nein´ eingeben.") // weil ich im else Block keine Bedingung oder weiter Überprüfung vornehme, wird "break" benötigt um die Schleife zu verlassen,
            }                                                                    // so ist das aber gewollt, das die Schleife wieder beginnt bei ungültiger Eingabe
        }
    }
}

//    hier nicht alle Möglichkeiten, wie User Ja/Nein schreiben könnte abgesichert...
//    override fun spielBeenden() {
//        println("Beenden ohne zu Speichern? [Ja/Nein]")
//        var eingabe = readln()
//        while (!eingabe.equals("Ja", ignoreCase = true) && !eingabe.equals("Nein", ignoreCase = true)) {
//            println("Achtung! Ungültige Eingabe. Bitte ´Ja´ oder ´Nein´ eingeben.")
//            eingabe = readln()
//        }
//        if (eingabe.equals("nein", ignoreCase = true)) {
//            countdown(3)
//            spielSpeichern()
//        } else {
//            println("Spiel wird Beendet...")
//            countdown(3)
//            auswahlSpiele()
//        }
//    }