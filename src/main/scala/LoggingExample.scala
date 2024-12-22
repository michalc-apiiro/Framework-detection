import org.slf4j.LoggerFactory
import org.apache.logging.log4j.Logger
import org.apache.logging.log4j.LogManager

object LoggingExample {
  // SLF4J Logger
  private val slf4jLogger = LoggerFactory.getLogger(this.getClass)

  // Log4j Logger
  private val log4jLogger: Logger = LogManager.getLogger(this.getClass)

  def main(args: Array[String]): Unit = {
    // Logging with SLF4J
    slf4jLogger.info("This is an INFO message from SLF4J")
    slf4jLogger.warn("This is a WARN message from SLF4J")
    slf4jLogger.error("This is an ERROR message from SLF4J")

    // Logging with Log4j
    log4jLogger.info("This is an INFO message from Log4j")
    log4jLogger.warn("This is a WARN message from Log4j")
    log4jLogger.error("This is an ERROR message from Log4j")
  }
}
