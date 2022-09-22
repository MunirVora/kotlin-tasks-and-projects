// Kotlin Program to Find the Frequency of Character in a String

fun main(){
    var string:String = "Hello World!"
    var char:Char = 'l'
    var frequency:Int = 0

//    for(i in 0..string.length - 1)
    for(i in string.indices){
        if(char == string[i]){
            frequency++
        }
    }

    println("The frequency of character '$char' is: $frequency")
}
