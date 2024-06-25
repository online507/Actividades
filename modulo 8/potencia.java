public class potencia implements Operacion {
    private final double base;
    private final int exponente;

    public potencia(double base, int exponente) {
        this.base = base;
        this.exponente = exponente;
    }

    public double calcular() {
        return calcularPotencia(base, exponente);
    }

    private double calcularPotencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente > 0) {
            return base * calcularPotencia(base, exponente - 1);
        } else {
            return 1 / calcularPotencia(base, -exponente);
        }
    }

    @Override
    public double calcularArea() {
        throw new UnsupportedOperationException("No se puede calcular el área de una potencia.");
    }

    @Override
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("No se puede calcular el perímetro de una potencia.");
    }
    
}
