package Bridge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class FixedSizeOutputFile extends OutputFile{

    public FixedSizeOutputFile(Path filePath) {
        super(filePath);
    }

    @Override
    public void writeYYYYMMDD(LocalDate date) {
        try {
            Files.writeString(filePath, date.getYear()+"    "+date.getMonth().getValue()+
                    (date.getMonth().getValue()>=10?" ":"")+"     "+date.getDayOfMonth()+(date.getDayOfMonth()>=10?" ":"")+"     ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeMMDDYYYY(LocalDate date) {
        try {
            Files.writeString(filePath, date.getMonth().getValue()+(date.getMonth().getValue()>=10?" ":"")+"     "+
                    date.getDayOfMonth()+(date.getDayOfMonth()>=10?" ":"")+"     "+date.getYear()+"    ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeDDMMYYYY(LocalDate date) {
        try {
            Files.writeString(filePath, date.getDayOfMonth()+(date.getDayOfMonth()>=10?" ":"")+"     "+
                    date.getMonth().getValue()+(date.getMonth().getValue()>=10?" ":"")+"     "+date.getYear()+"    ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
