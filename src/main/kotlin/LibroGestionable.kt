package un6.eje6_5

interface LibroGestionable {

    fun pedirID():String{return ""}
    fun ComprobarID(catalogoLibros: CatalogoLibros,ID:String){}
    fun obtenerInfoLibro(catalogoLibros: CatalogoLibros,ID:String):Map<String,Any>{return mapOf()}
    fun comprobarInfoLibro(map: Map<String,Any>)

}