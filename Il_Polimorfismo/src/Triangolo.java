public class Triangolo extends Forma  {
    private int b;
    private int h;

    public Triangolo(int b, int h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public double calcolaArea() {
        return (double) (b * h) / 2;
    }
}

