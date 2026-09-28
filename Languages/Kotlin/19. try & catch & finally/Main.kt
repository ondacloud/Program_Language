fun main() {
    val value = try { "abc".toInt() } catch (e: NumberFormatException) { -1 } finally { println("done") }
    println(value)
}
