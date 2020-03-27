package za.ac.up.tvamcus.print

fun printSatisfiable(startT: Long, endT: Long, timestep: Int) {
    println()
    println("__________________________________________________________________________________________________")
    println()
    println()
    println("                               SATISFIABLE at timestep: $timestep")
    println("                               Time elapsed since start: ${(endT - startT)/1000000000}s  (${(endT - startT) / 1000000}ms)")
    println()
    println("__________________________________________________________________________________________________")
}

fun printUnknown(startT: Long, endT: Long, timestep: Int) {
    println()
    println("__________________________________________________________________________________________________")
    println()
    println()
    println("                               UNKNOWN after timestep: $timestep")
    println("                               Time elapsed since start: ${(endT - startT)/1000000000}s  (${(endT - startT) / 1000000}ms)")
    println()
    println("__________________________________________________________________________________________________")
}

fun printState(timeNs: Long, result: String) {
    println(" -> ${if (result == "TRUE") "T" else "F"}   ${timeNs/1000000}ms")
}

fun printNoErrorFound(startT: Long, endT: Long, maxBound: Int) {
    println()
    println("No error found for bound of $maxBound")
    println("Total Time: ${(endT - startT)/1000000000}s  (${(endT - startT)/10000000}ms)")
}