// find fibonacci using class and object
import java.util.Scanner

class Fibonacci{
    var sc = Scanner(System.`in`)
    var num1:Int = 0
    var num2:Int = 1
    var term:Int = 3
    var temp:Int = 0

    fun input() {
        var sc = Scanner(System.`in`)

        println("How many terms you want: ")
        term = sc.nextInt()
    }

    fun findFibonacci(){
        input()

        if(term <= 0){
            println("Term must be greater than 0!!")
        }
        else{
            println("First $term term: ")
            for(i in 1..term){
                print("$num1 ")

                temp = num1 + num2
                num1 = num2
                num2 = temp
            }
        }
    }
}

fun main(){
    val fibo = Fibonacci()
    fibo.findFibonacci()
}
