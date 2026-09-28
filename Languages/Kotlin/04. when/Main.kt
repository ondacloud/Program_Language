fun main() {
    val score = 80
    val grade = when (score) {
        in 90..100 -> "A"
        in 70..89 -> "B"
        else -> "C"
    }
    println(grade)
}
