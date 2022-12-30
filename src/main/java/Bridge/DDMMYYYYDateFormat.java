package Bridge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DDMMYYYYDateFormat extends DateFormat{

    public DDMMYYYYDateFormat(LocalDate date, OutputFile outFile) {
        super(date,outFile);
    }

    @Override
    public void write() {outFile.writeDDMMYYYY(date);}
}
