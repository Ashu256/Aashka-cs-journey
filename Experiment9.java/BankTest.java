abstract class Bank {

    abstract int getInterestRate();
}
class SBI extends Bank {
    int getInterestRate() {
        return 6;
    }
}
class ICICI extends Bank {
    int getInterestRate() {
        return 7;
    }
}
class HDFC extends Bank {
    int getInterestRate() {
        return 8;
    }
}
public class BankTest {
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        System.out.println("SBI Interest Rate: " + b.getInterestRate() + "%");

        b = new ICICI();
        System.out.println("ICICI Interest Rate: " + b.getInterestRate() + "%");

        b = new HDFC();
        System.out.println("HDFC Interest Rate: " + b.getInterestRate() + "%");
    }
}


