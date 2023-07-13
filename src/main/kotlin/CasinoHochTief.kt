import kotlin.random.Random

class CasinoHochTief {

    // definiere mein Karten Deck
    val allePik = mutableMapOf<String, Int>(
        "${Farben.green}♠️ A${Farben.reset}" to 11,
        "${Farben.green}♠\uFE0F 2${Farben.reset}" to 2,
        "${Farben.green}♠\uFE0F 3${Farben.reset}" to 3,
        "${Farben.green}♠\uFE0F 4${Farben.reset}" to 4,
        "${Farben.green}♠\uFE0F 5${Farben.reset}" to 5,
        "${Farben.green}♠\uFE0F 6${Farben.reset}" to 6,
        "${Farben.green}♠\uFE0F 7${Farben.reset}" to 7,
        "${Farben.green}♠\uFE0F 8${Farben.reset}" to 8,
        "${Farben.green}♠\uFE0F 9${Farben.reset}" to 9,
        "${Farben.green}♠\uFE0F 10${Farben.reset}" to 10,
        "${Farben.green}♠\uFE0F B${Farben.reset}" to 10,
        "${Farben.green}♠\uFE0F D${Farben.reset}" to 10,
        "${Farben.green}♠\uFE0F K${Farben.reset}" to 10
    )
    val alleHerz = mutableMapOf<String, Int>(
        "${Farben.red}️♥️ A${Farben.reset}" to 11,
        "${Farben.red}️\uFE0F♥\uFE0F 2${Farben.reset}" to 2,
        "${Farben.red}\uFE0F♥\uFE0F 3${Farben.reset}" to 3,
        "${Farben.red}\uFE0F♥\uFE0F 4${Farben.reset}" to 4,
        "${Farben.red}\uFE0F♥\uFE0F 5${Farben.reset}" to 5,
        "${Farben.red}\uFE0F♥\uFE0F 6${Farben.reset}" to 6,
        "${Farben.red}\uFE0F♥\uFE0F 7${Farben.reset}" to 7,
        "${Farben.red}\uFE0F♥\uFE0F 8${Farben.reset}" to 8,
        "${Farben.red}\uFE0F♥\uFE0F 9${Farben.reset}" to 9,
        "${Farben.red}\uFE0F♥\uFE0F 10${Farben.reset}" to 10,
        "${Farben.red}\uFE0F♥\uFE0F B${Farben.reset}" to 10,
        "${Farben.red}\uFE0F♥\uFE0F D${Farben.reset}" to 10,
        "${Farben.red}\uFE0F♥\uFE0F K${Farben.reset}" to 10
    )
    val alleKaro = mutableMapOf<String, Int>(
        "${Farben.yellow}♦️A${Farben.reset}" to 11,
        "${Farben.yellow}♦\uFE0F 2${Farben.reset}" to 2,
        "${Farben.yellow}♦\uFE0F 3${Farben.reset}" to 3,
        "${Farben.yellow}♦\uFE0F 4${Farben.reset}" to 4,
        "${Farben.yellow}♦\uFE0F 5${Farben.reset}" to 5,
        "${Farben.yellow}♦\uFE0F 6${Farben.reset}" to 6,
        "${Farben.yellow}♦\uFE0F 7${Farben.reset}" to 7,
        "${Farben.yellow}♦\uFE0F 8${Farben.reset}" to 8,
        "${Farben.yellow}♦\uFE0F 9${Farben.reset}" to 9,
        "${Farben.yellow}♦\uFE0F 10${Farben.reset}" to 10,
        "${Farben.yellow}♦\uFE0F B${Farben.reset}" to 10,
        "${Farben.yellow}♦\uFE0F D${Farben.reset}" to 10,
        "${Farben.yellow}♦\uFE0F K${Farben.reset}" to 10

    )
    val alleKreuz = mutableMapOf<String, Int>(
        "${Farben.blue}♣️ A${Farben.reset}" to 11,
        "${Farben.blue}♣\uFE0F 2${Farben.reset}" to 2,
        "${Farben.blue}♣\uFE0F 3${Farben.reset}" to 3,
        "${Farben.blue}♣\uFE0F 4${Farben.reset}" to 4,
        "${Farben.blue}♣\uFE0F 5${Farben.reset}" to 5,
        "${Farben.blue}♣\uFE0F 6${Farben.reset}" to 6,
        "${Farben.blue}♣\uFE0F 7${Farben.reset}" to 7,
        "${Farben.blue}♣\uFE0F 8${Farben.reset}" to 8,
        "${Farben.blue}♣\uFE0F 9${Farben.reset}" to 9,
        "${Farben.blue}♣\uFE0F 10${Farben.reset}" to 10,
        "${Farben.blue}♣\uFE0F B${Farben.reset}" to 10,
        "${Farben.blue}♣\uFE0F D${Farben.reset}" to 10,
        "${Farben.blue}♣\uFE0F K${Farben.reset}" to 10
    )

