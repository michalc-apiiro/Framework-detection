import org.slf4j.Logger
import org.slf4j.LoggerFactory

fun main() {
    val logger: Logger = LoggerFactory.getLogger("Main")

    logger.debug("This is a DEBUG message")
    logger.info("This is an INFO message")
    logger.warn("This is a WARN message")
    logger.error("This is an ERROR message")

    val condition = true
    if (condition) {
        logger.info("Condition is true, executing code...")
    } else {
        logger.warn("Condition is false, skipping code execution")
    }
}