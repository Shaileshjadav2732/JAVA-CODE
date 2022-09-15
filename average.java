import java.util.*;

public class average {
    public static float ave(float a, float b, float c) {
        float avg = (a + b + c) / 3;

        return avg;
    }

    public static void main(String[] args) {
        System.out.println("enter three number:");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float averag = ave(a, b, c);
        System.out.println(averag);
    }
}
