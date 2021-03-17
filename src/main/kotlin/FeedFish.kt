import java.util.*

fun FeedFish() {
    val day = randomDay()
    var fishFood = fishFood(day)
//    val food = "狗屎"
    println("Toady is $day and the fish eat $fishFood")
}

fun randomDay(): String {
    val week = arrayOf("one", "two", "three")
    return week[Random().nextInt(week.size)]
}

fun main() {

    FeedFish()

    swim();
}

fun fishFood(day: String): String {
    var food = "";
    when (day) {
//        "one" -> food = "one的food"
        "two" -> food = "two的food"
        "three" -> food = "three的food"
        else -> food = "其他时候的food"
    }
    return food
}

fun shouldChangeWater(day: String){

}


fun fishFoodPro(day: String): String {
    return when (day) {
//        "one" -> food = "one的food"
        "two" -> "two的food"
        "three" -> "three的food"
        else -> "其他时候的food"
    }
}

fun swim(speed: String = "fast") {
    println("speed is $speed")
}