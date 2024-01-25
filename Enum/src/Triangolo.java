
public class Triangolo extends Forma {
    private int b;
    private int h;
    private TipoForma tipoForma = TipoForma.TRIANGOLO;
    public Triangolo(int b, int h) {
        this.b = b;
        this.h = h;
    }

    @Override
    double calcolaArea() {
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

    public TipoForma getTipoForma() {
        return tipoForma;
    }
}
