import java.util.*

class Robot(val name: String) {

    fun ringAlarm(time: String) = println("Good morning!! Its $name, The time is already $time, Wake up!!!")

    fun makeCoffee(coffee: Coffee) = if (coffee.black) {
        println("Your black coffee with ${coffee.sugarQuantity} spoons of sugar is ready!")
    } else {
        println("Your coffee with ${coffee.sugarQuantity} spoons of sugar is ready!")
    }

    fun heatWater(temperature: Int) = println("Bath water with $temperature°C is ready, take a bath now!")

    fun packBag(day: Int) {
        val messageTemplate = "Books kept for today are : "
        val subjects =
            arrayOf("Maths", "Physics", "Chemistry", "English", "Computer", "Biology", "Humanities")

        when (day) {
            Calendar.MONDAY -> println("$messageTemplate ${subjects[0]}, ${subjects[1]}, ${subjects[2]}")
            Calendar.TUESDAY -> println("$messageTemplate ${subjects[0]}, ${subjects[1]}, ${subjects[2]}")
            Calendar.WEDNESDAY -> println("$messageTemplate ${subjects[3]}, ${subjects[4]}")
            Calendar.THURSDAY -> println("$messageTemplate ${subjects[3]}, ${subjects[4]}")
            Calendar.FRIDAY -> println("$messageTemplate ${subjects[5]}, ${subjects[6]}")
            else -> println("Invalid day or maybe today is holiday!!")
        }
    }

    fun cookBreakfastLunch() {
        val breakfast = mutableListOf("Cereals", "Brown Bread", "Oats", "Sandwiches", "Banana")
        val lunch =
            mutableListOf("Egg Curry", "Salad", "Fish Curry", "Veg Manchurian", "Chilli Chicken")
        println("Today's breakfast is ${breakfast.random()} and lunch is ${lunch.random()}")
    }

    fun ironClothes(shirtColour: String, trouserColour: String) {
        val shirtColors = mutableListOf("Blue", "Green", "Orange", "Red", "Yellow", "Black")
        val trouserColors = mutableListOf("Blue", "Black", "Grey")

        if (shirtColors.contains(shirtColour)) {
            if (trouserColors.contains(trouserColour)) {
                println("Your Clothes are ready to wear!!")
            } else
                println("You do not have trouser of this color. Maybe we should go for shopping.")
        } else
            println("You do not have shirt of this color. Maybe we should go for shopping.")
    }
}