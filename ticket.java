import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter speed");
        int speed = in.nextInt();
        System.out.println("today is your birthday");
        boolean isBirthDay = in.nextBoolean();
        if(isBirthDay==true) {
            speed = speed - 5;
        }
        if(speed>80) {
            System.out.println("High ticket");
        }
        else if(speed>=60&&speed<=80) {
            System.out.println("Mid ticket");
        }
        else{
            System.out.println("no ticket");
        }
    }
}
