public class Triangolo implements Forma {

    private double base;
    private double altezza;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea() {
        return base * altezza / 2;
    }
    @Override
    public String toString() {
        return " L'area del triangolo è: ";
    }
}
