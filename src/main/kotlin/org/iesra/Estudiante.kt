package org.iesra

class Estudiante (private val nombre: String) {

    private var nota:Double = 0.0

    fun setNota(nota: Double) {
        require(nota in 0.0..10.0) { "La nota debe estar entre 0 y 10" }
        this.nota = nota
    }

    override fun toString(): String {
        return "Estudiante(nombre=$nombre, nota=$nota)"
    }
}

fun main() {

    // Crea varios estudiantes
    var estudiante1: Estudiante = Estudiante("Paco pepe")
    var estudiante2: Estudiante = Estudiante("Francisco Jose")
    var estudiante3: Estudiante = Estudiante("Daniel Felipe")

    // intenta asignarles notas fuera del rango
    estudiante1.setNota(12.0)
    estudiante2.setNota(13.0)
    estudiante3.setNota(14.0)

    // mostrar detalles
    println(estudiante1)
    println(estudiante2)
    println(estudiante3)

}
