import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong: ");
        int n = scanner.nextInt();
        if(n<=0){
            System.out.printf("So nhap vao ko hop le");
            return;
        };
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum +=i;
        }
        System.out.println("Tong cac so nguyen tu 1 den " + n + " la: " + sum);
    }
}
