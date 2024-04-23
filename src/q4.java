import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        List<String> usernames = new ArrayList<>();
        List<String> passwords = new ArrayList<>();
        List<String> firstNames = new ArrayList<>();
        List<String> lastNames = new ArrayList<>();
        List<String> email = new ArrayList<>();


        usernames.add("user1");
        passwords.add("12345");
        firstNames.add("Emma");
        lastNames.add("Watson");
        email.add("emmawatson@yahoo.com");


        usernames.add("user2");
        passwords.add("12345");
        firstNames.add("Daniel");
        lastNames.add("Radcliffe");
        email.add("danielradcliffe@yahoo.com");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adı: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Parola: ");
        String inputPassword = scanner.nextLine();

        //Kontrol:
        boolean isLoggedIn = false;
        for (int i = 0; i < usernames.size(); i++) {
            if (usernames.get(i).equals(inputUsername) && passwords.get(i).equals(inputPassword)) {
                isLoggedIn = true;
                System.out.println("Giriş başarılı. Hoş geldiniz, " + firstNames.get(i) + " " + lastNames.get(i) + "!");
                break;
            }
        }

        if (!isLoggedIn) {
            System.out.println("Kullanıcı adı veya parola hatalı. Giriş başarısız.");
        }
        scanner.close();
    }
}

