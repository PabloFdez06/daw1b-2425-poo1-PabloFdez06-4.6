data class Domicilio(private val calle: String, private val numero: Int,) {
    override fun toString(): String {
        return "Calle $calle, Número: $numero"
    }
}