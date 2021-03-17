fun main() {
    val dirty: Int = 10
    val temp: (Int) -> Int = { dirty -> dirty / 2 }
    println("lamde运行结果是$temp")
}



fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}