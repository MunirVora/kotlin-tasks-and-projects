// accept days and convert it into years and months
import java.util.Scanner

fun main(){
    var sc = Scanner(System.`in`)
    var day:Int
    var month:Int
    var year:Int

    println("Enter Days: ")
    day = sc.nextInt()

    month = day / 30
    year = day / 365

    println("********************")
    println("Day: $day")
    println("Month: $month")
    println("Year: $year")
    println("********************")

}