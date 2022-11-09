package OOPS;

public class Employee {
    int empid;
    String name;
    double salary;
    String dept;
    public static void main(String[] args) {
        Employee ram=new Employee();
        System.out.println(ram);
        ram.empid=101;
        ram.name="Ram Sharma";
        ram.salary=10000;
        ram.dept="IT";
        System.out.println("ID:"+ram.empid);
        System.out.println("Name:"+ram.name);
        System.out.println("Salary:"+ram.salary);
        System.out.println("Dept:"+ram.dept);

        Employee shayam=new Employee();
        shayam.empid=102;
        shayam.name="Shyam Sharma";
        shayam.salary=45000;
        shayam.dept="EE";
        System.out.println("ID:"+shayam.empid);
        System.out.println("Name:"+shayam.name);
        System.out.println("Salary:"+shayam.salary);
        System.out.println("Dept:"+shayam.dept);

    }
}
