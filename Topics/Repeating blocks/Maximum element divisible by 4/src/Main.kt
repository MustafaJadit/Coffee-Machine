fun main() {
    // put your code here
    var max = 0
    repeat(readln().toInt()) {
        val number = readln().toInt()
        if (number % 4 == 0 && max < number) {
            max = number
        }
    }
    println(max)
}