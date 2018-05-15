fun main(args: Array<String>) {
    printFizzBuzz(start = 0, end = 100)
}

fun printFizzBuzz(start: Int, end: Int) {
    for (i in start..end) {
        if (i % 15 == 0) {
            println("$i FizzBuzz")
        } else if (i % 5 == 0)
            println("$i Buzz")
        else if (i % 3 == 0) {
            println("$i Fizz")
        } else {
            println("$i")
        }
    }
}




