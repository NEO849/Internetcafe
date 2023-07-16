![Pacman](/Users/neo/Downloads/pacman-149704_1280.webp)


# <span style="color: cyan;">Internetcafe</span>
### Mein erstes größeres Projekt:

## Ausführung des Programms

Um das Programm auszuführen, können Sie die `main()`-Funktion verwenden. Führen Sie dazu die folgenden Schritte aus:

1. Öffnen Sie das Hauptprogramm, in dem sich die `main()`-Funktion befindet.
2. Instanziieren Sie die Klasse `Internetcafe` mit `val internetcafe = Internetcafe()`.
3. Rufen Sie die Funktion `eingang()`mittels Punktnotation auf, um den Eingang des Internetcafes zu simulieren: `internetcafe.eingang()`.
4. Starten Sie das Programm.
5. Befolgen Sie die Anweisungen in der Konsolenausgabe, um das Internetcafe zu simulieren.

 <span style="color: yellow;">Hilfe:</span>
- alles was Grün ist, ist Spielbar
- alles was Gelb ist, damit können Sie sich durch die Simulation bewegen, jedoch ist Teilweise die Logik noch nicht fertig...

## Spiele:
- Casino
- DBZ       
  1. Storymodus
  2. Arcademodus


Ich hoffe das man die Mühe, die Zeit und die Nerven die ich investiert habe, ein wenig erkennt... 🤓


### "Alpha et Omega" meiner Codestruktur:
* Der Aufbau vom Internetcafe, ist so gewählt, das man schnell und einfach das "Grundegerüst" um weitere Spiele und Logiken erweitern kann. wie zum Beispiel, beim Anmelden, eine Klasse Account definieren, Attribute, vor-nachname, email,tel,etc...

### To Do:
* Beim Anmelden die Klasse instanziieren, bei bedarf, anmelden- registrieren, Konto mit Bezahlfunktion, usw
* Speichern, Laden
* easy, hard Mode zum Beispiel, sehr schnell und einfach in der DBZ Story Klasse, gleiche Gegner, mit anderen Parameter erstellt... 
* Casino, ruft zum Beispiel Kontostatus aus der Account/bzw. Konto Klasse


### Klassendiagramm:
![Klassendiagramm](/Users/neo/Downloads/InternetcafeKlassenDiagramm.png)



### try / catch ?!

... Genau ...

... kommt nicht vor ...
Bis jetzt sind mir keine Exceptions aufgefallen... 

... All right, hier bitteschön... 😬

fun main() {        

    while (true) {                                     // so gings und geht es...
        val text = try {                               // var coden = true   
            if (coden) {                               // var glücklich = true
                "Solange ich code, the sun is... 😎"
            } else {
                glücklich = false
                throw Exception("Unglücklicher Programmierer")
            }
        } catch (e: Exception) {
            "Fehler: ${e.message}"
        }
        println(text)
        if (!glücklich) {
            coden = true
            glücklich = true
        }
    }
}


In diesem Sinne, Dankeschön für die neue schöne Welt, die Ihr mir gezeigt habt!

## Viel Spaß mit dem Internetcafe!

p.S falls dir mein Projekt gefällt und du mich mit einer Tasse Kaffe unterstützen möchtest, bitte, meine leere mutableLisrOf... 🥳

BTC: bc1q0sx4mxtn969mss4cqnt7zcy2prrtjyy34xgr08


Vielen Dank an alle die mir diese Chance ermöglicht haben...

![SyntayAcademy](/Users/neo/Downloads/SyntaxAcademy.jpeg)


