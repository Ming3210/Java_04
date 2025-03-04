import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        if(n<0){
            n = -(n);
        }
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        System.out.println("Tong cac so trong: " + sum);
    }
}
