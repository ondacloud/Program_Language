interface Speaker { fun speak(): String }
class Greeter : Speaker { override fun speak() = "hello" }
fun main() {
    val speaker: Speaker = Greeter()
    println(speaker.speak())
}
