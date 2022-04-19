import java.util.ArrayList;

public abstract class Employee {
    private int id, salary;
    private String name, address, dateOfBirth, mobile, email;
    private Gender gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Employee() {
    }

    public Employee(int id, int salary, String name, String address, String dateOfBirth, String mobile, String email, Gender gender) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.mobile = mobile;
        this.email = email;
        this.gender = gender;
    }

    public abstract void showAllEmploy();
    public abstract void showEmploy1();

}
