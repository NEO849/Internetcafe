//
class CasinoHochTief {

    // definiere mein Karten Deck
    val allePik = mutableMapOf<String,Int>(
        "${Farben.green}A${Farben.reset}" to 11,
        "${Farben.green}2${Farben.reset}" to 2,
        "${Farben.green}3${Farben.reset}" to 3,
        "${Farben.green}4${Farben.reset}" to 4,
        "${Farben.green}5${Farben.reset}" to 5,
        "${Farben.green}6${Farben.reset}" to 6,
        "${Farben.green}7${Farben.reset}" to 7,
        "${Farben.green}8${Farben.reset}" to 8,
        "${Farben.green}9${Farben.reset}" to 9,
        "${Farben.green}${Farben.reset}" to 10,
        "${Farben.green}B${Farben.reset}" to 10,
        "${Farben.green}D${Farben.reset}" to 10,
        "${Farben.green}K${Farben.reset}" to 10
    )
    val alleHerz = mutableMapOf<String,Int>(
        "${Farben.red}️A${Farben.reset}" to 11,
        "${Farben.red}️2${Farben.reset}" to 2,
        "${Farben.red}3${Farben.reset}" to 3,
        "${Farben.red}4${Farben.reset}" to 4,
        "${Farben.red}5${Farben.reset}" to 5,
        "${Farben.red}F6${Farben.reset}" to 6,
        "${Farben.red}7${Farben.reset}" to 7,
        "${Farben.red}8${Farben.reset}" to 8,
        "${Farben.red}9${Farben.reset}" to 9,
        "${Farben.red}10${Farben.reset}" to 10,
        "${Farben.red}${Farben.reset}" to 10,
        "${Farben.red}D${Farben.reset}" to 10,
        "${Farben.red}K${Farben.reset}" to 10
    )
    val alleKaro = mutableMapOf<String,Int>(
        "${Farben.yellow}A${Farben.reset}" to 11,
        "${Farben.yellow}2${Farben.reset}" to 2,
        "${Farben.yellow}3${Farben.reset}" to 3,
        "${Farben.yellow}4${Farben.reset}" to 4,
        "${Farben.yellow}5${Farben.reset}" to 5,
        "${Farben.yellow}6${Farben.reset}" to 6,
        "${Farben.yellow}7${Farben.reset}" to 7,
        "${Farben.yellow}8${Farben.reset}" to 8,
        "${Farben.yellow}9${Farben.reset}" to 9,
        "${Farben.yellow}10${Farben.reset}" to 10,
        "${Farben.yellow}B${Farben.reset}" to 10,
        "${Farben.yellow}D${Farben.reset}" to 10,
        "${Farben.yellow}K${Farben.reset}" to 10

    )
    val alleKreuz = mutableMapOf<String,Int>(
        "${Farben.blue}A${Farben.reset}" to 11,
        "${Farben.blue}2${Farben.reset}" to 2,
        "${Farben.blue}3${Farben.reset}" to 3,
        "${Farben.blue}4${Farben.reset}" to 4,
        "${Farben.blue}5${Farben.reset}" to 5,
        "${Farben.blue}6${Farben.reset}" to 6,
        "${Farben.blue}7${Farben.reset}" to 7,
        "${Farben.blue}8${Farben.reset}" to 8,
        "${Farben.blue}9${Farben.reset}" to 9,
        "${Farben.blue}10${Farben.reset}" to 10,
        "${Farben.blue}B${Farben.reset}" to 10,
        "${Farben.blue}D${Farben.reset}" to 10,
        "${Farben.blue}K${Farben.reset}" to 10
    )

    // Liste aller KArten im Deck
    var deckKomplet = allePik.keys.toList() + alleHerz.keys.toList() + alleKaro.keys.toList() + alleKreuz.keys.toList()

    // hilfsvariablen für Spielstatistik
    private var gewonneneSpiele: Int = 0
    private var verloreneSpiele: Int = 0
    private var untentschiedenSpiele: Int = 0
    private var gewinnFaktorUnentschieden: Int = 3

    // Funktion startet Hoch/Tief
    fun startHochTief (){
        println("\nHoch/Tief beginnt in kürze...")

        // Endlosschleife bis Spieler entscheidet aufzuhören
        while (true) {
            logikHochTief()  // startet Hoch Tief

            if (!weiterSpielen()) {
                break
            }
        }

        // Statistik ausgeben
        println("\nSpielstatistik")
        println("Gewonnene Spiele:  $gewonneneSpiele")
        println("Verlorene Spiele:  $verloreneSpiele")
        println("\nDanke fürs Spielen.")
        println("Bei Problemen mit dem Spielen, wenden sie sich bitte an:")
        println("Bundeszentrale für gesundheitliche Aufklärung\n" + "Maarweg 149-161\n" + "50825 Köln")

        // Funktionen zum ausführen der Spiellogik
        fun logikHochTief(){
            println("\nNeue Runde")

            // Karte ziehen
            val spielerKarte = zieheKarte()
            val computerKarte = zieheKarte()

            // Kartenwerte auslesen
            val spielerWert = deckKomplet[spielerKarte]
            val computerWert = deckKomplet[computerKarte]

            // Karten ausgeben
            println("\nSpieler:  $spielerKarte  (Wert:  $spielerWert)")
            println("\nComputer:  $computerKarte  (Wert:  $computerWert)")

            // ich definiere Zähllogik, durch den Aufbau kann ich einfach und schnell, komplexere Spiele implementieren...
            when {
                spielerWert > computerWert -> {
                    println("\nSpieler hat Gewonnen!")
                    gewonneneSpiele ++
                }
                spielerWert < computerWert -> {
                    println("\nComputer hat Gewonnen!")
                    verloreneSpiele ++
                }
                else -> {
                    println("\nUnglaublich Unentschieden!")
                    println("Achtung in der nächsten Runde geht es dafür um  3  Punkte!")
                    untentschiedenSpiele ++
                    verloreneSpiele += gewinnFaktorUnentschieden
                }
            }
        }

        // Funktion zum ziehen eine Random Karte aus dem Kompletten kartendeck
        fun zieheKarte():String {
            val gezogeneKarte = deckKomplet.random()
            deckKomplet.remove(gezogeneKarte)
            return gezogeneKarte
        }

        // Funktion zum entscheiden über Fortsetzen des Spiels
        fun weiterSpielen(): Boolean {
            println("\nWeiter spielen? (ja/nein)")
            val antwort = readLine()?.lowercase()
            return antwort == "ja"
        }
    }
}