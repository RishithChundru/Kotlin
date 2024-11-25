// Ensure this is the only class named Person in your file/project
class person1(val name: String) {
    init {
        println("This is first init block")
        println("This is second init block")
        println("This is third init block")
        println("Name = $name")
    }
}

fun main(args: Array<String>) {
    val Person = person1("Geeks")
}
