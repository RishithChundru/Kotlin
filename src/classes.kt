// variables declared inside a class can be accessed by all methods in the class
class Person{
    var name: String="John Doe"
    val age: Int =30
    fun displayinfo(){
        println("Name: $name, Age: $age")
    }
}
fun main(){
    val person=Person()
    person.displayinfo()
}