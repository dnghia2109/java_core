package model;

import java.time.LocalDate;

public class Employee {
    public String id, name, gender, phone, email, address,  birthday;
    ;

    @Override
    public String toString() {
        return "model.Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
