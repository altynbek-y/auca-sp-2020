import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //double[][] arr = new double[12][12];
        double d, sum = 0;
        int limit=5;
        String op = s.next();
        
        for(int i=0; i<12; i++)
        {
            for(int j=0; j<12; j++)
            {
                d = s.nextDouble();
                if(j>=limit && j<=11-limit && i>=7)
                    sum+=d;
            }
            if(i>=7) limit--;
        }

        if (op.equals("S"))
            System.out.printf("%.1f\n", sum);
        else
            System.out.printf("%.1f\n", sum/30);

        s.close();
    }
}
