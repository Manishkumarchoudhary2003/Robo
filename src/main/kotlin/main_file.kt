import java.util.*

fun main(){

    val robot = Robot("AI Robo")
    val all_days = listOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","sunday")
    val days = listOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday")
    val today = all_days.random()
    val breakfast = mutableListOf<String>("Oats Upma","Chole","Vada Pav","Idli","Dosa")
    val lunch = mutableListOf<String>("Palak paneer","Aloo gobi","Chana masala","Dal makhani","Paneer pulao")
    val monday = listOf<String>("Maths","English")
    val tuesday = listOf<String>("Physics","Hindi")
    val wednesday = listOf<String>("Chemistry","EEE")
    val thursday = listOf<String>("Python","Java")
    val friday = listOf<String>("Mechanical","Computer")
    val listOfSubject = listOf<List<String>>(monday,tuesday,wednesday,thursday,friday)

    println("Do you want to add items in your Breakfast {Input Format 'Yes' or 'No'} :")
    val changeBreakfastList = readlnOrNull()?.uppercase(Locale.getDefault())

    if (changeBreakfastList == "YES") {
        println("Enter the number of items:")
        val n = readlnOrNull()?.toIntOrNull()

        if (n != null) {
            for (i in 1..n) {
                println("Enter item $i:")
                val newBreakfast = readlnOrNull()
                if (newBreakfast != null) {
                    breakfast.add(newBreakfast)
                }
            }
        }
    }

    println("Do you want to add items in your Lunch {Input Format 'Yes' or 'No'} :")
    val changeLunch = readlnOrNull()?.uppercase(Locale.getDefault())
    if(changeLunch=="YES"){
        println("Enter number of Items : ")
        val n = readlnOrNull()?.toIntOrNull()
        if (n != null) {
            for (i in 1..n) {
                println("Enter item $i:")
                val newLunch = readlnOrNull()
                if (newLunch != null) {
                    breakfast.add(newLunch)
                }
            }
        }

    }

    println("Enter your coffee type would you want : ")
    val coffee = readlnOrNull()

    println("Enter Level of Sugar in gram : ")
    val sugar_level = readlnOrNull()

    println("Enter Water temperature would you prefer to bath : ")
    val temp = readlnOrNull()

    println("Will you take a shower today {Input Format is in Yes or No} : ")
    val bath = readlnOrNull()?.uppercase(Locale.getDefault())

    println("What will you wear today !")
    val cloth = readlnOrNull()



    robot.ringTheAlarm(today,days)
    println("----------------------------------------")

    if (coffee != null) {
        robot.makeCoffee(coffee,sugar_level)
    }
    println("----------------------------------------")

    if(bath=="YES"){
        robot.heatTheWater(temp,true)
    }
    else {
        robot.heatTheWater(temp, false)
    }
    println("----------------------------------------")

    robot.packBag(today,days,listOfSubject)
    println("----------------------------------------")

    robot.cookFood(today,days,breakfast,lunch)
    println("----------------------------------------")

    if (cloth != null) {
        robot.ironClothes(today,days,cloth)
    }
    println("----------------------------------------")
}
