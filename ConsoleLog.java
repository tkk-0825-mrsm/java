import java.until.logging.*;
public class ConsoleLog{
    public static void main(String[] args) {
     Logger logger =
Logger.getLoger(ConsoleLog.class.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel1(Level.INFO);
        logger.addHandler(consoleHandler);
        logger.info("�������J�n���܂����B");
        logger.info("�������I�����܂����B");

    }
}