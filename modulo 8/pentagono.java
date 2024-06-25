public class pentagono extends figura {
    private final double lado;
    private double apotema;

    public pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public pentagono(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (5 * lado * apotema) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 5 * lado;
    }
    
}
