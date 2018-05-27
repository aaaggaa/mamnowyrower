fun main(args: Array<String>) {
    val source = "abcdefghijklmnoprstuwvxyz"
    val reverted = revertString(source)

    println(reverted)

}

@Suppress("UNREACHABLE_CODE")
fun revertString(source: String): String {
    return source.reversed()

    for (i in source.count() - 1 downTo 0) {
        println(i)
    }
}


//fun stringtoin (lunge: Array<String>):

//    val tojestint: Long = 555555555555555
//    var tojeststring: String = "a"
//    var tojestlong = 8L
//    var cokolwiek: Byte = 122
//    val ujemna = -14
//    val kkk: Double = 1.111
//    val sss: Char = 'a'
//
//    val ddd: Array<Double> = arrayOf(2.0, 5.6)
//    val dlugosc = ddd.size
//    val list: List<String> = listOf("java", "kotlin", "C#", "Lisp", tojeststring)
//    val size: Int = list.size
//    val zbior: Set<String> = setOf("a","b","c","d")
////    println(ddd.get(1))
////    println(list.get(2))
////    println(zbior.get(2))
//    val kot: String = "Agnieszka"
//    val kot2 : String = "makota"
//    val liczbaznakow: Int = kot.length
//    for (i in kot.count() -1 downTo 0 ){

//        println (kot.get(i))

//    }
//    for (znak in kot){
//        println(znak)
//    }
//    println(kot.length)
//    println(kot2 + kot)
//    println(kot.get(0))
//    println(kot.get(3))
//    println(kot.get(1))
//    println(kot.get(2))
