import java.util.ArrayList;
import java.util.Collections;

// Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//Mettere in ordine la collezione e stampare il risultato
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studenti = new ArrayList<>();
        studenti.add(new Student("giulia",26));
        studenti.add(new Student("salvo",27));
        studenti.add(new Student("paolo",25));
        studenti.add(new Student("elena",25));
        studenti.add(new Student("isabella",25));
        studenti.add(new Student("giuseppe",29));

        studenti.add(new Student("pietro",26));
        studenti.add(new Student("federica",27));
        studenti.add(new Student("jenny",25));
        studenti.add(new Student("sabrina",25));
        studenti.add(new Student("rosario",25));
        studenti.add(new Student("gaetano",29));
        System.out.println(studenti);

        Collections.sort(studenti);
        System.out.println(studenti);
    }
}