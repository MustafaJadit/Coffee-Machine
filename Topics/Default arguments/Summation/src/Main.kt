fun sum5(a1: Int =0, a2: Int=0, a3: Int=0, a4: Int=0, a5: Int=0): Int {
    // TODO
    var sum: Int
    sum = a1?.plus(a2) ?: a1
    sum = sum?.plus(a3) ?: sum
    sum = sum?.plus(a4) ?: sum
    sum = sum?.plus(a5) ?: sum

//    if (a1?.plus(a2).plus(a3)!=null)
//    return a1?.plus(a2)? = .plus(a3).plus(a4).plus(a5)
    return sum
}
