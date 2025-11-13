abstract class PaymentProcessor{
    abstract void pay(int amount);
    abstract void refund();
    void balance(int bal){
        if(bal==0){
            System.out.println("Zero Balance");
        }
        else{
            System.out.println("Your Balance is "+bal);
        }
    }
}

class UPI extends PaymentProcessor{
    void pay(int amount){
    System.out.println("PAYMENT AMOUNT:"+amount);
    System.out.println("PAYMENT COMPLETED THROUGH UPI");
    }
    void refund(){
        System.out.println("Refund Completed");
    }
}
class Credit extends PaymentProcessor{
    void pay(int amount){
        System.out.println("PAYMENT "+amount+" COMPLETED THROUGH Credit Card");
    }
    void refund()
    {
        System.out.println("Refund Completed");
    }
}

public class Main{
    public static void main(String[] args) {
        UPI u =new UPI();
        u.pay(1000);
        u.refund();
        Credit c=new Credit();
        c.pay(2000);
        c.refund();
        c.balance(0);
    }
}