package org.iesra


class CuentaBancaria ( private val titular: String, private var saldo: Double = 0.0) {

    fun ingresar(cantidad:Double): String{
        if (cantidad >= 0){
            saldo += cantidad
        }else {
            throw IllegalArgumentException("No puedes ingresar una cantidad nula o negativa.")
        }
        return "Saldo final: $saldo"
    }

    fun retirar(cantidad:Double): String{
        if (cantidad > saldo) {
            throw IllegalArgumentException("Saldo insuficiente.")
        }
        saldo -= cantidad
        return "Saldo final: $saldo"
    }

}


fun main(){

    // Crear cuenta bancaria con un titular.
    var cuentaBancaria: CuentaBancaria = CuentaBancaria("Jesús")

    // Realizar un ingreso y un retiro posibles
    cuentaBancaria.ingresar(100.0)
    cuentaBancaria.retirar(50.0)

    // Realizar un retiro que no pueda hacerse
    cuentaBancaria.retirar(60.0)

}