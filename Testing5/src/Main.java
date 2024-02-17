import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia
//Crea dei test per questo esercizio
public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = parseDate("2023-03-01T13:00:00Z");

        OffsetDateTime modificaData =modificaData(data, 1, -1, 7);

        String dataFormattata = dataFormattataPerItalia(modificaData);
        System.out.println(dataFormattata);
    }
    public static OffsetDateTime parseDate(String data){
        return OffsetDateTime.parse(data);
    }
    public static OffsetDateTime modificaData(OffsetDateTime data, int modAnno,int modMese, int modGiorno){
        return data.plusYears(modAnno).plusMonths(modMese).plusDays(modGiorno);
    }

    public static String dataFormattataPerItalia(OffsetDateTime data){
        return  data.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy", Locale.ITALY));
    }
}
