import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia
public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime modificaData = data.plusYears(1).plusMonths(-1).plusDays(7);

        String dataFormattata = modificaData.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy", Locale.ITALY));
        System.out.println(dataFormattata);
    }
}
