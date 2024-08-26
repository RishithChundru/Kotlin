fun main(){
    val a="hi"
    val b: String = a as String
    println("Unsafe cast Result: $b")
    // val c : Int= a as Int
    // println("This line will not be executed:$c")
    val d: String?= a as? String //Successful safe cast
    if(d!=null){
        println("Safe cast Result: $d")
    }
    else{
        println("Safe cast to string failed")
    }
    val e: Int?= a as? Int // safe cast will return null
    if(e!=null){
        println("Safe cast result:$e");
    }
    else{
        println("Safe cast to int is failed.")
    }
}