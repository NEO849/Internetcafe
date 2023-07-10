
// erbt von Klasse Charakter
class Held(name: String, lP: Int) : Charakter(name, lP) {

    private val heldenArcade = mutableListOf<Held>()       // hier speichere ich die erstellten Heldobjekte für den Arcade Modus
    private val heldenStory = mutableListOf<Held>()       // hier speichere ich die erstellten Heldobjekte für den Story Modus

    private val namenListe = listOf("Son Goku", "Son Gohan", "Trunks", "Piccolo", "Krelin")
    private val lPWerte = listOf(20000, 15000, 12000, 8000, 2000)
    private val transformation1Liste = listOf("Super Saiyan", "Mystic Gohan", "Super Saiyan", "Super Fusion", "Power Up")
    private val transformation2Liste = listOf("Super Saiyan Blue", "Ultimate Gohan", "Super Saiyan 2", "Namek Fusion", "Kajoken")
    private val spezialAngriffListe = listOf("Kamehameha", "Masenko", "Finish Buster", "Beam Cannon", "Destructo Disc")

    // Funktion für Arcade Modus, somit schnell, unterschiedliche Helden
    fun erstelleArcadeModus():List<Held>{
        for (i in namenListe.indices) {
            val name = namenListe[i]
            val lP = 10000
            val transformation1 = transformation1Liste[i]
            val transformation2 = transformation2Liste[i]
            val spezialAngriff = spezialAngriffListe[i]
            val angriffHoch = "Faustschlag"
            val angriffTief = "Fußtritt"
            val verteidigungHoch = "Block"
            val verteidigungTief = "Ausweichen"
            val heilen = "Heilen"

            val held = Held(name, lP)
            heldenArcade.add(held)
        }
        return heldenArcade
    }

    // Funktion für Story Modus, somit schnell, unterschiedliche Helden
    fun erstelleStoryModus():List<Held> {
        for (i in namenListe.indices) {
            val name = namenListe[i]
            val lP = lPWerte[i]
            val transformation1 = transformation1Liste[i]
            val transformation2 = transformation2Liste[i]
            val spezialAngriff = spezialAngriffListe[i]
            val angriffHoch = "Faustschlag"
            val angriffTief = "Fußtritt"
            val verteidigungHoch = "Block"
            val verteidigungTief = "Ausweichen"
            val heilen = "Heilen"

            val held = Held(name, lP)
            heldenStory.add(held)
        }
        return heldenStory
    }

    // fun um eine Liste als Ergebnis zurückzugeben
    override fun charakterAusgeben(): List<String> {
        return nummeriereObjekte(namenListe)
    }

    // fun um übergebene Listen/Elemente zu nummerieren
    fun nummeriereObjekte(liste:List<String>): List<String> {
        return liste.mapIndexed { index,name -> "${index + 1}. $name"}
    }
}






