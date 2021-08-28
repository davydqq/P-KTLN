import email.*

fun main(){
    val myMessage = Message("Hello Kotlin")
    send(myMessage, "tom@gmail.com")
}