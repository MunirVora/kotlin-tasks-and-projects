// find factorial using class and object
import java.util.Scanner

class Factorial{
    var num:Int = 0

    // takes number from the user
    fun input() {
        var sc = Scanner(System.`in`)

        println("Enter Number: ")
        num = sc.nextInt()
    }

    // find the factorial of the number that user entered
    fun findFactorial() {
        input()
        var fact = 1

        if(num == 0 || num == 1){
            fact = 1
        }
        else if(num > 1){
            for(i in 2..num){
                fact *= i
            }
        }
        else{
            println("Number must be greater than or equal to 0!!")
            return
        }

        println(fact)
    }
}

fun main(){
    val fact = Factorial()
    fact.findFactorial()
}
