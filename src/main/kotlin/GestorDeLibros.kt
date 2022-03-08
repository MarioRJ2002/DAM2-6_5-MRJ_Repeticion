package un6.eje6_5

import java.util.logging.Level
import java.util.logging.LogManager

internal val l = LogManager.getLogManager().getLogger("").apply { level = Level.ALL }
internal fun i(tag: String, msg: String) {
    l.info("[$tag] - $msg")
}


fun main() {

    var cat:CatalogoLibros = CatalogoLibrosXML("catalog.xml")
    //var cat:CatalogoLibros = CatalogoLibrosXML("catalog.json")

    var gestion: LibroGestionable = CatalogoLibrosIUT1()
    //var gestion: LibroGestionable = CatalogoLibrosIUT1()

    val gestorDeLibros = gestionLibros(cat,gestion)

}

class gestionLibros(var cat:CatalogoLibros, var gestion:LibroGestionable){

    fun preguntarPorUnLibro(gestion:LibroGestionable) {
        var ID = gestion.pedirID()
        gestion.ComprobarID(cat,ID)
    }

    fun mostrarInfoDeUnLibro(gestion:LibroGestionable) {
        var ID = gestion.pedirID()
        var infolibro = gestion.obtenerInfoLibro(cat,ID)
        gestion.comprobarInfoLibro(infolibro)
    }

}