public class Palindrome {
    public static void main(String[] args) {
        int n=123;
        int t=n;
        int rem,rev=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==t){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}