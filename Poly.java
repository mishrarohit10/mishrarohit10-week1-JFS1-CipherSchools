// an ability of object to take many forms
// static: overloading    dynamic: overriding
public class Poly { 
    
    //function overloading 
    
    void add(int num1, int num2) {
        System.out.println(num2+num1);
    }
    void add(int num1, int num2, int num3) {
        System.out.println(num1+num2+num3);
    }
    void add(float num1, float num2, float num3) {
        System.out.println(num1+num2+num3);
    }
    void add(float num1, float num2) {
        System.out.println(num1+num2);
    }
    public static void main(String[] args) {
        Poly p = new Poly();
        p.add(234,234);
    }
}
