package Week3Task3.core.logging;

public class MailLogger implements ILogger{
    public void log(String message){
        System.out.println("Maillogger: " + message);
    }
}
