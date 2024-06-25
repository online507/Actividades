public class circulo extends figura{
    private double radio = 0;

    public circulo(double radio) {
        this.radio = radio;
    }

    public circulo() {
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    
}
