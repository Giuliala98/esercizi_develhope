import java.util.ArrayList;

// Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studenti = new ArrayList<>();
        studenti.add(new Student("giulia",26));
        studenti.add(new Student("salvo",27));
        System.out.println(studenti);

        studenti.add(new Student("paolo",25));
        studenti.add(new Student("elena",25));
        studenti.add(new Student("isabella",25));
        studenti.add(new Student("giuseppe",29));
        System.out.println(studenti);
    }
}