    // hier wird mein erstelltes Komplettes Deck gespeichert
    private var deckKomplett: MutableList<String> = mutableListOf()

    // eine Funktion um ein komplettes Deck zu Initialisierung, so kann ich es wie in meiner Hosentasche überall mitnehmen... ;-)
    fun initMeinDeck() {
        deckKomplett =
            (allePik.keys.toMutableList() + alleHerz.keys.toMutableList() + alleKaro.keys.toMutableList() + alleKreuz.keys.toMutableList()).toMutableList()
    }

    // hilfsvariablen für Spielstatistik
    private var rundenZaehler: Int = 1  // so wird die erste Runde mit 1 ausgegeben nicht mit 0
    private var gewonneneSpiele: Int = 0
    private var verloreneSpiele: Int = 0
    private var unentschiedenSpiele: Int = 0
    private var punkte: Int = 0
    private var punkteVerrechnet: Int = 0
    private var gewinnFaktorUnentschieden: Int = 3

    // Funktion startet Hoch/Tief
    fun startHochTief() {

        // ich rufe die Funktion initialisiereMeinDeck auf
        initMeinDeck()

        println("\nHoch/Tief beginnt in kürze...")
//        Utils.countdown(3)

        // Endlosschleife bis Spieler entscheidet aufzuhören
        while (true) {
            logikHochTief()  // startet Hoch Tief

            if (!weiterSpielen()) {
                break
            }
        }

        // Statistik ausgeben
        println("\nSpielstatistik")
        println("Gewonnene Spiele:   ${Farben.green}$gewonneneSpiele${Farben.reset}")
        println("Verlorene Spiele:   ${Farben.red}$verloreneSpiele${Farben.reset}")
        println("Unentschieden:      ${Farben.yellow}$unentschiedenSpiele${Farben.reset}")
        println("Punkte Insgesamt:   ${Farben.green}$punkteVerrechnet${Farben.reset}")

        // hier könnte ich noch alles mögliche Implementieren, verweis auf Spielsucht Webseite, etc... (Logiken, Funktionen)
        println("\nDanke fürs Spielen.")
        println("Bei Problemen mit dem Spielen, wenden sie sich bitte an:")
        println("Bundeszentrale für gesundheitliche Aufklärung\n" + "Maarweg 149-161\n" + "50825 Köln")
    }

    // Funktionen zum Ausführen der Spiellogik
    private fun logikHochTief() {
        println("\n${Farben.black}${Farben.whiteBackground}Runde  $rundenZaehler${Farben.reset}")
        rundenZaehler++

        // Karte ziehen
        val spielerKarte = zieheKarte()
        val computerKarte = zieheKarte()

        // Kartenwerte auslesen
        val spielerWert = ermittleKartenWert(spielerKarte)
        val computerWert = ermittleKartenWert(computerKarte)

        // Karten ausgeben
        println("Spieler zieht:   $spielerKarte   (Wert:  $spielerWert)")
        println("Computer zieht:  $computerKarte  (Wert:  $computerWert)")

        // ich definiere wie Spielergebnis überprüft/berechnet wird
        
         when {
            spielerWert > computerWert -> {
                gewonneneSpiele++
                punkte++
                println("Spieler hat Gewonnen.")
            }

            spielerWert < computerWert -> {
                verloreneSpiele++
                punkte--
                println("Computer hat Gewonnen.")
            }

            else -> {
                unentschiedenSpiele++
                punkte + (gewinnFaktorUnentschieden * 3)
                println("Unglaublich, Unentschieden, du gewinnst den 3-fachen Einsatz....")
            }
        }
    }

    // Funktion zum Ziehen eine Random Karte aus dem Kompletten kartendeck
    private fun zieheKarte(): String {
        val gezogeneKarte = deckKomplett.random()
        deckKomplett.remove(gezogeneKarte)
        return gezogeneKarte
    }

    // Funktion zum Auslesen der Karten Wert´s
    private fun ermittleKartenWert(karte: String): Int {
        val kartendeck = when {
            karte in allePik -> allePik
            karte in alleHerz -> alleHerz
            karte in alleKaro -> alleKaro
            karte in alleKreuz -> alleKreuz
            else -> null
        }
        return kartendeck?.get(karte) ?: 0
    }

    // Funktion zum entscheiden über Fortsetzen des Spiels
    fun weiterSpielen(): Boolean {
        while (true) {
            println("\nWeiter spielen? (${Farben.green}ja${Farben.reset}/${Farben.purple}nein${Farben.reset})")
            val antwort = readLine()?.lowercase()
            if (antwort == "ja") {
                return true
            } else if (antwort == "nein") {
                return false
            } else {
                println("\nUngültige Eingabe! Bitte `Ja´ oder ´Nein´ eingeben.")
            }
        }
    }
}