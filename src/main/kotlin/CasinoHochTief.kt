import kotlin.random.Random

class CasinoHochTief {

    // definiere mein Karten Deck
    val allePik = mutableMapOf<String, Int>(
        "${Utils.green}♠️ A${Utils.reset}" to 11,
        "${Utils.green}♠\uFE0F 2${Utils.reset}" to 2,
        "${Utils.green}♠\uFE0F 3${Utils.reset}" to 3,
        "${Utils.green}♠\uFE0F 4${Utils.reset}" to 4,
        "${Utils.green}♠\uFE0F 5${Utils.reset}" to 5,
        "${Utils.green}♠\uFE0F 6${Utils.reset}" to 6,
        "${Utils.green}♠\uFE0F 7${Utils.reset}" to 7,
        "${Utils.green}♠\uFE0F 8${Utils.reset}" to 8,
        "${Utils.green}♠\uFE0F 9${Utils.reset}" to 9,
        "${Utils.green}♠\uFE0F 10${Utils.reset}" to 10,
        "${Utils.green}♠\uFE0F B${Utils.reset}" to 10,
        "${Utils.green}♠\uFE0F D${Utils.reset}" to 10,
        "${Utils.green}♠\uFE0F K${Utils.reset}" to 10
    )
    val alleHerz = mutableMapOf<String, Int>(
        "${Utils.red}️♥️ A${Utils.reset}" to 11,
        "${Utils.red}️\uFE0F♥\uFE0F 2${Utils.reset}" to 2,
        "${Utils.red}\uFE0F♥\uFE0F 3${Utils.reset}" to 3,
        "${Utils.red}\uFE0F♥\uFE0F 4${Utils.reset}" to 4,
        "${Utils.red}\uFE0F♥\uFE0F 5${Utils.reset}" to 5,
        "${Utils.red}\uFE0F♥\uFE0F 6${Utils.reset}" to 6,
        "${Utils.red}\uFE0F♥\uFE0F 7${Utils.reset}" to 7,
        "${Utils.red}\uFE0F♥\uFE0F 8${Utils.reset}" to 8,
        "${Utils.red}\uFE0F♥\uFE0F 9${Utils.reset}" to 9,
        "${Utils.red}\uFE0F♥\uFE0F 10${Utils.reset}" to 10,
        "${Utils.red}\uFE0F♥\uFE0F B${Utils.reset}" to 10,
        "${Utils.red}\uFE0F♥\uFE0F D${Utils.reset}" to 10,
        "${Utils.red}\uFE0F♥\uFE0F K${Utils.reset}" to 10
    )
    val alleKaro = mutableMapOf<String, Int>(
        "${Utils.yellow}♦️A${Utils.reset}" to 11,
        "${Utils.yellow}♦\uFE0F 2${Utils.reset}" to 2,
        "${Utils.yellow}♦\uFE0F 3${Utils.reset}" to 3,
        "${Utils.yellow}♦\uFE0F 4${Utils.reset}" to 4,
        "${Utils.yellow}♦\uFE0F 5${Utils.reset}" to 5,
        "${Utils.yellow}♦\uFE0F 6${Utils.reset}" to 6,
        "${Utils.yellow}♦\uFE0F 7${Utils.reset}" to 7,
        "${Utils.yellow}♦\uFE0F 8${Utils.reset}" to 8,
        "${Utils.yellow}♦\uFE0F 9${Utils.reset}" to 9,
        "${Utils.yellow}♦\uFE0F 10${Utils.reset}" to 10,
        "${Utils.yellow}♦\uFE0F B${Utils.reset}" to 10,
        "${Utils.yellow}♦\uFE0F D${Utils.reset}" to 10,
        "${Utils.yellow}♦\uFE0F K${Utils.reset}" to 10

    )
    val alleKreuz = mutableMapOf<String, Int>(
        "${Utils.blue}♣️ A${Utils.reset}" to 11,
        "${Utils.blue}♣\uFE0F 2${Utils.reset}" to 2,
        "${Utils.blue}♣\uFE0F 3${Utils.reset}" to 3,
        "${Utils.blue}♣\uFE0F 4${Utils.reset}" to 4,
        "${Utils.blue}♣\uFE0F 5${Utils.reset}" to 5,
        "${Utils.blue}♣\uFE0F 6${Utils.reset}" to 6,
        "${Utils.blue}♣\uFE0F 7${Utils.reset}" to 7,
        "${Utils.blue}♣\uFE0F 8${Utils.reset}" to 8,
        "${Utils.blue}♣\uFE0F 9${Utils.reset}" to 9,
        "${Utils.blue}♣\uFE0F 10${Utils.reset}" to 10,
        "${Utils.blue}♣\uFE0F B${Utils.reset}" to 10,
        "${Utils.blue}♣\uFE0F D${Utils.reset}" to 10,
        "${Utils.blue}♣\uFE0F K${Utils.reset}" to 10
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
    private var gewinnFaktorUnentschieden: Int = 3

    // Funktion startet Hoch/Tief
    fun startHochTief() {

        // ich rufe die Funktion initialisiereMeinDeck auf
        initMeinDeck()

        println("\nHoch/Tief beginnt in kürze...")
//        Utils.countdown(3)

        // Endlosschleife bis Spieler entscheidet aufzuhören, solange Spieler nicht Nein wählt
        while (true) {
            logikHochTief()  // startet Hoch Tief

            if (!weiterSpielen()) {
                // ich instanziiere die fun spiestarten in Casino Klasse
                //  break
                val casino = Casino()
                casino.spielStarten()
            }
        }
    }

    // Funktionen zum Ausführen der Spiellogik
    private fun logikHochTief() {
        println("\n${Utils.black}${Utils.whiteBackground}Runde  $rundenZaehler${Utils.reset}")
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
                punkte + (1 * gewinnFaktorUnentschieden)
                println("Unglaublich, Unentschieden, du gewinnst den 3-fachen Einsatz....")
            }
        }

        // Statistik ausgeben
        println("\nSpielstatistik")
        println("Gewonnene Spiele:   ${Utils.green}$gewonneneSpiele${Utils.reset}")
        println("Verlorene Spiele:   ${Utils.red}$verloreneSpiele${Utils.reset}")
        println("Unentschieden:      ${Utils.yellow}$unentschiedenSpiele${Utils.reset}")

        // hier noch, wenn Punkte negativ sind, dann rote ausgabe, andernfalls grüne
        if (punkte <= 0) {
            println("Punkte Insgesamt:   ${Utils.red}$punkte${Utils.reset}")
        } else {
            println("Punkte Insgesamt:   ${Utils.green}$punkte${Utils.reset}")
        }

        // hier könnte ich noch alles mögliche Implementieren, verweis auf Spielsucht Webseite, etc... (Logiken, Funktionen)
        println("\nDanke fürs Spielen.")
        println("Bei Problemen mit dem Spielen, wenden sie sich bitte an:")
        println("Bundeszentrale für gesundheitliche Aufklärung\n" + "Maarweg 149-161\n" + "50825 Köln")
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
            println("\nWeiter spielen? (${Utils.green}ja${Utils.reset}/${Utils.purple}nein${Utils.reset})")
            val antwort = readln().lowercase()
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