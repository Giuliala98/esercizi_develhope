import java.util.HashSet;

//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato
public class Main {
    public static void main(String[] args) {
    String lista1 = "latte";
        System.out.println(hashSetRiempito().contains(lista1));
        if (hashSetRiempito().contains(lista1)){
            System.out.println("è presente");
        } else {
            System.out.println("non è presente");
        }
    }
    public static HashSet<String> hashSetRiempito () {
        HashSet<String> listaSpesa = new HashSet<>();
        listaSpesa.add("latte");
        listaSpesa.add("coca cola");
        listaSpesa.add("fanta");
        listaSpesa.add("patatine");
        return listaSpesa;
    }
}
