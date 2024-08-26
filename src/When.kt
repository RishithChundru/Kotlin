/*fun main(){
    val dayOfWeek=3
    val dayName=when(dayOfWeek){
        1-> "Monday"
        2-> "Tuesday"
        3-> "Wednesday"
        4-> "Thursday"
        5-> "Friday"
        6-> "Saturday"
        7-> "Sunday"
        else-> "Invalid day"
    }
    println("Day of the week: $dayName")
}
*/
fun main(){
    val number=8
    when{
        number%2==0 -> println("$number is even")
        number%2!=0 -> println("$number is odd")
        else -> println("Unexpected number");
    }
}