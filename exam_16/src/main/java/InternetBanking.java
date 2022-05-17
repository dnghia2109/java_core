import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InternetBanking {
    public SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    private int transactionId;
    private String senderAccount;
    private LocalDate transactionDate;

    private String receiveAccount;
    private long transactionAmount;
    private String transactionDescription;


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
