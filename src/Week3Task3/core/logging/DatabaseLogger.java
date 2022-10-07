package Week3Task3.core.logging;

public class DatabaseLogger implements ILogger{
    public void log(String message){
        System.out.println("Databaselogger: " + message);
    }
}
