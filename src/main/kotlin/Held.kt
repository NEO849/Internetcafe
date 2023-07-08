
// erbt von Klasse Charakter
class Held (name:String, lP:Int):Charakter(name, lP) {

    private val heldenListe = listOf("Goku", "Krelin", "Gohan")

    fun erstelleHelden():List<Held>{
        return erstelleCharaktere(heldenListe, getLP())
    }

}