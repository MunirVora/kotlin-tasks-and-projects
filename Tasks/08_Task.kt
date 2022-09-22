// make a class with method that take inputs and another method that display the input numbers
import java.util.Scanner

class Student{
    var num1:Int = 0
    var num2:Int = 0

    fun input(){
        var sc = Scanner(System.`in`)

        println("Enter Number 1: ")
        num1 = sc.nextInt()

        println("Enter Number 2: ")
        num2 = sc.nextInt()
    }

    fun display(){
        input()
        println("Number 1: $num1")
        println("Number 2: $num2")
    }
}

fun main(){
    val obj = Student()
    obj.display()
}
