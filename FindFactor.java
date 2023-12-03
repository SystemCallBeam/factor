import java.util.Random;
import java.util.Scanner;

public class FindFactor {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            prog();
        }
        sc.close();
    }

    public static void prog() {
        // Random random = new Random();
        float e[] = new float[3];
        // int n = 5;
        // for (int i = 0; i < e.length; i++) {
        // e[i] = (float)(random.nextInt(2 * n + 1) - n);
        // }
        System.out.print("Enter three numbers : ");
        // System.out.printf("Enter three numbers : %.2f %.2f %.2f\n", e[0], e[1],
        // e[2]);
        for (int i = 0; i < e.length; i++) {
            e[i] = sc.nextInt();
        }

        if (e[0] == 0 && e[1] == 0) {
            Method_0(e);
        } else if (e[0] == 0) {
            Method_1(e);
        } else if (e[1] == 0) {
            // Method_4(e);
            Method_3(e);
        } else if (e[2] == 0) {
            Method_2(e);
        } else if ((Math.pow(e[1], 2)) - (4 * e[0] * e[2]) >= 0) {
            Method_5(e);
            Method_4(e);
        } else {
            System.out.println("No real solutions exist.");
        }
    }

    // 0 0 n
    public static void Method_0(float e[]) {
        System.out.println("undefined");
    }

    // 0 n n
    public static void Method_1(float e[]) {
        double a = (float) -e[2] / e[1];
        System.out.printf("(%.2f, %.2f)\n", e[1], e[2]);
        System.out.printf("x = %.2f\n", a);
    }

    // n n 0
    public static void Method_2(float e[]) {
        double a = (float) -e[1] / e[0];
        System.out.printf("(%.2f, %.2f)(%.2f, %.2f)\n", e[0], e[1], 1f, 0f);
        System.out.printf("x = %.2f\n", a);
    }

    // n 0 n
    public static void Method_3(float e[]) {
        if (e[2] == 0) {
            System.out.println("x = 0");
            return;
        }
        double a = Math.sqrt(Math.abs((float) e[0]));
        double b = Math.sqrt(Math.abs((float) e[2]));
        double c = e[0] / a;
        double d = e[2] / b;
        System.out.printf("(%.2f, %.2f)(%.2f, %.2f)\n", a, b, c, d);
        System.out.printf("x = %.2f\n", -b / a);
        System.out.printf("x = %.2f\n", -d / c);
    }

    // n n n
    public static void Method_4(float e[]) {
        double a = (-e[1] + Math.sqrt(Math.pow(e[1], 2) - 4 * e[0] * e[2])) / (2 * e[0]);
        double b = (-e[1] - Math.sqrt(Math.pow(e[1], 2) - 4 * e[0] * e[2])) / (2 * e[0]);
        System.out.printf("x = %.2f\n", a);
        System.out.printf("x = %.2f\n", b);
    }

    // n n n
    public static void Method_5(float e[]) {
        float A = Math.abs(e[0]), C = Math.abs(e[2]);
        float a, b, c, d;
        for (int i = (int) -A; i <= A; i++) {
            if (i == 0)
                continue;
            a = i;
            c = e[0] / a;
            for (int j = (int) -C; j <= C; j++) {
                if (j == 0)
                    continue;
                b = j;
                d = e[2] / b;
                if (a * d + b * c == e[1]) {
                    System.out.printf("(%.2f, %.2f)(%.2f, %.2f)\n", a, b, c, d);
                }
            }
        }
    }
}
