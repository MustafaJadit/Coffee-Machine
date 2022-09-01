class City(val name: String) {
    var population: Int = 0
        get() {
            return if (field < 0) 0 else if (field > 50_000) 50000 else field
        }
}