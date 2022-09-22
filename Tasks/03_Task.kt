// accept years and convert it into no. of months and days
import java.util.Scanner

fun main(){
    var sc = Scanner(System.`in`)
    var year:Int
    var month:Int
    var day:Int

    println("Enter Years: ")
    year = sc.nextInt()

    month = year * 12
    day = year * 365

    println("********************")
    println("Year: $year")
    println("Month: $month")
    println("Day: $day")
    println("********************")

}
