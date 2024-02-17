import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

// Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni -Crea dei test per questo esercizio
public class Main {
    public static void main(String[] args) {
        OffsetDateTime dataTime = parseDate("2002-03-01T13:00:00Z");

        String formatData = formatoFull(dataTime);
        String formatData1 = formatoMedium(dataTime);
        String formatData2 = formatoShort(dataTime);

        System.out.println(formatData);
        System.out.println(formatData1);
        System.out.println(formatData2);

    }
    public static OffsetDateTime parseDate(String data){
        return OffsetDateTime.parse(data);
    }
    public static String formatoFull(OffsetDateTime dateTime){
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }
    public static String formatoMedium(OffsetDateTime dateTime){
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }
    public static String formatoShort(OffsetDateTime dateTime){
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }

}
