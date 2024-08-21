// Escaped string is declared within double quotes(" ") and may contain escape characters like: '\n','\t','\b'
fun main(){
    val x: String = "I am escaped String\n"
    var y: String = """This is going to be a
multi-line string and will 
not have any escape sequence"""
    println(x)
    println(y)
}