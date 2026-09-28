sealed interface Result
data class Success(val score: Int) : Result
data object Missing : Result
fun main() {
    val result: Result = Success(80)
    println(when (result) { is Success -> result.score.toString(); Missing -> "missing" })
}
