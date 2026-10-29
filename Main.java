
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String a = sc.nextLine();

        System.out.print("Enter second word: ");
        String b = sc.nextLine();

        StringBuilder sb = new StringBuilder(a);
        sb.append(b);

        System.out.println("Combined String: " + sb);

        sc.close();
    }
}
