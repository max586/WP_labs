package Bridge;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        Path csvFilePath = Paths.get("src/main/java/Bridge/csv.txt");
        Path fixedSizeFilePath = Paths.get("src/main/java/Bridge/fixed_size.txt");
        Path xmlFilePath = Paths.get("src/main/java/Bridge/xml.txt");

        var csvFile = new CSVOutputFile(csvFilePath);
        var fixedSizedFile = new FixedSizeOutputFile(fixedSizeFilePath);
        var xmlFile = new XMLOutputFile(xmlFilePath);

        var df1 = new DDMMYYYYDateFormat(date, csvFile);
        var df2 = new DDMMYYYYDateFormat(date, fixedSizedFile);
        var df3 = new DDMMYYYYDateFormat(date, xmlFile);

        df1.write();
        df2.write();
        df3.write();
    }
}
