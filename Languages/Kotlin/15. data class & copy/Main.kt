data class Student(val name: String, val score: Int)
fun main() {
    val original = Student("Mina", 80)
    println(original.copy(score = 90))
}
