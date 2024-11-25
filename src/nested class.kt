fun main(args: Array<String>){
    val obj=Outer.Nested()
    obj.AA()
}
class Outer{
    class Nested{
        fun AA(){
            println("Welcome to LPU")
        }
    }
}