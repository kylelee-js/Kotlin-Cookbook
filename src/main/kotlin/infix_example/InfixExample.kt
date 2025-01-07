package org.example.infix_example


/* 마지막 인자로 람다가 있으면 람다를 밖으로 뺄 수 있는 것과 유사하게
 * 중위연산자는 해당 키워드를 띄어서 중간애 넣을 수 있음
 */
infix fun String.love(lovable: String): String {
    return "$this love $lovable"
}

infix fun Int.plus(target: Int): Int {
    return this + target
}

fun main () {
    println("I" love "U") // "I love U"
    println(1 plus 2) // 3
}