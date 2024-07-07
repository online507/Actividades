import java.util.regex.Pattern;

public class Validador {
     private static final String NOMBRE_REGEX = "^[a-zA-Z\\s]+$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
    private static final String CONTRASENA_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$";

    public static boolean validarNombre(String nombre) {
        return Pattern.matches(NOMBRE_REGEX, nombre);
    }

    public static boolean validarCorreoElectronico(String correoElectronico) {
        return Pattern.matches(EMAIL_REGEX, correoElectronico);
    }

    public static boolean validarContrasena(String contrasena) {
        return Pattern.matches(CONTRASENA_REGEX, contrasena);
    }
}
