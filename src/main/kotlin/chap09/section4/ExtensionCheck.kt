package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    println(list.all { it < 10 })  // true
    println(list.all { it % 2 == 0 })  // false

    println(list.any { it % 2 == 0 })  // true
    println(list.any { it > 10 })  // false

    println("contains: " + list.contains(2))  // contains: true
    println(2 in list)  // true
    println(map.contains(11))  // true
    println(11 in map)  // true

    println("containsAll: "+list.containsAll(listOf(1, 2, 3)))  // containsAll: true

    println("none: "+list.none())  // none: false
    println("none: "+list.none { it > 6 })  // none: true

    println(list.isEmpty())  // false
    println(list.isNotEmpty())  // true

}