import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InternetBankingService {
    public static void showBalance(User user){
        System.out.println("- Số sư TK:" + user.getBalance());
    }

    public static void transferMoney(User user){
        Scanner sc = new Scanner(System.in);
        InternetBanking transactionDetail = new InternetBanking();
        ArrayList<InternetBanking> transactionDetailList = new ArrayList<>();


        // Check định dạng STK người nhận
        String regexReceiveAccount = "^[0-9]{8,16}$";
        boolean receiveAccountFlag = true;
        while (receiveAccountFlag) {
            System.out.println("- STK người nhận:");
            String inputReceiveAccount = sc.nextLine();
            if (Pattern.matches(regexReceiveAccount, inputReceiveAccount)){
                transactionDetail.setReceiveAccount(inputReceiveAccount);
                receiveAccountFlag = false;
            }else {
                System.out.println("STK không hợp lệ. Vui lòng nhập lại.");
            }
        }

        // Check số tiền gửi(transactionAmount)
        boolean transactionAmountFlag = true;
        while (transactionAmountFlag) {
            System.out.println("- Số tiền giao dịch:");
            long inputTransactionAmount = Long.parseLong(sc.nextLine());
            if ((user.getBalance() - inputTransactionAmount) >= 50000){
                user.setBalance(user.getBalance() - inputTransactionAmount);
                transactionDetail.setTransactionAmount(inputTransactionAmount);
                transactionAmountFlag = false;
            }else {
                System.out.println("Số dư TK không đủ để thực hiện giao dịch.");
            }
        }

        System.out.println("- ND giao dịch:");
        String inputTransactionDescription = sc.nextLine();
        transactionDetail.setTransactionDescription(inputTransactionDescription);

        // Thời gian giao dịch
        transactionDetail.setTransactionDate(LocalDate.now());

        // TK người gửi
        transactionDetail.setSenderAccount(user.getPhoneNumber());

        // Mã giao dịch
        if (transactionDetailList.size() < 1){
            transactionDetail.setTransactionId(1);
        }
        else {
            transactionDetail.setTransactionId(transactionDetailList.size() + 1);
        }

        transactionDetailList.add(transactionDetail);

    }

    public void showTransactionDetail(ArrayList<InternetBanking> list, User user){
        for ()
    }
}
