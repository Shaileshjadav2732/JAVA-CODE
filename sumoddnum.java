import java.util.*;

public class sumoddnum {
    public static int sumOddNum() {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                int sum = sum + i;
            } 
            System.out.println(sum);
        }
    }  

    public static void main(String[] args) {
        System.out.println("enter the number:");

        int k = sumOddNum();
       
    }
}
