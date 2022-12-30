package Bridge;

import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class OutputFile {
    Path filePath;


    public OutputFile(Path filePath){
        this.filePath = filePath;
    }

    public abstract void writeYYYYMMDD(LocalDate date);

    public abstract void writeMMDDYYYY(LocalDate date);

    public abstract void writeDDMMYYYY(LocalDate date);
}

