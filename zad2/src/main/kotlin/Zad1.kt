
fun main(args: Array<String>) {
    val additions = add(2, 3) to add(5,39)
    val doubles = double(2) to double(838)
    val suffixes = addSuffix("agnieszka", suffix = "nieumieliczyc") to addSuffix("ula", suffix = "teznieumi")

    Verifier.verifyZad1(additions, doubles, suffixes)
}

fun add(first: Int, second: Int): Int {
    return -1
}

fun double(first: Int): Int {
    return -1
}

fun addSuffix(source: String, suffix: String): String {
    return ""
}
