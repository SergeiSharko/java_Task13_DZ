package Task2_DZ.Logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger {

    private Logger logger = new Logger();

    public String getLogString(double x, double y, double result, String operation) {
        return String.format("%s %s %s = %.2f", x, operation, y, result);
    }
    
    public void writeToFile(String expression, String nameFile) {              
        try (FileWriter fw = new FileWriter(new File(nameFile), true)) {
            fw.write(expression + " -> " + logger.getLogString());
            fw.append('\n');
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}