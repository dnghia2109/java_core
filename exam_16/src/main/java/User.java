import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class User {
    private String phoneNumber;
    private String password;
    private long balance;
    private ArrayList<InternetBanking> transactionDetail;

    public User(String phoneNumber, String password, long balance) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", balance=" + balance +
                ", transactionDetail=" + transactionDetail +
                '}';
    }
}
