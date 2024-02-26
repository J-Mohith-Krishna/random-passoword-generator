import java.security.SecureRandom;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        int length = 10; // Length of the password
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        System.out.println("Random Password: " + password);
    }
}
