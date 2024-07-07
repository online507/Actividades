import java.util.Scanner;

public class RegistroDeUsuarios {public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Registro de Usuario");

            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            while (!Validador.validarNombre(nombre)) {
                System.out.println("Nombre inválido. Intente nuevamente.");
                System.out.print("Ingrese su nombre: ");
                nombre = scanner.nextLine();
            }

            System.out.print("Ingrese su correo electrónico: ");
            String correoElectronico = scanner.nextLine();
            while (!Validador.validarCorreoElectronico(correoElectronico)) {
                System.out.println("Correo electrónico inválido. Intente nuevamente.");
                System.out.print("Ingrese su correo electrónico: ");
                correoElectronico = scanner.nextLine();
            }

            System.out.print("Ingrese su contraseña: ");
            String contrasena = scanner.nextLine();
            while (!Validador.validarContrasena(contrasena)) {
                System.out.println("Contraseña inválida. Debe tener entre 8 y 20 caracteres, incluyendo al menos una letra mayúscula, una letra minúscula y un número. Intente nuevamente.");
                System.out.print("Ingrese su contraseña: ");
                contrasena = scanner.nextLine();
            }

            Usuario1 usuario = new Usuario1(nombre, correoElectronico, contrasena);
            System.out.println("Usuario registrado exitosamente: " + usuario);
        }
    }
    
}
