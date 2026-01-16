package org.iesra

class Producto (private val nombre: String, private val precio: Double, private var stock: Int ) {

    init {
        require(stock > 0) {"El stock base debe ser positivo"}
        require(precio > 0) {"El precio base debe ser positivo"}
    }

    fun vender(cantidad:Int){
        if (cantidad <= 0 || cantidad > stock){
            throw IllegalArgumentException("Cantidad inválida")
        }else{
            stock -= cantidad
        }
    }

    fun reabastecer(cantidad:Int){
        if (cantidad <= 0){
            throw IllegalArgumentException("Cantidad inválida")
        }else{
            stock += cantidad
        }
    }

    override fun toString(): String {
        return "Producto=(nombre=$nombre, precio=$precio€, stock=$stock)"
    }
}

fun main() {

    // crear varios productos
    var producto1: Producto = Producto("iphone13", 529.99, 13)
    var producto2: Producto = Producto("Portatil Asus", 849.99, 5)
    var producto3: Producto = Producto("airpods pro", 299.99, 10)

    // usa sus métodos
    producto1.vender(10)
    producto2.vender(4)
    producto3.reabastecer(2)

    // muestra sus detalles
    println(producto1)
    println(producto2)
    println(producto3)

}