public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(2, 3);
        Triangolo triangolo = new Triangolo(2,3);
        System.out.println(rettangolo.calcolaArea());
        System.out.println(triangolo.calcolaArea());
        System.out.println(rettangolo.getTipoForma());
        System.out.println(triangolo.getTipoForma());
    }
}

