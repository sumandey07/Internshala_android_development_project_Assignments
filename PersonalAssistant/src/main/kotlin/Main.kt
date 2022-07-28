import java.util.*

fun main() {

    val robot = Robot("Jarvis")

    println("Hello!! My name is ${robot.name} and I will be your personal assistant.")
    println()

    robot.ringAlarm("7:00 AM")
    println()

    robot.makeCoffee(Coffee(true, 3))
    println()

    robot.heatWater(35)
    println()

    robot.packBag(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    println()

    robot.cookBreakfastLunch()
    println()

    robot.ironClothes("Blue", "Black")
    println()
}