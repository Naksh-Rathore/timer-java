import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seconds;

        do {
            System.out.print("Enter the amount of seconds you want to time: ");
            seconds = scanner.nextInt();
        } while (seconds <= 0);

        for (int i = seconds; i >= 1; i--) {
            System.out.println(i);

            try {
                TimeUnit.SECONDS.sleep(1);
            } 
            
            catch (InterruptedException error) {
                error.printStackTrace();
            }
        }

        System.out.println("TIME IS UP!");

        scanner.close();
    }
}
