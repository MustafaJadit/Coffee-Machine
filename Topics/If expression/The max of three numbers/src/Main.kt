fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(
        if (a > c) {
            // put your code here
            var max: Int = b
            if (a > b) {
                max = a
            }
            max
        } else {
            // and here
            var max: Int = b
            if (c > b) {
                max = c
            }
            max
        }
    )
}