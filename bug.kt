```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers.size) //This will print 2
    if (evenNumbers.isEmpty()) {
        println("No even numbers found")
    } else {
        println("Even numbers found")
    }
}
```