import java.util.Scanner;

public class Day01_ArmstrongNumbers {
    // Helper method to check if a number is Armstrong
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        
        // Find total number of digits
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower bound of range: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper bound of range: ");
        int upper = sc.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + ":");
        for (int i = lower; i <= upper; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
