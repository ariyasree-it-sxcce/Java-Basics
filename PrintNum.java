class Numbers{
    void print(){
        for(int i=1;i<=100;i++){
            System.out.print(" "+i);
        }
    }
}

public class PrintNum{
    public static void main(String[] args) {
        System.out.println("The Numbers from 1-100:");
        Numbers n=new Numbers();
        n.print();
    }
}
