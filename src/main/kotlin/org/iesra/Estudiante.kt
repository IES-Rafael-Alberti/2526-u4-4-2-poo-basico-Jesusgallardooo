package org.iesra

class Estudiante (private val nombre: String, nota:Int) {



    var nota: Int = nota
        set(value) {
            require(value in 0..10) { "La nota debe estar entre 0 y 10" }
            field = value
        }

    init {
        require(nota in 0..10) { "La nota inicial debe estar entre 0 y 10" }
    }

    override fun toString(): String {
        return "Estudiante(nombre=$nombre, nota=$nota)"
    }
}

fun main() {

    // Crea varios estudiantes y muestra sus detalles.
    var estudiante1: Estudiante = Estudiante("Paco pepe", 9)
    var estudiante2: Estudiante = Estudiante("Francisco Jose", 1)
    var estudiante3: Estudiante = Estudiante("Daniel Felipe", 5)

    // intenta asignarles notas fuera del rango
    estudiante1.nota = 12
    estudiante2.nota = 15
    estudiante3.nota = 11

    // mostrar detalles
    println(estudiante1)
    println(estudiante2)
    println(estudiante3)

}
