// bill maker for gold purchase

import java.util.Scanner

fun main(){
    var sc = Scanner(System.`in`)

    var name:String
    var number:Long
    var age:Int
    var gender:String
    var goldRate:Int = 4680
    var gramPurchased:Int
    var goldAmount:Int
    var makingCharges:Int = 540
    var discount:Int = 0
    var discountAmount:Int = 0
    var bill:Int = 0

    println("Enter Your Name: ")
    name = sc.next()

    while(true) {
        println("Enter Contact Number: ")
        number = sc.nextLong()

        if (number.toString().length != 10) {
            println("XXXXXXXXXXXXXXXXXXXXXXXXX")
            println("Number must be 10 digits long!!!")
            println("XXXXXXXXXXXXXXXXXXXXXXXXX")
            continue
        }
        else{
            break
        }
    }

    while(true){
        println("Enter Your Age: ")
        age = sc.nextInt()

        if(age <= 0 || age > 100){
            println("XXXXXXXXXXXXXXXXXXXXXXXXX")
            println("Age should be between 1 to 100!!!")
            println("XXXXXXXXXXXXXXXXXXXXXXXXX")
            continue
        }
        else{
            break
        }
    }

    while(true){
        println("Press 'M' or 'm' for Male.")
        println("Press 'F' or 'f' for Female.")
        println("Enter Your Gender: ")
        gender = sc.next()

        if(gender == "M" || gender == "m" || gender == "F" || gender == "f"){
            break
        }
        else{
            println("XXXXXXXXXXXXXXXXXXXXXXXXX")
            println("Enter Valid Gender!!!")
            println("XXXXXXXXXXXXXXXXXXXXXXXXX")

            continue
        }
    }

    println("Enter Grams You Purchased: ")
    gramPurchased = sc.nextInt()

    goldAmount= (goldRate * gramPurchased)

    if(gender == "M" || gender == "m"){
        if(age >= 65){
            if(goldAmount >= 100000 && goldAmount < 200000){
                discount = 20
            }
            else if(goldAmount >= 200000 && goldAmount < 300000){
                discount = 30
            }
            else if(goldAmount >= 300000){
                discount = 50
            }
        }
        else if(age <65){
            if(goldAmount >= 100000 && goldAmount < 200000){
                discount = 10
            }
            else if(goldAmount >= 200000 && goldAmount < 300000){
                discount = 20
            }
            else if(goldAmount >= 300000){
                discount = 30
            }
        }
    }

    else if(gender == "F" || gender == "f"){
        if(age >= 65){
            if(goldAmount >= 100000 && goldAmount < 200000){
                discount = 25
            }
            else if(goldAmount >= 200000 && goldAmount < 300000){
                discount = 35
            }
            else if(goldAmount >= 300000){
                discount = 55
            }
        }
        else if(age < 65){
            if(goldAmount >= 100000 && goldAmount < 200000){
                discount = 15
            }
            else if(goldAmount >= 200000 && goldAmount < 300000){
                discount = 25
            }
            else if(goldAmount >= 300000){
                discount = 35
            }
        }
    }

    discountAmount = (goldAmount * discount) / 100
    bill = goldAmount + makingCharges - discountAmount

    println()
    println("***********************************")
    println("Name: $name")
    println("Age: $age")
    println("Gender: $gender")
    println("Contact Number: $number")
    println("Gold Rate Toady: $goldRate Rs.")
    println("Gold Purchased: $gramPurchased gram")
    println("------------------------------")
    println("$goldAmount Rs. : Gold Amount")
    println("-")
    println("$discountAmount Rs. : Discount Amount (Discount: $discount%)")
    println("+")
    println("$makingCharges Rs. : Making Charges")
    println("------------------------------")
    println("$bill Rs. : Payable Amount")
    println("***********************************")
}
