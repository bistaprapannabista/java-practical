// Object and Class Demonstration

class DOB {
    int year;
    int month;
    int date;

    DOB(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    String showDOB() {
        return year + "/" + month + "/" + date;
    }
}

class Student {
    int roll_no;
    String name;
    String address;
    DOB dob;

    Student(int roll_no, String name, String address, DOB dob) {
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
        this.dob = dob;
    }

    void display() {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Roll No: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("DOB: " + dob.showDOB());
    }
}

public class Lab1 {

    public static void main(String[] args) {
        DOB dob1 = new DOB(2001, 9, 7);
        Student s1 = new Student(23173, "Prapanna Bista", "Kathmandu, Nepal", dob1);
        s1.display();
        DOB dob2 = new DOB(2001, 9, 15);
        Student s2 = new Student(23173, "Prasanna Thapa", "Kathmandu, Nepal", dob2);
        s2.display();
    }
}