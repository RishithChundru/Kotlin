fun celToFah(temp:Int):Int{
    val f=((9/5)*temp)+32
    return f
}
fun fahToCel(temp:Int):Int{
    val c=((temp-32)*(5/9))
    return c
}
fun main(){
    val cel=40
    val fah=100
    val result1=celToFah(cel)
    val result2=fahToCel(fah)
    println(result1)
    println(result2)
}