import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=a.nextInt();
        if(n<0){
            System.out.println("ENTER POSITIVE NUMBER");
        }
        else{
            int fact=1;
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            System.out.println("Factorial of "+n+" is "+fact);
        }
    }
}
