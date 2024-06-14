import java.util.Scanner;

    public class main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            inventario inventario = new inventario();
    
            while (true) {
                System.out.println("\nGestión de Inventarios de Zapatos");
                System.out.println("1. Ingresar producto");
                System.out.println("2. Vender producto");
                System.out.println("3. Duplicar inventario de producto agotado");
                System.out.println("4. Mostrar inventario");
                System.out.println("5. Salir");
                System.out.print("Elija una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();  // Consumir la nueva línea
    
                switch (opcion) {
                    case 1:
                        System.out.print("Nombre del producto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Cantidad inicial: ");
                        int cantidadInicial = scanner.nextInt();
                        inventario.agregarProducto(new producto(nombre, cantidadInicial));
                        break;
                    case 2:
                        System.out.print("Nombre del producto: ");
                        nombre = scanner.nextLine();
                        producto producto = inventario.buscarProducto(nombre);
                        if (producto != null) {
                            System.out.print("Cantidad a vender: ");
                            int cantidad = scanner.nextInt();
                            if (cantidad <= producto.getCantidadDisponible()) {
                                producto.vender(cantidad);
                            } else {
                                System.out.println("No hay suficiente stock disponible.");
                            }
                        } else {
                            System.out.println("Producto no encontrado.");
                        }
                        break;
                    case 3:
                        System.out.print("Nombre del producto: ");
                        nombre = scanner.nextLine();
                        producto = inventario.buscarProducto(nombre);
                        if (producto != null) {
                            producto.duplicarInventario();
                        } else {
                            System.out.println("Producto no encontrado.");
                        }
                        break;
                    case 4:
                        inventario.mostrarinventario();
                        break;
                    case 5:
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida.");
                }
            }
        }
    }