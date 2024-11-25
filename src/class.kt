fun main(){
    val a=Car(name="mustang",type="petrol",kmRan=100)
    val b=Car(name="beetel",type="diesel",kmRan=200)
    println(a.name)
    println(a.type)
    println(b.name)
    println(b.type)
    a.driveCar()
    b.applyBrakes()
}
class Car(val name:String, val type:String,var kmRan: Int){
    fun driveCar() {       // Methods
        println("$name Car id driving")
    }
    fun applyBrakes(){
        println("$name Brakes applied")
    }
}