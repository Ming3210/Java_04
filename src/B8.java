import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Nhap n: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                }
            } else {
                scanner.next(); 
            }
            System.out.println("Vui long nhap lai");
        }

        System.out.println("Cac so Armstrong tu 1 den " + n + " là:");

        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            int originalNum = num;
            int digits = 0;

            int temp = num;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            while (num > 0) {
                int digit = num % 10;
                int num2 = 1;

                for (int j = 0; j < digits; j++) {
                    num2 *= digit;
                }

                sum += num2;
                num /= 10;
            }

            if (sum == originalNum) {
                System.out.print(i + " ");
            }
        }
    }
}
