class SwapExample{
    int a=10;
    int b=20;
    int temp;
    void beforeswapping(){
        System.out.println("---Before Swap---");
        System.out.println("A="+a);
        System.out.println("B="+b);
    }
    void afterSwapping(){
        temp=a;
        a=b;
        b=temp;
        System.out.println("---After swap---");
        System.out.println("A="+a);
        System.out.println("B="+b);
    }
}
public class swap{
    public static void main(String[] args) {
        SwapExample s = new SwapExample();
        s.beforeswapping();
        s.afterSwapping();
    }
}