package playground_kotlin

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    val email = client?.personalInfo?.email
    if (email != null && message != null) {
        mailer.sendMessage(email, message)
    }
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}

fun main() {
    sendMessageToClient(Client(PersonalInfo("someemail@domain.com")), "some Message", object : Mailer {
        override fun sendMessage(email: String, message: String) {
            println("sending email to $email , with message = $message")
        }
    })
}