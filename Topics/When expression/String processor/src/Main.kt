fun main() {
    // write your code here
    val s1 = readln()
    val operator1 = readln()
    val s2 = readln()
    println(
        when (operator1) {
            "equals" -> s1 == s2
            "plus" -> s1 + s2
            "endsWith" -> s1.endsWith(s2)
            else -> "Unknown operation"
        }
    )
}