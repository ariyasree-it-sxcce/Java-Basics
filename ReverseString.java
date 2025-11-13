import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= s.nextLine();
        String reverse="";

        int start=0;
        int end=str.length()-1; //returns the length of the character

        System.out.println("String = "+str);

        while (end>=0) {
            reverse=reverse+str.charAt(end) ; //charAt(end) function returns the character at the end
            end--;          
        }
        System.out.println("Reversed String="+reverse);
    }
}