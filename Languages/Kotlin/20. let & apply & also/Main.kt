fun main() {
    val names = mutableListOf<String>().apply { add("Mina") }.also { println(it.size) }
    println(names.firstOrNull()?.let { it.uppercase() })
}
