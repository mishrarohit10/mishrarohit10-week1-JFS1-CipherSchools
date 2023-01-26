public class encapsulation {
    public static void main(String[] args) {
        Amazon customer = new Amazon();
        float payableamt = customer.transaction(1000);
        System.out.println(payableamt);
    }
}

class Amazon {
    float transaction(float amt) {
        Gpay gpayobj = new Gpay();
        // gpayobj.charge=0;
        gpayobj.changeTX(0.99f);
        float totlamt = amt*(amt*gpayobj.getTX);
        return totlamt;
    }
}

class Gpay {
    private float charge = 0.05f;

    public void changeTX(float ch) {
        if(ch<=5) {
            System.out.println("Invalid charge");
            return;
        }
        charge = ch;
    }

    public float getTX() {
        return charge;
    }
}