import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.printf("Nhap n: ");
        int n = scanner.nextInt();
        sum = n;
        while (n != 0){
            n = scanner.nextInt();
            sum += n;
        }
        System.out.println("Tong cac so da nhap: " + sum);
    }
}
