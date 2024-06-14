    import java.util.ArrayList;
    import java.util.List;
    
    public class inventario {
        private List<producto> productos;
    
        public inventario() {
            this.productos = new ArrayList<>();
        }
    
        public void agregarProducto(producto producto) {
            productos.add(producto);
        }
    
        public producto buscarProducto(String nombre) {
            for (producto producto : productos) {
                if (producto.getNombre().equalsIgnoreCase(nombre)) {
                    return producto;
                }
            }
            return null;
        }
    
        public void mostrarinventario() {
            for (producto producto : productos) {
                System.out.println(producto);
            }
        }
    }