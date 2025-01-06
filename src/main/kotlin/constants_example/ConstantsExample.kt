package org.example.constants_example

// 전역 상수
const val version = "1.0.0"

// 전역 상수 객체 (싱글턴)
object GlobalObject {
    const val appName = "App"
}

// 지역 상수 클래스
class LocalClass {
    companion object {
        const val className = "LocalClass"
    }
}

fun main() {
    println("version: $version")
    println("appName: ${GlobalObject.appName}")
    println("className: ${LocalClass.className}")
}