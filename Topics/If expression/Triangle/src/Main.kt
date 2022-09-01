fun main() {
    // write your code here
    val one = readln().toInt()
    val two = readln().toInt()
    val three = readln().toInt()
//    println(
//        if (one * one + two * two == three * three) {
//            "YES"
//        } else "NO"
//    )


    println(
        if (((one + two) > three && (two + three) > one && (one + three) > two)
            && one > 0 && two > 0 && three > 0
        ) "YES" else "NO"
    )
}