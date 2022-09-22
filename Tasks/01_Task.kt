// accept months from user and convert it into number of years
import java.util.Scanner

fun main(){
    var sc = Scanner(System.`in`)
    var month:Int?
    var year:Int?

    println("Enter months: ")
    month = sc.nextInt()

    year = month / 12

    println("********************")
    println("Month: $month month")
    println("Year: $year year ${month % 12} month")
    println("********************")
}
