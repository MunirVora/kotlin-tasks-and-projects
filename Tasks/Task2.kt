// find simple interest
import java.util.Scanner

fun main(){
    var principalBalance:Float?
    var rate:Float?
    var time:Float?
    var interest:Float?

    var sc = Scanner(System.`in`)

    println("Enter Principal Balance: ")
    principalBalance = sc.nextFloat()

    println("Enter Rate: ")
    rate = sc.nextFloat()

    println("Enter Time: ")
    time = sc.nextFloat()

    interest = (principalBalance * rate * time) / 100

    println("********************")
    println("Simple Interest: $interest")
    println("********************")
}