import java.time.OffsetDateTime;

// Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//Verificare che la prima data è precedente alla seconda
//Verificare che la seconda data è successiva alla prima
//Verificare che le due date sono uguali ad ora
//Stampa il risultato
public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data1 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean comparaData = data.isBefore(data1);
        System.out.println(comparaData);

        boolean comparaData2 = data1.isAfter(data);
        System.out.println(comparaData2);

        boolean comparaOra = data.isEqual(data1);
        System.out.println(comparaOra);
    }
}
