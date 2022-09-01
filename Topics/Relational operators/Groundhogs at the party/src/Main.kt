fun main() {
    // write your code here
    val cups = readln().toInt()
    val isWeekend = readln().toBoolean()
    println(
        if (!isWeekend) cups >= 10 && cups <= 20
        else cups >= 15 && cups <= 25
    )
}