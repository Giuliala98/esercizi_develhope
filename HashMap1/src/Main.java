import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

// Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> giorniDellaSettimana = new HashMap<Integer, String>();
        giorniDellaSettimana.put(1, "lunedì");
        giorniDellaSettimana.put(2, "martedì");
        giorniDellaSettimana.put(3, "mercoledì");
        giorniDellaSettimana.put(4, "giovedì");
        giorniDellaSettimana.put(5, "venerdì");
        giorniDellaSettimana.put(6, "sabato");
        giorniDellaSettimana.put(7, "domenica");

        for (Map.Entry<Integer,String> giornoDellaSettimana : giorniDellaSettimana.entrySet()){
            System.out.println(giornoDellaSettimana);
        }

        HashMap<Integer, String> gDS = new HashMap<>(Map.of(
                1,"lunedì",
                2, "martedì",
                3, "mercoledì",
                4, "giovedì",
                5, "venerdì",
                6, "sabato",
                7, "domenica"
        ));
        for (Map.Entry<Integer, String> giornoDellaSettimana : gDS.entrySet()){
            System.out.println(giornoDellaSettimana);
        }

        HashMap<Integer, String> gDS2 = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<Integer, String>(1, "lunedì"),
                new AbstractMap.SimpleEntry<Integer, String>(2, "martedì"),
                new AbstractMap.SimpleEntry<Integer, String>(3, "mercoledì"),
                new AbstractMap.SimpleEntry<Integer, String>(4, "giovedì"),
                new AbstractMap.SimpleEntry<Integer, String>(5, "venerdì"),
                new AbstractMap.SimpleEntry<Integer, String>(6, "sabato"),
                new AbstractMap.SimpleEntry<Integer, String>(7, "domenica")
        ));
        for (Map.Entry<Integer, String> giornoDellaSettimana : gDS2.entrySet()){
            System.out.println(giornoDellaSettimana);
            if(giornoDellaSettimana.getValue() == "domenica"){
                System.out.println("vafancullllll");
            }
        }
    }
}
