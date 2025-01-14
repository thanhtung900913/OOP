package lab11.Observer.ex1;

public class App {
    public static void main(String[] args) {
        Editor editor = new Editor();

        LoggingListeners logger = new LoggingListeners("/path/to/log.txt", "Someone has opened the file: %s");
        editor.events.subscribe("open", logger);

        EmailAlertsListeners emailAlerts = new EmailAlertsListeners("admin@example.com", "Someone has changed the file: %s");
        editor.events.subscribe("save", emailAlerts);

    }
}
