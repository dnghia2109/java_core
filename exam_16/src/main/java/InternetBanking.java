import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InternetBanking {
    public SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    private int transactionId;
    private String senderAccount;
    private LocalDateTime transactionDate;

    private String receiveAccount;
    private long transactionAmount;
    private String transactionDescription;

    public InternetBanking(int transactionId, String senderAccount, LocalDateTime transactionDate, String receiveAccount, long transactionAmount, String transactionDescription) {
        this.transactionId = transactionId;
        this.senderAccount = senderAccount;
        this.transactionDate = transactionDate;
        this.receiveAccount = receiveAccount;
        this.transactionAmount = transactionAmount;
        this.transactionDescription = transactionDescription;
    }

    @Override
    public String toString() {
        return
                "transactionId= " + transactionId +
                ", transactionDate= " + transactionDate +
                ", receiveAccount= " + receiveAccount +
                ", transactionAmount= " + transactionAmount +
                ", transactionDescription= " + transactionDescription +
                '}';
    }
}
