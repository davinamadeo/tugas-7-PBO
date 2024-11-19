import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SupportSystem bot = new SupportSystem();

        LocalTime currentTime = LocalTime.now();
        String greeting;
        if (currentTime.isBefore(LocalTime.NOON)) {
            greeting = "Selamat pagi!";
        } else if (currentTime.isBefore(LocalTime.of(18, 0))) {
            greeting = "Selamat siang!";
        } else {
            greeting = "Selamat sore!";
        }

        System.out.println(greeting + " Haloo! Sebelum mulai, siapa namamu?");
        String userName = scanner.nextLine();
        System.out.println("Senang bertemu denganmu, " + userName + "! Apa yang ingin kita bicarakan hari ini?");

        while (true) {
            String userInput = scanner.nextLine();
            
            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("Dadaahh, " + userName + "! Semoga harimu menyenangkan! 😊");
                break;
            }

            String response = bot.getResponse(userInput, userName);
            System.out.println(response);
        }
        
        scanner.close();
    }
}
