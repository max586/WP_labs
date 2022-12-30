package Bridge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class XMLOutputFile extends OutputFile{

    public XMLOutputFile(Path filePath) {
        super(filePath);
    }

    @Override
    public void writeYYYYMMDD(LocalDate date) {
        try {
            Files.writeString(filePath, "<date>"+date.getYear()+"-"+date.getMonth().getValue()+"-"+date.getDayOfMonth()+"</date>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeMMDDYYYY(LocalDate date) {
        try {
            Files.writeString(filePath, "<date>"+date.getMonth().getValue()+"-"+date.getDayOfMonth()+"-"+date.getYear()+"</date>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeDDMMYYYY(LocalDate date) {
        try {
            Files.writeString(filePath, "<date>"+date.getDayOfMonth()+"-"+date.getMonth().getValue()+"-"+date.getYear()+"</date>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
