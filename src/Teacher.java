import java.util.Scanner;

public class Teacher extends Person {
    private String  subject;
    private double seniority;
    private float hardSalary;
    private float salary;

    // seniority : thâm niên;


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSeniority() {
        return seniority;
    }

    public void setSeniority(double seniority) {
        this.seniority = seniority;
    }

    public float getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(float hardSalary) {
        this.hardSalary = hardSalary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public double salary(){
        if (this.seniority < 1) {
            return salary ;
        }
    }

    @Override
    public void addInfo() {
        Scanner sc = new Scanner(System.in);
        super.addInfo();
        System.out.println("Enter subject: ");
        subject = sc.nextLine();
        System.out.println("Enter seniority: ");
        seniority = Double.parseDouble(sc.nextLine());
        System.out.println("Enter hard salary: ");
        hardSalary = Float.parseFloat(sc.nextLine());
    }
}
