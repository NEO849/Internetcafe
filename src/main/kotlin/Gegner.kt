
// erbt von Klasse Charakter
class Gegner (name:String, lP:Int):Charakter(name, lP) {

    fun erstelleGegner():List<Charakter> {
        val gegnerNamen = listOf("Vegeta", "Freezer", "Cell", "Broly", "Boo")  // eine gewünschte Liste mit Namen, alle die selbe lP
        val lP = 10000
        val gegnerListe = mutableListOf<Charakter>()

        for (name in gegnerNamen){
            val held = erstelleCharakter(name,lP)
            gegnerListe.add(held)
        }
        return gegnerListe
    }
}