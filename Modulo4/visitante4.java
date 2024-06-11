package Modulo4;

import java.util.Scanner;

public class visitante4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar variables de diferentes tipos primitivos
        byte numeroDepartamento;
        short numeroEdificio;
        int edad;
        long telefono;
        float altura;
        double peso;
        char genero;
        boolean esPropietario;
        String nombre;

        // Solicitar y leer la información del visitante
        System.out.print("Ingrese el nombre del visitante: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del visitante: ");
        edad = scanner.nextInt();

        System.out.print("Ingrese el número de departamento : ");
        numeroDepartamento = scanner.nextByte();

        System.out.print("Ingrese el número de edificio : ");
        numeroEdificio = scanner.nextShort();

        System.out.print("Ingrese el número de teléfono : ");
        telefono = scanner.nextLong();

        System.out.print("Ingrese la altura : ");
        altura = scanner.nextFloat();

        System.out.print("Ingrese el peso : ");
        peso = scanner.nextDouble();

        System.out.print("Ingrese el género (M/F) : ");
        genero = scanner.next().charAt(0);

        System.out.print("¿Es propietario? : ");
        esPropietario = scanner.nextBoolean();

        // Determinar si el visitante es mayor o menor de edad
        String edadCategoria = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        // Solicitar y leer las visitas realizadas durante la semana
        System.out.print("Ingrese la cantidad de visitas realizadas durante la semana: ");
        int cantidadVisitas = scanner.nextInt();
        int[] tiemposVisita = new int[cantidadVisitas];
        int tiempoTotal = 0;

        // Leer el tiempo de cada visita
        for (int i = 0; i < cantidadVisitas; i++) {
            System.out.print("Ingrese el tiempo de estadía de la visita " + (i + 1) + " (en minutos): ");
            tiemposVisita[i] = scanner.nextInt();
            tiempoTotal += tiemposVisita[i];
        }

        // Calcular el tiempo promedio de estadía
        double tiempoPromedio = (double) tiempoTotal / cantidadVisitas;

        // Cerrar el scanner
        scanner.close();

        // Imprimir resultados
        System.out.println("\nInformación del Visitante");
        System.out.println("-------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Categoría: " + edadCategoria);
        System.out.println("Número de departamento: " + numeroDepartamento);
        System.out.println("Número de edificio: " + numeroEdificio);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Género: " + genero);
        System.out.println("Es propietario: " + esPropietario);
        System.out.println("Cantidad total de visitas: " + cantidadVisitas);
        System.out.println("Tiempo promedio de estadía: " + tiempoPromedio + " minutos");
    }
}
