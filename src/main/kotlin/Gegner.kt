
// erbt von Klasse Charakter
class Gegner (name:String, lP:Int):Charakter(name, lP) {

    private val gegnerArcade = mutableListOf<Gegner>()       // hier speichere ich die erstellten Heldobjekte für den Arcade Modus
    private val gegnerStory = mutableListOf<Gegner>()       // hier speichere ich die erstellten Heldobjekte für den Story Modus

    var namenListe = listOf("Vegeta", "Freezer", "Cell", "Boo", "Soldat")
    val lPWerte = listOf(30000, 50000, 80000, 100000, 3000)
    val transformation1Liste = listOf("Super Saiyan", "Super Freezer", "Perfekte Form", "Bad Boo", "")
    val transformation2Liste = listOf("Ultra Saiyajin", "Golden Freezer", "Harakiri", "Chuck Norris Fusion", "")
    val spezialAngriffListe = listOf("Final Flash", "Death Ball", "Absorbieren", "Genkidama", "Schießen")

    // Funktion für Arcade Modus, somit schnell, unterschiedliche Helden
    fun erstelleArcadeModus():List<Gegner>{
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

            val gegner = Gegner(name, lP)
            gegnerArcade.add(gegner)
        }
        return gegnerArcade
    }

    // Funktion für Story Modus, somit schnell, unterschiedliche Helden
    fun erstelleStoryModus():List<Gegner> {
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

            val gegner = Gegner(name, lP)
            gegnerStory.add(gegner)
        }
        return gegnerStory
    }

}