fun <T> first(items: List<T>): T? = items.firstOrNull()
fun String.greet(): String = "Hi, $this"
fun main() {
    println(first(listOf(10, 20)))
    println("Mina".greet())
}
