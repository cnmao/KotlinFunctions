fun main(args: Array<String>) {
    println("Hello, ${args[2]}")
    val tempr = 10 ;

    //A string template inserts a variable or expression into a string,
    // and $ specifies that part of the string will be a variable or expression.
    // Curly braces {} frame the expression, if any.

    println("The water temperature is ${if (tempr > 50) "too hard" else "ok"}")

    val value = if (0 > 1) print("a") else print("b")

}

