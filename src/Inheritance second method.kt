fun main(){
    val objChild=child()
    objChild.myMethod()
    objChild.myMethod2()
}
open class parent{
    init{
        println("Parent Constructor is called")
    }
    var name: String=""
    fun myMethod(){
        println("I am parent")
    }
}
class child:parent(){
    init{
        println("child constructor is called")
    }
    var name2:String=""
    fun myMethod2(){
        println("I am child")
    }
}