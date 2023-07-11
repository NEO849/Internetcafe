
// erbt von Klasse Charakter
class Held(name: String, lP: Int) : Charakter(name, lP) {

    private val heldenArcade = mutableListOf<Held>()       // hier speichere ich die erstellten Heldobjekte für den Arcade Modus
    private val heldenStory = mutableListOf<Held>()       // hier speichere ich die erstellten Heldobjekte für den Story Modus

    val namenListe = listOf("Son Goku", "Son Gohan", "Trunks", "Piccolo", "Krelin")
    val lPWerte = listOf(20000, 15000, 12000, 8000, 2000)
    val transformation1Liste = listOf("Super Saiyan", "Mystic Gohan", "Super Saiyan", "Super Fusion", "Power Up")
    val transformation2Liste = listOf("Super Saiyan Blue", "Ultimate Gohan", "Super Saiyan 2", "Namek Fusion", "Kajoken")
    val spezialAngriffListe = listOf("Kamehameha", "Masenko", "Finish Buster", "Beam Cannon", "Destructo Disc")

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
}






