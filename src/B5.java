import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        if(n<=1){
            System.out.println("Ko co so hoan hao nao nho hon 1");
            return;
        }
        System.out.print("Cac so hoan hao nho hon " + n + " la :");
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for(int j = 1; j < i; j++) {
                if(i % j == 0){
                    sum += j;
                }
            }

            if(sum == i){
                System.out.println(sum);
            }

        }

    }
}
