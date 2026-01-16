package org.iesra

class Estudiante(private val nombre: String) {

    var nota: Double = 0.0
        set(value) {
            require(value in 0.0..10.0) { "La nota debe estar entre 0 y 10" }
            field = value
        }

    override fun toString(): String {
        return "Estudiante: $nombre, Nota: $nota"
    }
}


fun main() {

    // Crea varios estudiantes
    var estudiante1: Estudiante = Estudiante("Paco pepe")
    var estudiante2: Estudiante = Estudiante("Francisco Jose")
    var estudiante3: Estudiante = Estudiante("Daniel Felipe")

    // intenta asignarles notas fuera del rango
    estudiante1.nota = 12.0
    estudiante2.nota = 13.0
    estudiante3.nota = 14.0

    // mostrar detalles
    println(estudiante1)
    println(estudiante2)
    println(estudiante3)

}
