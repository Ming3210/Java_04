import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Hiển thị menu
            System.out.println("\n=== MENU ===");
            System.out.println("1. Kiểm tra số nguyên tố");
            System.out.println("2. Kiểm tra số hoàn hảo");
            System.out.println("3. Tìm và tính tổng các ước của một số");
            System.out.println("4. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int n1 = scanner.nextInt();
                    boolean isPrime = true;

                    if (n1 < 2) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(n1); i++) {
                            if (n1 % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }

                    if (isPrime) {
                        System.out.println(n1 + " là số nguyên tố.");
                    } else {
                        System.out.println(n1 + " không phải là số nguyên tố.");
                    }
                    break;

                case 2:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int n2 = scanner.nextInt();
                    int sumPerfect = 0;

                    for (int i = 1; i < n2; i++) {
                        if (n2 % i == 0) {
                            sumPerfect += i;
                        }
                    }

                    if (sumPerfect == n2) {
                        System.out.println(n2 + " là số hoàn hảo.");
                    } else {
                        System.out.println(n2 + " không phải là số hoàn hảo.");
                    }
                    break;

                case 3:
                    System.out.print("Nhập số cần tìm ước: ");
                    int n3 = scanner.nextInt();
                    int sumDivisors = 0;

                    System.out.print("Các ước của " + n3 + " là: ");
                    for (int i = 1; i <= n3; i++) {
                        if (n3 % i == 0) {
                            System.out.print(i + " ");
                            sumDivisors += i;
                        }
                    }
                    System.out.println("\nTổng các ước: " + sumDivisors);
                    break;

                case 4:
                    System.out.println("Thoát chương trình");
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại!");
            }

        } while (1==1);


    }
}
