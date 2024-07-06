import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

public class PasswordValidator {

    // Definimos los patrones de las contraseñas
    private static final Pattern LENGTH_PATTERN = Pattern.compile(".{8,}");
    private static final Pattern SPECIAL_CHAR_PATTERN = Pattern.compile("[!@#$%^&*(),.?\":{}|<>]");
    private static final Pattern UPPERCASE_PATTERN = Pattern.compile("(.*[A-Z].*){2,}");
    private static final Pattern LOWERCASE_PATTERN = Pattern.compile("(.*[a-z].*){3,}");
    private static final Pattern DIGIT_PATTERN = Pattern.compile(".*\\d.*");

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese la cantidad de contraseñas a validar:");
            int n = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            List<String> passwords = new ArrayList<>();
            System.out.println("Ingrese las contraseñas:");
            for (int i = 0; i < n; i++) {
                passwords.add(scanner.nextLine());
            }
            
            ExecutorService executor = Executors.newFixedThreadPool(n);
            passwords.forEach(password -> executor.submit(() -> {
                boolean isValid = validatePassword(password);
                String result = "La contraseña \"" + password + "\" es " + (isValid ? "válida" : "inválida");
                System.out.println(result);
                logResult(password, isValid);
            }));
            
            executor.shutdown();
            while (!executor.isTerminated()) {
            }
        }
    }

    private static boolean validatePassword(String password) {
        return LENGTH_PATTERN.matcher(password).matches()
                && SPECIAL_CHAR_PATTERN.matcher(password).find()
                && UPPERCASE_PATTERN.matcher(password).matches()
                && LOWERCASE_PATTERN.matcher(password).matches()
                && DIGIT_PATTERN.matcher(password).find();
    }

    private static void logResult(String password, boolean isValid) {
        try (FileWriter logFile = new FileWriter("password_validation_log.txt", true)) {
            logFile.write("Password: " + password + " - " + (isValid ? "Valid" : "Invalid") + "\n");
        } catch (IOException e) {
        }
    }
}
