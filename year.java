import java.util.Scanner;

class LeapCode{
    int yr;
    void check(){
        if((yr%4==0 && yr%100!=0) || (yr%400==0)){
            System.out.println(yr+"--> Leap Year");
        }
        else{
            System.out.println(yr+"--> Non Leap Year");
        }
    }
}
public class year{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter year:");
        int yr = s.nextInt();
        LeapCode l = new LeapCode();
        l.yr=yr;
        l.check();
    }
}