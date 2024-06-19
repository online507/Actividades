import java.util.Scanner;

public class main { public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Seleccione la figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        int figura = scanner.nextInt();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        int operacion = scanner.nextInt();

        switch (figura) {
            case 1 -> {
                circulo circulo = new circulo();
                if (operacion == 1) {
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("El área del círculo es: " + circulo.calcularArea(radio));
                } else {
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("El perímetro del círculo es: " + circulo.calcularPerimetro(radio));
                }
            }
            case 2 -> {
                cuadrado cuadrado = new cuadrado();
                if (operacion == 1) {
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    System.out.println("El área del cuadrado es: " + cuadrado.calcularArea(lado));
                } else {
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    System.out.println("El perímetro del cuadrado es: " + cuadrado.calcularPerimetro(lado));
                }
            }
            case 3 -> {
                triangulo triangulo = new triangulo();
                if (operacion == 1) {
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("El área del triángulo es: " + triangulo.calcularArea(base, altura));
                } else {
                    System.out.print("Ingrese el primer lado del triángulo: ");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo lado del triángulo: ");
                    double lado2 = scanner.nextDouble();
                    System.out.print("Ingrese el tercer lado del triángulo: ");
                    double lado3 = scanner.nextDouble();
                    System.out.println("El perímetro del triángulo es: " + triangulo.calcularPerimetro(lado1, lado2, lado3));
                }
            }
            case 4 -> {
                rectangulo rectangulo = new rectangulo();
                if (operacion == 1) {
                    System.out.print("Ingrese la base del rectángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("El área del rectángulo es: " + rectangulo.calcularArea(base, altura));
                } else {
                    System.out.print("Ingrese la base del rectángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro(base, altura));
                }
            }
            case 5 -> {
                pentagono pentagono = new pentagono();
                if (operacion == 1) {
                    System.out.print("Ingrese el lado del pentágono: ");
                    double lado = scanner.nextDouble();
                    System.out.print("Ingrese el apotema del pentágono: ");
                    double apotema = scanner.nextDouble();
                    System.out.println("El área del pentágono es: " + pentagono.calcularArea(lado, apotema));
                } else {
                    System.out.print("Ingrese el lado del pentágono: ");
                    double lado = scanner.nextDouble();
                    System.out.println("El perímetro del pentágono es: " + pentagono.calcularPerimetro(lado));
                }
            }
            default -> System.out.println("Opción no válida.");
        }
    }
    }
}

    
