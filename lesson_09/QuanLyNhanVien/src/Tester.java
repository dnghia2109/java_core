public class Tester extends Employee{
    private int id, salary;
    private String name, address, dateOfBirth, mobile, email;
    private Gender gender;
    private int bug;

    public Tester() {
    }

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

    public int getBug() {
        return bug;
    }

    public void setBug(int bug) {
        this.bug = bug;
    }

    public Tester(int id, int salary, String name, String address, String dateOfBirth, String mobile, String email, Gender gender, int bug) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.mobile = mobile;
        this.email = email;
        this.gender = gender;
        this.bug = bug;
    }

    @Override
    public void showAllEmploy() {

        return null;
    }

    @Override
    public void showEmploy1() {

    }
}
