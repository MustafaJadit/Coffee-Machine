import java.util.Scanner

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val one = scanner.nextInt()
    val two = scanner.nextInt()
    val three = scanner.nextInt()
    println(one in three..two || one in two..three)
}