// find area of circle
import java.util.Scanner

fun main(){
    var sc = Scanner(System.`in`)
    var radius:Float
    var area:Float

    println("Radius: ")
    radius = sc.nextFloat()

    area = (3.14155929f * radius * radius)

    println("********************")
    println("Area of Circle: $area")
    println("********************")
}