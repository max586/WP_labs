package Bridge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class YYYYMMDDDateFormat extends DateFormat{

    public YYYYMMDDDateFormat(LocalDate date, OutputFile outFile) {
        super(date, outFile);
    }

    @Override
    public void write() {
        outFile.writeYYYYMMDD(date);
    }
}
