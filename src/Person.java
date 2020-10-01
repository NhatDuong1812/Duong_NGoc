import java.util.Scanner;

public class Person {
    private int id;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(){}

    public Person(int id, String name, int age, String address, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter age: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter address: ");
        address = sc.nextLine();
        System.out.println("Enter phone number: ");
        phoneNumber = sc.nextLine();
        System.out.println("Enter email: ");
        email = sc.nextLine();
    }
}
