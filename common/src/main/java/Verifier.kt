object Verifier {
    fun verifyZad1(additions: Pair<Int, Int>, doubles: Pair<Int, Int>, suffixes: Pair<String, String>) {
        var isOk = true
        if (additions.first != 5) {
            println("źle, 2+3 != ${additions.first}, powinno byc 5")
            isOk = false
        }
        if (additions.second != 44) {
            println("źle, 5+39 != ${additions.second}, powinno byc 44")
            isOk = false
        }

        if (doubles.first != 4) {
            println("źle, podwojone 2 != ${doubles.first}, powinno wyjśc 4")
            isOk = false
        }
        if (doubles.second != 1676) {
            println("źle, podwojone 838 != ${doubles.second}, powinno byc 1676")
            isOk = false
        }

        if (suffixes.first != "agnieszkanieumieliczyc") {
            println("źle, agnieszka + nieumieliczyc != ${suffixes.first}")
            isOk = false
        }
        if (suffixes.second != "ulateznieumi") {
            println("źle, ula + teznieumi != ${suffixes.second}")
            isOk = false
        }

        if (isOk) {
            println("Dobrze!")
        }
    }
}