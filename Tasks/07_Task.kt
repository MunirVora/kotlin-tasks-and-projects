// take 5 numbers from user and store sum of even and odd numbers separately
import java.util.Scanner

fun main(){
    var sc = Scanner(System.`in`)
    var i:Int
    var evenSum:Int = 0
    var oddSum:Int = 0

    for(i in 1..5){
        println("Enter number: ")
        var num:Int = sc.nextInt()

        if(num % 2 == 0){
            evenSum += num
        }
        else {
            oddSum += num
        }
    }

    println("********************")
    println("Sum of even numbers: $evenSum")
    println("Sum of odd numbers: $oddSum")
    println("********************")
}
