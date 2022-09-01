// complete this function, add default values
fun carPrice(old: Int = 5, kilometers: Int = 100_000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    println(
        20000 - old * 2000 - (120 - maximumSpeed) * 100
                - kilometers / 10_000 * 200 + if (automatic) 1500 else 0
    )
}
