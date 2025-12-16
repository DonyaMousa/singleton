import java.time.LocalDateTime;

public class SingletonLoggerDemo {

    static class Logger {

        // Single instance of Logger
        private static Logger instance;

        // Private constructor prevents instantiation from outside
        private Logger() {
            System.out.println("Logger initialized");
        }

        // Public method to get the single instance (lazy initialization)
        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

        // Logging method
        public void log(String message) {
            System.out.println(LocalDateTime.now() + " - " + message);
        }
    }

    public static void main(String[] args) {

        // Get Logger instance and log messages
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started");

        Logger logger2 = Logger.getInstance();
        logger2.log("User logged in");

        Logger logger3 = Logger.getInstance();
        logger3.log("Application finished");

        // Verify that all references point to the same object
        System.out.println("\nAre all loggers the same instance?");
        System.out.println("logger1 == logger2: " + (logger1 == logger2));
        System.out.println("logger2 == logger3: " + (logger2 == logger3));
    }
}
