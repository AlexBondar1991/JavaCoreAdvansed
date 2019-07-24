package Password;
import java.util.Scanner;

public class Password {

        private static boolean checkPassword(String password) {

            //.{8,}         1. Пароль должен быть не менее 8ми символов.
            //(?=.*[0-9])   2. В пароле должно быть число
            //(?=.*[a-z])   3. В пароле должна быть хотя бы 1 строчная буква
            //(?=.*[A-Z])   4. В пароле должна быть хотя бы 1 заглавная буква
            //(?=\\S+$)     без пробелов так как это пароль

            String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";
            return password.matches(pattern);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Введите пароль:");
                System.out.println("1. Пароль должен быть не менее 8ми символов.");
                System.out.println("2. В пароле должно быть число");
                System.out.println("3. В пароле должна быть хотя бы 1 строчная буква");
                System.out.println("4. В пароле должна быть хотя бы 1 заглавная буква");
            } while (!checkPassword(scanner.next()));
        }
    }

