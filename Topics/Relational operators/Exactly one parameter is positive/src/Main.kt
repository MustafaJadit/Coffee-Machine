fun main() {
    // put your code here
    val one = readln().toInt()
    val two = readln().toInt()
    val three = readln().toInt()
    println(
        (one > 0 && two <= 0 && three <= 0)
                || (two > 0 && one <= 0 && three <= 0)
                || (three > 0 && one <= 0 && two <= 0)
    )
}