package lab11.Observer.ex1;

public class EmailAlertsListeners implements EventListeners{
    private String email;
    private String message;
    public EmailAlertsListeners(String email, String message){
        this.email = email;
        this.message = message;
    }
    @Override
    public void update(String filename) {
        System.out.println("Sending email to " + email + ": " + String.format(message, filename));
    }
}
