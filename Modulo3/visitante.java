package Modulo3;
import java.util.Scanner;

public class visitante {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del visitante:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad del visitante:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese la altura del visitante (en metros):");
        double altura = scanner.nextDouble();

        System.out.println("¿El visitante es residente? (true/false):");
        boolean esResidente = scanner.nextBoolean();

        System.out.println("Ingrese el número de apartamento del visitante:");
        byte numeroApartamento = scanner.nextByte();

        System.out.println("\nInformación del visitante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("¿Es residente?: " + (esResidente ? "Sí" : "No"));
        System.out.println("Número de apartamento: " + numeroApartamento);

        scanner.close();
    }
}
