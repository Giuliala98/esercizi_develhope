import java.util.HashSet;

//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato
public class Main {
    public static void main(String[] args) {
        HashSet<String> listaSpesa = hashSetRiempito();
        String lista1 = "mele";
        for (int i = 0; i < hashSetRiempito().size(); i++) {
            if (listaSpesa.contains(lista1)){
                listaSpesa.remove(lista1);
            }
        }
        System.out.println(listaSpesa);
        listaSpesa.clear();
        System.out.println(listaSpesa);
    }
    public static HashSet<String> hashSetRiempito (){
        HashSet<String> listaSpesa = new HashSet<>();
        listaSpesa.add("latte");
        listaSpesa.add("coca cola");
        listaSpesa.add("fanta");
        listaSpesa.add("patatine");
        return listaSpesa;
    }
}
