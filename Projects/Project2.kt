// KBC app using functions
// Each question has different functions
import java.util.Scanner

fun que1(): String {
    val que = """
1) How many hours are there in a day?
    A) 24 hours        B) 20 hours
    C) 30 hours        D) 34 hours
    """

    return que
}

fun que2(): String {
    val que = """
2) How many minutes are there in an hour?
    A) 30 minutes      B) 40 minutes
    C) 120 minutes     D) 60 minutes
    """

    return que
}

fun que3(): String {
    val que = """
3) How many seconds are there in a minute?
    A) 30 seconds      B) 20 seconds
    C) 60 seconds      D) 40 seconds
    """

    return que
}

fun que4(): String {
    val que = """
4) Which is the smallest month of the year?
    A) March           B) February
    C) June            D) December
    """

    return que
}

fun que5(): String {
    val que = """
5) How many sides are there in a triangle?
    A) One             B) Two
    C) Three           D) Four
    """

    return que
}

fun que6(): String {
    val que = """
6) Name the largest planet of our Solar System?
    A) Jupiter         B) Earth
    C) Saturn          D) Mars
    """

    return que
}

fun que7(): String {
    val que = """
7) Name the planet known as the Red Planet?
    A) Earth           B) Mercury
    C) Mars            D) Neptune
    """

    return que
}

fun que8(): String {
    val que = """
8) 1 + 2 = ?
    A) 12              B) 1
    C) 3               D) 5
    """

    return que
}

fun que9(): String {
    val que = """
9) "123" + "456" = ?
    A) 579              B) 456123
    C) 679              D) 123456
    """

    return que
}

fun que10(): String {
    val que = """
10) 200 * 0 = ?
    A) 2000             B) 0
    C) 200              D) 2
    """

    return que
}

fun welcomeMsg(){
    val welcomeMsg:String = """
                WELCOME TO KBC
      
             Let's Start the Game.
    """
    println(welcomeMsg)
}

fun showQueAndCheckAns(){
    var sc = Scanner(System.`in`)
    var que = arrayOf<String>(que1(), que2(), que3(), que4(), que5(), que6(), que7(), que8(), que9(), que10())
    var ans = arrayOf<String>("A", "D", "C", "B", "C", "A", "C", "C", "D", "B")
    var score:Int = 0

    for(i in 0..9){
        println("**************************************************")
        println(que[i])
        println("**************************************************")


        while(true) {
            println("Ans : ${ans[i]}")
            println("Enter your Answer: ")
            val userAns:String = sc.next().uppercase()

            if (userAns >= "A" && userAns <= "D") {
                if(userAns == ans[i]){
                    score++
                    println("------------------------------")
                    println("        Correct Answer!")
                    println("        Score: $score / 10")
                    println("------------------------------")
                    break
                }
                else{
                    println("------------------------------")
                    println("        Wrong Answer!")
                    println("        Score: $score / 10")
                    println("------------------------------")
                    break
                }
            }
            else{
                println("Invalid Choice!")
                continue
            }
        }
        if(i == 9){
            return
        }
        println("Enter any key for the next question: ")
        sc.next()
    }
}

fun main(){
    welcomeMsg()
    showQueAndCheckAns()
}
