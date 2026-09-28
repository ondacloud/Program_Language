fun main() {
    val scores = listOf(60, 80, 90)
    println(scores.filter { it >= 70 }.map { it + 1 })
    println(scores.fold(0) { total, score -> total + score })
}
