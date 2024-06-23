import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {public static void main(String[] args) {
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
                var circulo = new circulo();
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                if (operacion == 1) {
                    double area = circulo.calcularArea(radio);
                    resultados.add("Área del círculo con radio " + radio + " es: " + area);
                    System.out.println("El área del círculo es: " + area);
                } else {
                    double perimetro = circulo.calcularPerimetro(radio);
                    resultados.add("Perímetro del círculo con radio " + radio + " es: " + perimetro);
                    System.out.println("El perímetro del círculo es: " + perimetro);
                }
        }

            case 2 -> {
                cuadrado cuadrado = new cuadrado();
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                if (operacion == 1) {
                    double area = cuadrado.calcularArea(lado);
                    resultados.add("Área del cuadrado con lado " + lado + " es: " + area);
                    System.out.println("El área del cuadrado es: " + area);
                } else {
                    double perimetro = cuadrado.calcularPerimetro(lado);
                    resultados.add("Perímetro del cuadrado con lado " + lado + " es: " + perimetro);
                    System.out.println("El perímetro del cuadrado es: " + perimetro);
                }
        }
            case 3 -> {
                triangulo triangulo = new triangulo();
                if (operacion == 1) {
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    double area = triangulo.calcularArea(base, altura);
                    resultados.add("Área del triángulo con base " + base + " y altura " + altura + " es: " + area);
                    System.out.println("El área del triángulo es: " + area);
                } else {
                    System.out.print("Ingrese el primer lado del triángulo: ");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo lado del triángulo: ");
                    double lado2 = scanner.nextDouble();
                    System.out.print("Ingrese el tercer lado del triángulo: ");
                    double lado3 = scanner.nextDouble();
                    double perimetro = triangulo.calcularPerimetro(lado1, lado2, lado3);
                    resultados.add("Perímetro del triángulo con lados " + lado1 + ", " + lado2 + ", " + lado3 + " es: " + perimetro);
                    System.out.println("El perímetro del triángulo es: " + perimetro);
                }
        }
            case 4 -> {
                rectangulo rectangulo = new rectangulo();
                System.out.print("Ingrese la base del rectángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double altura = scanner.nextDouble();
                if (operacion == 1) {
                    double area = rectangulo.calcularArea(base, altura);
                    resultados.add("Área del rectángulo con base " + base + " y altura " + altura + " es: " + area);
                    System.out.println("El área del rectángulo es: " + area);
                } else {
                    double perimetro = rectangulo.calcularPerimetro(base, altura);
                    resultados.add("Perímetro del rectángulo con base " + base + " y altura " + altura + " es: " + perimetro);
                    System.out.println("El perímetro del rectángulo es: " + perimetro);
                }
        }
            case 5 -> {
                pentagono pentagono = new pentagono();
                if (operacion == 1) {
                    System.out.print("Ingrese el lado del pentágono: ");
                    double ladoPentagono = scanner.nextDouble();
                    System.out.print("Ingrese el apotema del pentágono: ");
                    double apotema = scanner.nextDouble();
                    double area = pentagono.calcularArea(ladoPentagono, apotema);
                    resultados.add("Área del pentágono con lado " + ladoPentagono + " y apotema " + apotema + " es: " + area);
                    System.out.println("El área del pentágono es: " + area);
                } else {
                    System.out.print("Ingrese el lado del pentágono: ");
                    double ladoPentagono = scanner.nextDouble();
                    double perimetro = pentagono.calcularPerimetro(ladoPentagono);
                    resultados.add("Perímetro del pentágono con lado " + ladoPentagono + " es: " + perimetro);
                    System.out.println("El perímetro del pentágono es: " + perimetro);
                }
        }
            case 6 -> {
                System.out.print("Ingrese la base: ");
                double basePotencia = scanner.nextDouble();
                System.out.print("Ingrese el exponente: ");
                int exponente = scanner.nextInt();
                double potencia = calculadora.calcularPotencia(basePotencia, exponente);
                resultados.add("Potencia de " + basePotencia + " elevado a " + exponente + " es: " + potencia);
                System.out.println("La potencia de " + basePotencia + " elevado a " + exponente + " es: " + potencia);
        }
            default -> System.out.println("Opción no válida.");
        }
    }
    
}
