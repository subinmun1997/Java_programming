package Chapter1;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 자리 정수를 하나 입력해주세요. >");
        int number = scanner.nextInt();

        System.out.println("입력 내용: " + number);
        System.out.printf("number is %d%n", number);
    }
}
