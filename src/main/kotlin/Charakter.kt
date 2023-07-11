
// ist eine open Basisklasse von der die Klassen Held und gegner erben sollen, jedoch name, lp und Status "istBesiegt" sollen nicht von aussen verändert werden können
// extra alle "var" und nicht "val" weil bei DBZ durch "Nahtoderfahrung","Magische Bohnen","Super Sayajin Mode" machen dies nötig um den Status unter dem Kampf zu aktualisieren
open class Charakter(
    protected var name: String,       // default constructor, protected damit in den unterklassen darauf zugegriffen werden kann
    protected var lP: Int,
    private var istBesiegt: Boolean = false,
) {

    // gemeinsame fun zum Erstellen und zurückgeben von Charakter-Objekten mit Name und LP und "istBesiegt" auf false
    open fun erstelleCharakter():Charakter{
        return Charakter(name,lP)
    }

    // sind Platzhalter und werden in den Unterklassen überschrieben
    open fun charakterAusgeben(): String{
        return name
    }

    //
    open fun schadenErleiden(schaden:Int):Pair<Int,Boolean>{
        val neueLP = lP - schaden
        val istBesiegt = neueLP <= 0
        if (istBesiegt) {
            println("$name  ist K:O gegangen!")
        }
        return Pair(neueLP, istBesiegt)
    }

    //
    open fun angreifen(ziel:Charakter, schaden: Int):Pair<Int,Boolean> {
        val (neueLP, istBesiegt) = ziel.schadenErleiden(schaden)
        ziel.lP = neueLP
        if (istBesiegt) {
            println("${ziel.name}  ist K:O gegangen!")
        }
        return Pair(neueLP, istBesiegt)
    }

    //
    open fun verteidigen(schaden: Int):Int {
        return schaden                          // wird in unterklassen definiert
    }

    //
    open fun spezialAngriff(ziel: Charakter, schaden: Int):Pair<Int,Boolean>  {
        val (neueLP, istBesiegt) = ziel.schadenErleiden(schaden * 2)    // verursacht doppelten schaden
        ziel.lP = neueLP
        if (istBesiegt) {
            println("${ziel.name}  ist K:O gegangen!")
        }
        return Pair(neueLP, istBesiegt)
    }

    //
    open fun transformation1(lPErhoehung: Int):Int {
        lP += lPErhoehung
        return lP
    }

    //
    open fun transformation2(lPErhoehung: Int):Int {
        lP += lPErhoehung
        return lP
    }

    //
    open fun magischeBohnen(lPErhoehung: Int):Int{
        lP += lPErhoehung
        return lP
    }
}

