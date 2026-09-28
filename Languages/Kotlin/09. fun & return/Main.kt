fun greet(name: String, prefix: String = "Hi"): String = "$prefix, $name"
fun main() {
    println(greet(name = "Mina"))
}
