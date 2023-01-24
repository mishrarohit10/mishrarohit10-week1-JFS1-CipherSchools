import java.util.*;
public class test {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter any number");
            int num = in.nextInt();
            if(num>0) {
                System.out.println("+ve");
            }
            else if(num==0) {
                System.out.println("neurtal");
            }
            else {
                System.out.println("-ve");
            }
        }
    }
}