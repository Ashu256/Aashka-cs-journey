interface Payment {

    void pay();
}
class UPI implements Payment {
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}
class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}
class DebitCard implements Payment {
    public void pay() {
        System.out.println("Payment done using Debit Card");
    }
}
public class PaymentTest {
    public static void main(String[] args) {
        Payment p;

        p = new UPI();
        p.pay();

        p = new CreditCard();
        p.pay();

        p = new DebitCard();
        p.pay();
    }
}



