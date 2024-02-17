import java.time.OffsetDateTime;

// Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Ottieni l'anno
//Ottieni il mese
//Ottieni il giorno
//Ottieni il giorno della settimana
//Stampa i risultati sulla console -Crea dei test per questo esercizio
public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = parseDate("2023-03-01T13:00:00Z");
        String anno = getAnno(data);
        System.out.println(anno);

        String mese = getMese(data);
        System.out.println(mese);

        String giorno = getGiorno(data);
        System.out.println(giorno);

        String giornoDellaSettimana = getGiornoDellaSettimana(data);
        System.out.println(giornoDellaSettimana);

        System.out.println(anno + " " + mese + " " + giorno + " " + giornoDellaSettimana);
    }
    public static OffsetDateTime parseDate(String data){
        return OffsetDateTime.parse(data);
    }

    public static String getAnno(OffsetDateTime anno){
        return String.valueOf(anno.getYear());
    }
    public static String getMese(OffsetDateTime mese){
        return String.valueOf(mese.getMonth());
    }
    public static String getGiorno(OffsetDateTime giorno){
        return String.valueOf(giorno.getDayOfMonth());
    }
    public static String getGiornoDellaSettimana(OffsetDateTime giornoDellaSettimana){
        return String.valueOf(giornoDellaSettimana.getDayOfWeek());
    }
}
