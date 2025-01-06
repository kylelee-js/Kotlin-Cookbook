package org.example.serializable_json

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable // 해당 어노테이션으로 선언해야만 직렬화 가능
data class Person(val name: String, val age: Int) {
    companion object {
        fun fromJson(json: String): Person {
            return Json.decodeFromString(serializer(), json)
        }
    }

    fun toJson(): String {
        return Json.encodeToString(serializer(), this)
    }
}

fun main() {
    val p1 = Person("Alice", 20)

    val json = p1.toJson()
    val p2 = Person.fromJson(json)
    println(json)
    println(p2)
}