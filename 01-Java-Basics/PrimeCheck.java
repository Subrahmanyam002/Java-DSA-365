import java.util.Scanner;

public class Day01_PrimeCheck {
    public static boolean isPrime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }
        
        // Check factors from 2 up to the square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a factor, not prime
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(sc);
        System.out.print("Enter a number to check prime: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
        sc.close();
    }
