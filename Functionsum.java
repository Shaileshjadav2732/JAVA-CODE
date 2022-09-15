import java.util.*;

public class Functionsum {
    public static int calculatesum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=50;  
        int l=sc.nextInt();
        int sum = calculatesum(k, l);
        System.out.println("sum of 2 number is:" + sum);
    }
}