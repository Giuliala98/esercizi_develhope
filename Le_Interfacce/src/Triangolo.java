public class Triangolo implements Forma {
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
