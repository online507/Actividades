import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> resultados = new ArrayList<>();
            boolean continuar = true;
            
            while (continuar) {
                try {
                    int figura = seleccionarFigura(scanner);
                    int operacion = seleccionarOperacion(scanner);
                    
                    realizarOperacion(figura, operacion, scanner, resultados);
                    
                    System.out.print("¿Desea realizar otra operación? (s/n): ");
                    char respuesta = scanner.next().charAt(0);
                    if (respuesta != 's' && respuesta != 'S') {
                        continuar = false;
                    }
                    
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                    scanner.next(); // Limpiar la entrada inválida
                }
            }
            
            System.out.println("Resultados:");
            for (String resultado : resultados) {
                System.out.println(resultado);
            }
        }
    }

    private static int seleccionarFigura(Scanner scanner) {
        System.out.println("Seleccione la figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        System.out.println("6. Potencia");
        return scanner.nextInt();
    }

    private static int seleccionarOperacion(Scanner scanner) {
        System.out.println("Seleccione la operación:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        System.out.println("3. Potencia");
        return scanner.nextInt();
    }

    private static void realizarOperacion(int figura, int operacion, Scanner scanner, ArrayList<String> resultados) {
        switch (figura) {
            case 1 -> {
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                circulo circulo = new circulo(radio);
                manejarOperacion(circulo, operacion, resultados);
            }
            case 2 -> {
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                cuadrado cuadrado = new cuadrado(lado);
                manejarOperacion(cuadrado, operacion, resultados);
            }
            case 3 -> {
                System.out.print("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = scanner.nextDouble();
                System.out.print("Ingrese el primer lado del triángulo: ");
                double lado1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo lado del triángulo: ");
                double lado2 = scanner.nextDouble();
                System.out.print("Ingrese el tercer lado del triángulo: ");
                double lado3 = scanner.nextDouble();
                triangulo triangulo = new triangulo(base, altura, lado1, lado2, lado3);
                manejarOperacion(triangulo, operacion, resultados);
            }
            case 4 -> {
                System.out.print("Ingrese la base del rectángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double altura = scanner.nextDouble();
                rectangulo rectangulo = new rectangulo(base, altura);
                manejarOperacion(rectangulo, operacion, resultados);
            }
            case 5 -> {
                System.out.print("Ingrese el lado del pentágono: ");
                double ladoPentagono = scanner.nextDouble();
                System.out.print("Ingrese el apotema del pentágono: ");
                double apotema = scanner.nextDouble();
                pentagono pentagono = new pentagono(ladoPentagono, apotema);
                manejarOperacion(pentagono, operacion, resultados);
            }
            case 6 -> {
                System.out.print("Ingrese la base: ");
                double basePotencia = scanner.nextDouble();
                System.out.print("Ingrese el exponente: ");
                int exponente = scanner.nextInt();
                potencia potencia = new potencia(basePotencia, exponente);
                double resultadoPotencia = potencia.calcular();
                resultados.add("Potencia de " + basePotencia + " elevado a " + exponente + " es: " + resultadoPotencia);
                System.out.println("La potencia de " + basePotencia + " elevado a " + exponente + " es: " + resultadoPotencia);
            }
            default -> System.out.println("Opción no válida.");
        }
    }

    private static void manejarOperacion(figura figura, int operacion, ArrayList<String> resultados) {
        switch (operacion) {
            case 1 -> {
                double area = figura.calcularArea();
                resultados.add("Área: " + area);
                System.out.println("El área es: " + area);
            }
            case 2 -> {
                double perimetro = figura.calcularPerimetro();
                resultados.add("Perímetro: " + perimetro);
                System.out.println("El perímetro es: " + perimetro);
            }
            default -> System.out.println("Operación no válida.");
        }
    }
    
}
