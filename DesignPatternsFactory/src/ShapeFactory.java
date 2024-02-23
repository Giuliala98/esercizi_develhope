public class ShapeFactory {
    public static Shape getTipoForma(TipoForma forma){
        Shape obj = switch (forma){
            case CERCHIO -> new Cerchio();

            case TRIANGOLO -> new Triangolo();

            case RETTANGOLO -> new Rettangolo();

            default -> null;
        };
        return obj;
    }
}
