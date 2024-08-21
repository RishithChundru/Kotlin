fun main(){
    var a=10
    var b=5
    val isTrue=true
    val isFalse=false
    val add=a+b

    // Arithmetic operators
    println("Addition: $a +$b = $add")
    println("Multiplication: $a * $b = ${a*b}")

    // Comparison Operators
    val isEqual= a==b
    println("$a == $b: $isEqual")
    println("$a > $b: ${a>b}")

    // Logical Operators
    val andResult= isTrue && isFalse
    val notResult= !isTrue
    println("$isTrue && $isFalse: $andResult")
    println("$isTrue: $notResult")

    // Assignment operators
    var c=a
    c+=b
    val inc=c
    println("c+= $b: $inc")

    // Bitwise operators
    val e=5
    val f=3
    val andBitwise= e and f
    println("e and f: $andBitwise")

    // Range and iterator operators
    val Range=1..5
    println("Range: $Range")
    println("Numbers in Range: ")
    for(i in Range){
        print("$i")
    }
    println()
}