// check the entered number from user is prime number or not using class and object
import java.util.Scanner

class PrimeNumber{
    var num:Int = 0
    var flag:Boolean = false

    fun input() {
        var sc = Scanner(System.`in`)

        println("Enter Number: ")
        num = sc.nextInt()
    }

    fun checkPrime(){
        input()
        // check if number is prime number or not
        if(num < 0){
            println("Negative numbers cannot be prime.")
            return
        }
        else if(num == 0 || num == 1){
            flag = true
        }
        else{
            for(i in 2.. num / 2){
                if(num % i == 0){
                    flag = true
                    break
                }
            }
        }

        // print the number is a prime number or not
        if(!flag){
            println("$num is a prime number.")
        }
        else{
            println("$num is not a prime number.")
        }
    }
}

fun main(){
    val primeNumber = PrimeNumber()
    primeNumber.checkPrime()
}