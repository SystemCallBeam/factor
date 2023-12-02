import java.util.Scanner;

public class FindFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e[] = new int[3];
        System.out.print("Enter three numbers:");
        for (int i = 0; i < e.length; i++) {
            e[i] = sc.nextInt();
        }

        System.out.print("Test:");
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i]);
        }

        sc.close();
    }
}
