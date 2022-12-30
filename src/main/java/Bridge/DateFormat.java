package Bridge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class DateFormat {
    LocalDate date;
    OutputFile outFile;


    public DateFormat(LocalDate date,OutputFile outFile){
        this.date = date;
        this.outFile = outFile;
    }

    public abstract void write();
}
