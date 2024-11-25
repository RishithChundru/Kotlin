open class ABC{
    open fun think(){
        println("Hey!! I am thinking")
    }
}
class BCD: ABC(){
    override fun think(){
        println("I am from child")
    }
}
fun main(){
    var a=BCD()
    a.think()
}