fun main() {
    // write your code here
    val unit1: Int = readLine()!!.toInt()
    println(
        when {
            unit1 < 1 -> "no army"
            unit1 in 1..4 -> "few"
            unit1 in 5..9 -> "several"
            unit1 in 10..19 -> "pack"
            unit1 in 20..49 -> "lots"
            unit1 in 50..99 -> "horde"
            unit1 in 100..249 -> "throng"
            unit1 in 250..499 -> "swarm"
            unit1 in 500..999 -> "zounds"
            unit1 >= 1000 -> "legion"
            else -> "legion"
        }
    )
}