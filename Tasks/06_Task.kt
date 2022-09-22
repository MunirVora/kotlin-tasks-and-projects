// accept number from user and check entered number is even or odd
import java.util.Scanner

fun main(){
    var sc = Scanner(System.`in`)
    var num:Int

    println("Enter number: ")
    num = sc.nextInt()

    if(num % 2 == 0){
        println("Number is even")
    }
    else{
        println("Number is odd.")
    }
}
