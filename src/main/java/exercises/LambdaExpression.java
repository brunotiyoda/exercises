package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static exercises.LambdaExpression.MyMath.checker;

public class LambdaExpression {

    interface PerformOperation {
        boolean check(int num);
    }

    static class MyMath {
        public static boolean checker(PerformOperation p, int num) {
            return p.check(num);
        }

        public PerformOperation isOdd() {
            return a -> (a % 2 == 1);
        }

        public PerformOperation isPrime() {
            return a -> {
                for (int i = 2; i <= a / 2; i++) {
                    if (a % i == 0)
                        return false;
                }
                return true;
            };
        }

        public PerformOperation isPalindrome() {
            return a -> {
                int rev = 0;
                int r;
                int n = a;
                while (n != 0) {
                    r = n % 10;
                    rev = rev * 10 + r;
                    n /= 10;
                }
                return (rev == a);
            };
        }

    }

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        PerformOperation op;
        boolean ret;
        String ans = null;

        while (t-- > 0) {
            String s = bufferedReader.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(ans);
        }
    }

}
