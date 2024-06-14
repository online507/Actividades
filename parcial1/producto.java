public class producto  {
    private String nombre;
    private int cantidadInicial;
    private int cantidadVendida;

    public producto(String nombre, int cantidadInicial) {
        this.nombre = nombre;
        this.cantidadInicial = cantidadInicial;
        this.cantidadVendida = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadInicial() {
        return cantidadInicial;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void vender(int cantidad) {
        this.cantidadVendida += cantidad;
    }

    public int getCantidadDisponible() {
        return cantidadInicial - cantidadVendida;
    }

    public void duplicarInventario() {
        if (getCantidadDisponible() == 0) {
            cantidadInicial *= 2;
            cantidadVendida = 0;
        }
    }

    public String toString() {
        return "Producto: " + nombre + ", Cantidad Inicial: " + cantidadInicial +
               ", Cantidad Vendida: " + cantidadVendida + ", Cantidad Disponible: " + getCantidadDisponible();
    }
}