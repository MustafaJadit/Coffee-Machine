fun main(args: Array<String>) {
    // write your code here
    val speed = readln().toInt()
    val limitString = readln()
    if (limitString == "no limit") speed(speed) else speed(speed, limitString.toInt())
}



fun speed(speed: Int, limit: Int = 60) {
    if (speed - limit > 0) {
        println("Exceeds the limit by ${speed - limit} kilometers per hour")
    } else {
        println("Within the limit")
    }

}
