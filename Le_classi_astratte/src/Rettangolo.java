public class Rettangolo extends Forma {
    private int b;
    private int h;

    public Rettangolo(int b, int h) {
        this.b = b;
        this.h = h;
    }
    @Override
    double calcolaArea() {
        return b * h;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
