// Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video
public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder("Giulia", "Lanza");

        Person persona = builder.build();
        System.out.println(persona);

        PersonBuilder builder1 = new PersonBuilder("Mario", "Rossi");
        builder1.setAge(26);
        builder1.setAddress("via Palermo 777");

        Person persona1 = builder1.build();
        System.out.println(persona1);
    }
}
