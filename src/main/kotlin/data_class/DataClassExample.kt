package org.example.data_class

data class Person(val name: String, val age: Int)

fun main() {
    val p1 = Person("Alice", 20)
    val p2 = Person("Alice", 20)

    println(p1 == p2) // true
    println(p1 === p2) // false

    val p3 = p1.copy()
    println(p1 == p3) // true
    println(p1 === p3) // false

    val p4 = p1.copy(age = 21)
    println(p1 == p4) // false
    println(p1 === p4) // false

    // 논리적 동등성
    val p1_hash = p1.hashCode()
    val p2_hash = p2.hashCode()
    val p3_hash = p3.hashCode()
    println("p1_hash: $p1_hash")
    println("p2_hash: $p2_hash")
    println("p3_hash: $p3_hash")

    // 구조 분해 할당
    val (name, age) = p1
    val p1_name = p1.component1()
    val p1_age = p1.component2()
    println("name: $name, age: $age")
    println("p1_name: $p1_name, p1_age: $p1_age")
}