package za.ac.up.extensions

fun printSatisfiable(startT: Long, endT: Long, timestamp: Int) {
    println()
    println("__________________________________________________________________________________________________")
    println()
    println()
    println("                               Satisfiable at timestamp: $timestamp")
    println("                               Time elapsed since start: ${(endT - startT)/1000000000}s")
    println()
    println("__________________________________________________________________________________________________")
}

fun printStepStat(timeNs: Long) {
    println("....${timeNs/1000000}ms    ")
}

fun printNoErrorFound(startT: Long, endT: Long, maxBound: Int) {
    println()
    println("No error found for bound of $maxBound")
    println("Total Time: ${(endT - startT)/1000000000}s")
}