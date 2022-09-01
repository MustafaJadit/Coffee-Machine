fun main() {
    // put your code here
    var larger = 0
    var smaller = 0
    var perfect = 0
    repeat(readln().toInt()) {
        val number = readln().toInt()
        when (number) {
            -1 -> smaller++
            +1 -> larger++
            else -> perfect++
        }
    }
    println("$perfect $larger $smaller")
}