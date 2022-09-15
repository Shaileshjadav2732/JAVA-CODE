import java.util.*;

import javax.sound.sampled.SourceDataLine;
import javax.swing.plaf.synth.SynthToolTipUI;

public class condition2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("a is lesser");
        }

    }

}
