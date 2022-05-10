import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InternetBanking {
    private int transactionId;
    private String senderAccount;
    private LocalDate transactionDate;
    private String receiveAccount;
    private long transactionAmount;
    private String transactionDescription;

    @Override
    public String toString() {
        return "InternetBanking{" +
                "transactionId=" + transactionId +
                ", transactionDate=" + transactionDate +
                ", receiveAccount='" + receiveAccount + '\'' +
                ", transactionAmount=" + transactionAmount +
                ", transactionDescription='" + transactionDescription + '\'' +
                '}';
    }
}
