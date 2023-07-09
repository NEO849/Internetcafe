
// erbt von Klasse Charakter
class Held(name: String,lP:Int,) :Charakter(name, lP){

    fun erstelleHelden():List<Charakter> {
        val heldenNamen = listOf("Son Goku", "Son Gohan", "Piccolo", "Krelin", "Trunks")  // eine gewünschte Liste mit Namen, alle die selbe lP
        val lP = 10000
        val heldenListe = mutableListOf<Charakter>()

        for (name in heldenNamen){
            val held = erstelleCharakter(name,lP)
            heldenListe.add(held)
        }
        return heldenListe
    }
}