import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidator {

    // Definimos los patrones de las contraseñas
    private static final Pattern LENGTH_PATTERN = Pattern.compile(".{8,}");
    private static final Pattern SPECIAL_CHAR_PATTERN = Pattern.compile("[!@#$%^&*(),.?\":{}|<>]");
    private static final Pattern UPPERCASE_PATTERN = Pattern.compile(".*[A-Z].*[A-Z].*");
    private static final Pattern LOWERCASE_PATTERN = Pattern.compile(".*[a-z].*[a-z].*[a-z].*");
    private static final Pattern DIGIT_PATTERN = Pattern.compile(".*\\d.*");

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese la cantidad de contraseñas a validar:");
            int n = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            String[] passwords = new String[n];
            System.out.println("Ingrese las contraseñas:");
            for (int i = 0; i < n; i++) {
                passwords[i] = scanner.nextLine();
            }
            
            for (String password : passwords) {
                Thread thread = new Thread(new PasswordCheckTask(password));
                thread.start();
            }
        }
    }

    private static class PasswordCheckTask implements Runnable {
        private final String password;

        public PasswordCheckTask(String password) {
            this.password = password;
        }

        @Override
        public void run() {
            boolean isValid = validatePassword(password);
            System.out.println("La contraseña \"" + password + "\" es " + (isValid ? "válida" : "inválida"));
        }

        private boolean validatePassword(String password) {
            return LENGTH_PATTERN.matcher(password).matches()
                && SPECIAL_CHAR_PATTERN.matcher(password).find()
                && UPPERCASE_PATTERN.matcher(password).matches()
                && LOWERCASE_PATTERN.matcher(password).matches()
                && DIGIT_PATTERN.matcher(password).find();
        }
    }
}