package org.iesra

class Vehiculo (val marca: String, val modelo:String, var kilometraje:Double = 0.0){

    fun registrarViaje(distancia:Double){
        if (distancia>0){
            kilometraje += distancia
        }else{
            throw IllegalArgumentException("No puedes moverte una distancia nula o negativa.")
        }
    }

    override fun toString(): String {
        return "Vehiculo=(marca=$marca, modelo=$modelo, kilometraje=$kilometraje)"
    }

}

fun main(){
    // Crear vehículo
    var vehiculo: Vehiculo = Vehiculo("Ford", "Fiesta")

    // Realizar viaje
    vehiculo.registrarViaje(100.0)

    // Mostrar vehículo
    println(vehiculo)
}