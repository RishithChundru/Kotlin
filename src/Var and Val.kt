// Var is mutable and we can reassign the value to the variable.
fun main(args: Array<String>){
    var age: Int = 40
    println(age)
    age=42
    println(age)

// Val is immutable and we cannot reassign the value again.
    val a: Int = 40
    println(age)
    //a=50
    print(age)
}
