class RepositorioCompra

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

    fun domicilios(): List<Domicilio>{
        val domicilios = mutableSetOf<Domicilio>()

        for (compra in compras){
            domicilios.add(compra.cliente.domicilio)
        }

        return domicilios.toList()
    }