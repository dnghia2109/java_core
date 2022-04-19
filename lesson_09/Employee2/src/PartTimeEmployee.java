public class PartTimeEmployee extends Employee implements IEmployee {
    private int workingHours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }
    
    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getPaymentPerHour() {
        return super.getPaymentPerHour();
    }

    @Override
    public void setPaymentPerHour(int paymentPerHour) {
        super.setPaymentPerHour(paymentPerHour);
    }

    @Override
    public float calculatorSalary() {
        return super.calculatorSalary();
    }

    @Override
    public void getName() {
        super.getName();
    }
}
