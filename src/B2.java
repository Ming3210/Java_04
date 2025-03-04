import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.printf("%d khong phai la so nguyen to", n);
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.printf("%d la so nguyen to", n);
        } else {
            System.out.printf("%d khong phai la so nguyen to", n);
        }

    }

}

