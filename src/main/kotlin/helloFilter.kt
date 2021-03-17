fun main() {
    val decorations = listOf<String>("one", "two", "three")

    val eager = decorations.filter { it[0] == 't' }
    println("eager = $eager")

    val lazy = decorations.asSequence().filter { it[0] == 't' }
    println("lazy:$lazy")

    val newList = lazy.toList()
    println("new List:$newList")

    println(decorations.filter { it[0] == 't' })

    val lazyMap = decorations.asSequence().map {
        println("access:$it")
        it
    }

    println("lazy:$lazyMap")
    println("=----")
    println("lazyMapFirst:${lazyMap.first()}")
    println("-----")
    println("all : ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter {it[0] == 't'}.map {
        println("access: $it")
        it
    }
    println("============")
    println("filtered: ${lazyMap2.toList()}")

}