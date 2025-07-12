fun main() {
    Logger.log("Hello World")
}

/**
 * An object declaration (Singleton) for logging.
 */
object Logger {
    init {
        // Initialization logic goes here
    }

    fun log(message: String) = println("LOG: $message")
}
