package Bridge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MMDDYYYYDateFormat extends DateFormat{

    public MMDDYYYYDateFormat(LocalDate date, OutputFile outFile) {
        super(date,outFile);
    }

    @Override
    public void write() {
        outFile.writeMMDDYYYY(date);
    }
}
