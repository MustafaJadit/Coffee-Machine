fun main() {
    // put your code here
    var positiveNumber = 0
    repeat(readln().toInt()) {
        val number = readln().toInt()
        if (number > 0) {
            positiveNumber++
        }
    }
    println(positiveNumber)
}