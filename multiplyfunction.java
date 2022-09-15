import java.util.*;

public class multiplyfunction {
    public static int mulNum(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         int multiply= mulNum(a, b);
        System.out.println(multiply);
    }
}
