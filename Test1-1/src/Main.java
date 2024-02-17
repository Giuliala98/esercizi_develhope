// Riprendi uno degli esercizi già svolti e corretti
//Aggiungi Junit al progetto
//Crea una funzione di test che non dia errori
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(divisioneDiUnNumeroDellArray(array,3));
    }
    public static int divisioneDiUnNumeroDellArray(int[] array, int indice){
        try {
            int dividendo = array[indice];
            return dividendo / 0;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException a) {
            System.out.println(a);
        } finally {
            System.out.println("il valore restituito è 0");
        }
        return 0;
    }
}
