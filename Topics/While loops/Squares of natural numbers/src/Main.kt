fun main() {
    // put your code here
    val num = readln().toInt()
    var currentNum = 0
    var index = 1
    while (currentNum <= num) {
        if (index * index > num) {
            break
        } else {
            currentNum = (index * index)
        }
        println(currentNum)
        index++
    }
}