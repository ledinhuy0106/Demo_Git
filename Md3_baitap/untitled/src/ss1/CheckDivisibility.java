import java.util.Scanner;

public class CheckDivisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số tự nhiên: ");
        int num = scanner.nextInt();
        String result ;
        if (num % 3 == 0 && num % 5 == 0) {
            result = "Chia hết cho cả 3 và 5";
        } else if (num % 3 == 0) {
            result = "Chỉ chia hết cho 3";
        } else if (num % 5 == 0) {
            result = "Chỉ chia hết cho 5";
        } else {
            result = "Không chia hết cho 3, cũng không chia hết cho 5";
        }
        System.out.println(result);
    }
}
