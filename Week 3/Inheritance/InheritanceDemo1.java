import java.sql.Date;

class Person{
    String name;
    Date dob;
    Long mob_no;

    void read_data(String name, Date dob, Long mob_no){
        this.name = name;
        this.dob = dob;
        this.mob_no = mob_no;
    }

    void print_data(){
        System.out.println("Name : "+name);
        System.out.println("DOB : "+dob);
        System.out.println("Mob No : "+mob_no);
        System.out.println();
    }
}

class Student extends Person{
    String institute;
    int[] qualif = new int[20];
    int roll_no;
    int[] marks = new int[20];

    void printBioData(){
        print_data();
        System.out.println("Insitution : "+institute);
        System.out.println("Roll no : "+roll_no);

        for (int q=0; q<qualif.length; q++){
            System.out.println("Marks "+q+" : "+qualif[q]);
        }

        for (int m=0; m<marks.length; m++){
            System.out.println("Result "+m+" : "+marks[m]);
        }
        System.out.println();

    }
}

class Employee extends Person{
    int empno;
    int [] salaryHistory = new int[12];
    String organization;
    String designation;
    Date doj;

    void printSalary(){
        print_data();
        for (int s=0; s<salaryHistory.length; s++){
            System.out.println("Salary "+s+" : "+salaryHistory[s]);
        }
    System.out.println();

    }
}

public class InheritanceDemo1 {
    public static void main(String args[]){
        Person p =new Person();
        p.name = "Ram";
        // p.read_data("Ram",null,984565456);
        // p.dob = (Date)"01/02/2003";
        p.mob_no = (long) 982654657;
        p.print_data();

        Student s = new Student();
        s.institute = "IIT Kharagpur";
        s.roll_no = 111;
        s.printBioData();
        // s.print_data();

        Employee e = new Employee();
        e.empno = 101;
        e.designation = "Engineer";
        e.printSalary();
        // e.print_data();
    }
}