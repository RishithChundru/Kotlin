import java.util.Scanner;
fun celToFah(temp:Int):Int{
    val f=((9/5)*temp)+32
    return f
}
fun fahToCel(temp:Int):Int{
    val c=((temp-32)*(5/9))
    return c
}
fun main(){
    val sc=Scanner(System.`in`)
    val cel=sc.nextInt()
    val fah=sc.nextInt()
    val result1=celToFah(cel)
    val result2=fahToCel(fah)
    println(result1)
    println(result2)
}