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
                                double area;
                                area = cuadrado.calcularArea(lado);
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
                        default -> System.out.println("Opción no válida.");
                    }
                    
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
    
}
