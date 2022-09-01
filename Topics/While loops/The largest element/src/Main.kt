fun main() {
    // put your code here
    var max = 0
    do {
        val n = readln().toInt()
        if (n > max) {
            max = n
        } else if (n == 0) {
            break
        }

    } while (true)
    println(max)
}