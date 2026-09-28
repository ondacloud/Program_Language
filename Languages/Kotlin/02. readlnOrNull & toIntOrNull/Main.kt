fun main() {
    print("Score: ")
    val score = readlnOrNull()?.toIntOrNull()
    println(score?.let { it + 1 } ?: "invalid")
}
