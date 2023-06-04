class Robot (val name : String) {


    fun ringTheAlarm(today : String ,days : List<String>){
        if (today in days){
            println("Today is $today!")
            println("Alarm is ringing.")
        }
        else{
            println("Today is $today!")
            println("Today is Holiday!")
        }
    }

    fun makeCoffee(type:String, sugarLevel: String?){
            println("$name is Making Coffee for you of '$type' type and Sugar Level is '$sugarLevel'.")
    }

    fun heatTheWater(temp: String?, bathing: Boolean){
            if (bathing){
                println("Please heat water at '$temp' degree celsius temperature.")
            }
            else{
                println("Today, I am not bathing.")
            }
    }

    fun packBag(today: String, days: List<String>, listOfSubject: List<List<String>>){
        if (today in days) {
            if (today == "Monday") {
                println("Please pack my bag:")
                println("Put these books in my bag => ")
                for (subject in listOfSubject[0]) {
                    println(subject)
                }
            }
            else if (today=="Tuesday"){
                println("Please pack my bag:")
                println("Put these books in my bag => ")
                for (subject in listOfSubject[1]) {
                    println(subject)
                }
            }
            else if (today=="Wednesday"){
                println("Please pack my bag:")
                println("Put these books in my bag => ")
                for (subject in listOfSubject[2]) {
                    println(subject)
                }
            }
            else if (today=="Thursday"){
                println("Please pack my bag:")
                println("Put these books in my bag => ")
                for (subject in listOfSubject[3]) {
                    println(subject)
                }
            }
            else if (today=="Friday"){
                println("Please pack my bag:")
                println("Put these books in my bag => ")
                for (subject in listOfSubject[4]) {
                    println(subject)
                }
            }
            else{
                println("")
            }
        } else {
            println("Today, I am not going anywhere.")
        }
    }

    fun cookFood(today: String, days: List<String>, regularBreakFast:List<String>, regularLunch:List<String>){
        val breakFast = regularBreakFast.random()
        val lunch = regularLunch.random()
        if(today in days){
            println("Today $name is cooking '$breakFast' for you in breakfast and '$lunch' in lunch.")
        }
        else{
            println("$name will cook '$lunch' for you in lunch.")
        }

    }

    fun ironClothes(today: String,days: List<String>,cloth:String){
        if(today in days){
            println("I wear $cloth ,Please iron my Clothes.")
        }
        else{
            println("I wear normal clothes today.")
        }
    }
}
