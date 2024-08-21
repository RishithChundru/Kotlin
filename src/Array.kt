fun main(){
    // Array of integers
    val numbers= arrayOf(1,2,3,4,5)
    // Array of Strings
    val words: Array<String> =arrayOf("Kotlin","Java","Python")
    // Array of squares using lambda function
    val squares= Array(5){i->i*i}
    // Accessing the elements
    val firstNumber=numbers[0]
    val secondWord=words[1]
    // Modifying Elements
    numbers[0]=10
    words[1]="Kotlin"
    println("Modified first numbers: ${numbers[0]}")
    println("Modified second word: ${words[1]}")
    // iterating over arrays
    // Using Loops
    for(num in numbers){
        println(num)
    }
    // Using For Each function
    println("Words array using foreach loop")
    words.forEach { word-> println(word) }
    // Properties of array
    val size=numbers.size
    println("Size of numbers array: $size")
    // is empty and is notempty functions
    if(numbers.isEmpty()){
        println("Numbers array is empty")
    }
    else{
        println("Numbers array is not empty")
    }
    val firstElement=numbers.first()
    val lastElement=numbers.last()
    println("First Element: $firstElement")
    println("Last Element: $lastElement")
    val index=words.indexOf("Kotlin")
    println("Index of kotlin: $index")
}