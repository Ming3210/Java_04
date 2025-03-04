import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int number = n;

        int sum = n;
        boolean isHappy = false;

        while (true) {
            int sum2 = 0;
            while (n > 0) {
                sum2 = sum2 + (n % 10) * (n % 10);
                n = n / 10;
            }
            n = sum2;
            sum = n;

            if (sum == number) {
                break;
            }

            if (sum == 1) {
                isHappy = true;
                break;
            }
        }

        if (isHappy) {
            System.out.println(number + " la so hanh phuc");
        } else {
            System.out.println(number + " khong phai la so hanh phuc");
        }
    }
}