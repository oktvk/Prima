import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan nomor: ");
        int num = scanner.nextInt();
        

        if (isPrime(num)) {
            System.out.println(num + " adalah bilangan prima.");
        } else {
            System.out.println(num + " bukan bilangan prima."); 
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}