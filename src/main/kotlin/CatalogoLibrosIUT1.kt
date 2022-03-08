package un6.eje6_5

class CatalogoLibrosIUT1():LibroGestionable{

    override fun pedirID(): String {
        println("Introduzca un ID: ")
        return readLine()!!
    }

    override fun ComprobarID(cat: CatalogoLibros, ID: String) {
        if (cat.existeLibro(ID))
            println("El libro $ID existe!")
        else
            println("El libro $ID NO existe!")
    }

    override fun obtenerInfoLibro(cat: CatalogoLibros,ID: String):Map<String,Any> {
        return cat.infoLibro(ID)
    }

    override fun comprobarInfoLibro(map: Map<String, Any>) {
        if (!map.isEmpty())
            println("La información sobre es la siguiente\n$map")
        else
            println("No se encontró información sobre el libro")
    }
}