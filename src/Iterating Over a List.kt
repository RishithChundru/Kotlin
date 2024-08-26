fun main(){
    // When only elements need to be accessed
    val fruits= listOf("Apple","Banana","Cherry")
    for(i in fruits){
        println("Fruit: $i")
    }

    // When both element and index of the element need to be accessed
    val fruit= listOf("Apple","Banana","Cherry")
    for(index in fruit.indices){
        println("Fruit at index $index is ${fruit[index]}")
    }
}