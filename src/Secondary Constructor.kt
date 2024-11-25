fun main(args: Array<String>){
    Add(5,6)
    Add(4.5,5.5)
}
class Add{
    constructor(a:Int,b:Int){
        var c=a+b
        println("The sum of numbers 5 and 6 is: ${c}")
    }
    constructor(a:Double,b:Double){
        var d=a+b
        println("The sum of numbers 5 and 6 is: ${d}")
    }
}
