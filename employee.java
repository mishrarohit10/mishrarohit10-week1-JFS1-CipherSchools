import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double basicpay = in.nextInt();
            double hra = 0 , da = 0;
            if(basicpay>=5000) {
                hra = 0.1 * basicpay;
                da = 0.2 * basicpay;
            }
            else {
                hra = 0.2 * basicpay;
                da = 0.3 * basicpay;
            }
            System.out.println(hra+" "+da);
            System.out.println(basicpay+ hra+ da);
        }
    }
}
