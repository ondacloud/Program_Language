fun main() {
    val names = listOf("Mina", "Jin")
    val scores = mutableListOf(80, 60)
    scores.add(90)
    println(names.joinToString(","))
    println(scores.sum())
}
