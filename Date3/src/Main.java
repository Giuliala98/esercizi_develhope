import java.time.OffsetDateTime;
import java.util.Locale;

// Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console
public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String anno = String.valueOf(data.getYear());
        System.out.println(anno);

        String mese = String.valueOf(data.getMonth()).toLowerCase();
        System.out.println(mese);

        String giorno = String.valueOf(data.getDayOfMonth());
        System.out.println(giorno);

        String giornoDellaSettimana = String.valueOf(data.getDayOfWeek()).toLowerCase();
        System.out.println(giornoDellaSettimana);

        System.out.println(anno + " " + mese + " " + giorno + " " + giornoDellaSettimana);
    }
}
