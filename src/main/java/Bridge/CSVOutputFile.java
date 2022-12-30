package Bridge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class CSVOutputFile extends OutputFile{

    public CSVOutputFile(Path filePath) {
        super(filePath);
    }

    @Override
    public void writeYYYYMMDD(LocalDate date) {
        try {
            Files.writeString(filePath, date.getYear()+","+date.getMonth().getValue()+","+date.getDayOfMonth());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeMMDDYYYY(LocalDate date) {
        try {
            Files.writeString(filePath, date.getMonth().getValue()+","+date.getDayOfMonth()+","+date.getYear());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeDDMMYYYY(LocalDate date) {
        try {
            Files.writeString(filePath, date.getDayOfMonth()+","+date.getMonth().getValue()+","+date.getYear());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
