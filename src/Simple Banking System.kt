fun main(){
    var initial_Balance=25000
    println("Enter withdrawal Amount: ")
    var Withdrawal_Amount: Int= Integer.valueOf(readLine())
    if(Withdrawal_Amount>initial_Balance){
        println("Insufficient Funds")
    }
    else{
        var New_Balance=initial_Balance-Withdrawal_Amount
        println("New Balance: $New_Balance");
        println("Do you want to take more money(YES/NO): ");
        var input: String= readLine()!!
        while(input=="YES"){
            println("Enter withdrawal Amount: ")
            Withdrawal_Amount=Integer.valueOf(readLine())
            New_Balance=New_Balance-Withdrawal_Amount
            println("New Balance: $New_Balance")
            println("Do you want to take more money(YES/NO): ");
            input= readLine()!!
        }
    }
    println("Thank You visit again")
}