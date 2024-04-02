package Task2_DZ.Logging;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger implements Log {

    private LocalDateTime localDateTime = LocalDateTime.now();
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private String stringLog = localDateTime.format(dateTimeFormatter);

    public String getLogString() {
        return stringLog;
    }    
}
