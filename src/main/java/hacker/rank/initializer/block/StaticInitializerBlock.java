package hacker.rank.initializer.block;

import java.util.Scanner;

public class StaticInitializerBlock {

    private static final int B;
    private static final int H;
    static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        if ((B > 0 && H > 0) && (B < 100 && H < 100)) {
            flag = true;
        } else if (B <= 0 || H <= 0 && B > 99 || H > 99) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }

}
