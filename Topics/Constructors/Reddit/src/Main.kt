data class Site(val address: String, val foundationYear: Int)

// Write the makeReddit function here


const val ADDRESS = "reddit.com"
fun makeReddit(): Site {
    return Site(ADDRESS, 2005)
}