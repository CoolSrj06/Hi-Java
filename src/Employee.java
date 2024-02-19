import java.util.*;
class Employee
{
    int eno;
    String ename;
    int age;
    int basic;
    void accept()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Employee number");
        eno=sc.nextInt();

        //Consume the newline character
        sc.nextLine();

        System.out.println("Name of Employee");
        ename=sc.nextLine();
        System.out.println("Age of the Employee");
        age=sc.nextInt();
        System.out.println("Basic salary");
        basic=sc.nextInt();
    }
    void calculate()
    {
        double net,hra,da,pf;
        hra = 18.0/100*basic;
        da=22.0/100*basic;
        pf=8.25/100*basic;
        net = basic+hra+da-pf;
        if(age>=50)
            System.out.println(net+5000);
        else
            System.out.println(net);
    }
    void print()
    {
        System.out.println(eno+"\t" +ename+"\t"+age+"\t" +basic);
    }

    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.accept();
        obj.print();
        obj.calculate();
    }
}
