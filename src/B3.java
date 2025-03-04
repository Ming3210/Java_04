import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so n: ");

        int n = scanner.nextInt();
        if(n<1) System.out.println("So nhap ko hop le");
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
}
