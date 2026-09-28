class Account(val balance: Int) { init { require(balance >= 0) { "negative balance" } } }
fun main() {
    println(Account(10).balance)
}
