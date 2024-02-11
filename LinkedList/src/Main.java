import java.util.LinkedHashSet;

// Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Fruit> frutta = new LinkedHashSet<>();
        frutta.add(new Fruit("mela"));
        frutta.add(new Fruit("pera"));
        frutta.add(new Fruit("banana"));
        System.out.println(frutta);

        frutta.addFirst(new Fruit("arancia"));
        frutta.addLast(new Fruit("uva"));
        System.out.println(frutta);
    }
}
