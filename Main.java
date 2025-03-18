import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    static void delay(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } 
        
        catch (InterruptedException error) {
            error.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seconds;

        do {
            System.out.print("Enter the amount of seconds you want to time: ");
            seconds = scanner.nextInt();
        } while (seconds <= 0);

        delay(1); // Making sure that the timer start is visible

        for (int i = seconds; i >= 1; i--) {
            System.out.println(i);

            delay(1);
        }

        System.out.println("TIME IS UP!");

        scanner.close();
    }
}
