package exercises.end.of.line;

import java.util.Scanner;

public class EndOfLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; scan.hasNext(); i++) {
            System.out.println(i + " " + scan.nextLine());
        }
    }
}
