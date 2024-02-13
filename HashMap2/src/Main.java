import java.util.*;

// Creare un hashmap, prendere tutti i valori, ordinarli e stamparli
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

        Collection<String> gDSValues = giorniDellaSettimana.values();
        List<String> gDSValuesList = new ArrayList<>(gDSValues);
        Collections.sort(gDSValuesList);

        for (String s : gDSValuesList) {
            System.out.println(s);
        }
    }
}
