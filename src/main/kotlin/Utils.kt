
// ich definiere die Klasse "abstract" dadurch kann sie nicht direkt instanziiert werden, aber ich kann die funktionen
// erben lassen und sie in den abgeleiteten Klassen überschreiben und eine eigene Logik implementieren.
// Der code wird leichter zu Warten und Änderungen an der gemeinsamen Basis auf alle abgeleiteten Spiele übertragen wird, companion Object bleibt bestehen
abstract class Utils {

    // muss von einer Unterklasse individuell überschrieben werden, macht den Code lesbarer
    abstract fun menuImSpiel()

    //
    abstract fun spielSpeichern()

    //
    abstract fun spielFortsetzen()

    //
    abstract fun spielBeenden()

    //
    abstract fun spielStarten()

}