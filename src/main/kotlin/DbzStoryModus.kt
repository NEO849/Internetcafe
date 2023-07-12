class DbzStoryModus(name: String, lP: Int) : Charakter(name, lP) {

    val charakter1 : Charakter
    val charakter2 : Charakter
    val charakter3 : Charakter
    val charakter4 : Charakter

    init {
        charakter1 = Charakter("Goku",10000, "Schlag","Block")
        charakter2 = Charakter("Soldat",20000, "Schlag","Block")
        charakter3 = Charakter("Vegate",40000, "Schlag","Block")
        charakter4 = Charakter("Broly",60000, "Schlag","Block")
    }

}
