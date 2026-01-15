package org.iesra

class Libro (private val titulo:String, private val autor:String, private val numPaginas: Int = 100, private var leido: Boolean = false) {

    init {
        require(titulo.isNotBlank()) { "El título no puede estar vacío" }
        require(autor.isNotBlank()) { "El autor no puede estar vacío" }
        require(numPaginas in 1..5000) { "El número de páginas debe estar entre 1 y 5000" }
    }

    constructor(titulo: String, autor: String) : this(
        titulo,
        autor,
        numPaginas = 100,
        leido = false
    )

    override fun toString(): String {
        return "Libro=(titulo=$titulo, autor=$autor, titulo=$titulo, leido=$leido)"
    }

}

fun main(){

    // Crear 2 libros, uno leído y uno sin leer.
    var libro1 : Libro = Libro("El mago de Oz", "Paco pepe", 280, false)
    var libro2 : Libro = Libro("Harry potter", "JuanKa roulin", 340, true)

    // Crear un libro con titulo vacío.
    var libro3 : Libro = Libro("", "Pepe", 280, false)

}