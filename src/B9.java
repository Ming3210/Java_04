import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();

        System.out.println("Các số Palindrome nhỏ hơn hoặc = " + n + " là:");

        for (int i = 1; i <= n; i++) {
            int num = i;
            int reversed = 0;
            int temp = num;

            while (temp > 0) {
                reversed = reversed * 10 + temp % 10;
                temp /= 10;
            }

            if (reversed == num) {
                System.out.print(num + " ");
            }
        }
    }
}
