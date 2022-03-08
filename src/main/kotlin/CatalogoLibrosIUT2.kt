package un6.eje6_5

class CatalogoLibrosIUT2():LibroGestionable {
    override fun pedirID(): String {
        println("Enter an ID: ")
        return readLine()!!
    }

    override fun ComprobarID(cat: CatalogoLibros, ID: String) {
        if (cat.existeLibro(ID))
            println("The book $ID exists!")
        else
            println("The book $ID DOESN'T exists!")
    }

    override fun obtenerInfoLibro(cat: CatalogoLibros,ID: String):Map<String,Any> {
        return cat.infoLibro(ID)
    }

    override fun comprobarInfoLibro(map: Map<String, Any>) {
        if (!map.isEmpty())
            println("The information is the following one \n$map")
        else
            println("No information found about this book")
    }
}