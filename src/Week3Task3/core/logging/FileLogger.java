package Week3Task3.core.logging;

public class FileLogger implements ILogger{
    public void log(String message){
        System.out.println("FileLogger: " + message);
    }
}
