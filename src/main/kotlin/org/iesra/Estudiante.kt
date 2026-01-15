package org.iesra

class Estudiante (private val nombre: String, nota:Int) {

    var nota: Int = nota
        set(value) {
            require(value in 0..10) { "La nota debe estar entre 0 y 10" }
            field = value
        }

    override fun toString(): String {
        return "Estudiante(nombre=$nombre, nota=$nota)"
    }
}

fun main() {
}
