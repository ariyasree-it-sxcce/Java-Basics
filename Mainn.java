abstract class Company{
    abstract void salary(int sal);
    abstract void bonus(int bon);
}
class Manager extends Company{
    void salary(int sal){
        System.out.println("Manager Salary:"+sal);
    }
    void bonus(int bon){
        System.out.println("Bonus="+bon);
    }
}
class Employee extends Company{
    void salary(int sal){
        System.out.println("Employee Salary:"+sal);
    }
    void bonus(int bon){
        System.out.println("Bonus="+bon);
    }
}

class Mainn{
    public static void main(String[] args){
        Manager m=new Manager();
        m.salary(250000);
        m.bonus(50000);
        Employee e =new Employee();
        e.salary(80000);
        e.bonus(10000);
    }
}