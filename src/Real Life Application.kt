fun main(){
    println("Enter Amount: ")
    val totAmount: Int= Integer.valueOf(readLine())
    var Membership: Boolean= false
    val Discount: Double
    if(totAmount>=1000){
        if(Membership==true){
            Discount= totAmount*0.2
            println("You have got 20% discount i.e $Discount")
        }
        else{
            Discount= totAmount*0.1
            println("You have got 10% discount i.e $Discount")
        }
    }
    else{
        println("No Discount")
    }
}