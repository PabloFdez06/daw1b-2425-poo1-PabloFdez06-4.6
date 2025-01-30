class RepositorioCompra{

    private val compras = mutableListOf<Compra>()

    fun agregarCompra(cliente: Cliente, dia: Int, total: Double){
        compras.add(Compra(cliente, dia, total))

    }

    fun agregarCompra(compra: Compra){
        compras.add(compra)
    }

    fun agregarCompra(nombre: String,
                      calle: String,
                      numero: Int,
                      dia: Int,
                      total: Double){
        val domicilio = Domicilio(calle, numero)
        val cliente = Cliente(nombre, domicilio)
        compras.add(Compra(cliente, dia, total))
    }

    fun domicilios(): MutableSet<Domicilio> {
        val setCompras: MutableSet<Domicilio> = mutableSetOf()
        for (compra in compras) {
            setCompras.add(compra.cliente.domicilio)
        }
        return setCompras
    }


}