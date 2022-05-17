import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InternetBankingService {
    public void showBalance(User user){
        System.out.println("- Số sư TK:" + user.getBalance());
    }

//    public ArrayList<InternetBanking> transferMoney(User user){
//        Scanner sc = new Scanner(System.in);
//        InternetBanking transactionDetail = new InternetBanking();
//        ArrayList<InternetBanking> transactionDetailList = new ArrayList<>();
//
//        transactionDetail.setSenderAccount(user.getPhoneNumber());
//
//        // Check định dạng STK người nhận
//        String regexReceiveAccount = "^[0-9]{8,16}$";
//        boolean receiveAccountFlag = true;
//        while (receiveAccountFlag) {
//            System.out.println("- STK người nhận:");
//            String inputReceiveAccount = sc.nextLine();
//            if (Pattern.matches(regexReceiveAccount, inputReceiveAccount)){
//                transactionDetail.setReceiveAccount(inputReceiveAccount);
//                receiveAccountFlag = false;
//            }else {
//                System.out.println("STK không hợp lệ. Vui lòng nhập lại.");
//            }
//        }
//
//        // Check số tiền gửi(transactionAmount)
//        boolean transactionAmountFlag = true;
//        while (transactionAmountFlag) {
//            System.out.println("- Số tiền giao dịch:");
//            long inputTransactionAmount = Long.parseLong(sc.nextLine());
//            if ((user.getBalance() - inputTransactionAmount) >= 50000){
//                user.setBalance(user.getBalance() - inputTransactionAmount);
//                transactionDetail.setTransactionAmount(inputTransactionAmount);
//                transactionAmountFlag = false;
//            }else {
//                System.out.println("Số dư TK không đủ để thực hiện giao dịch.");
//            }
//        }
//
//        System.out.println("- ND giao dịch:");
//        String inputTransactionDescription = sc.nextLine();
//        transactionDetail.setTransactionDescription(inputTransactionDescription);
//
//        // Thời gian giao dịch
//        transactionDetail.setTransactionDate(LocalDate.now());
//
//        // TK người gửi
//        transactionDetail.setSenderAccount(user.getPhoneNumber());
//
//        // Mã giao dịch
//        if (transactionDetailList.size() < 1){
//            transactionDetail.setTransactionId(1);
//        }
//        else {
//            transactionDetail.setTransactionId(transactionDetailList.size() + 1);
//        }
//
//        transactionDetailList.add(transactionDetail);
//
//        return transactionDetailList;
//    }


    public void transferMoney(User user){
        Scanner sc = new Scanner(System.in);
        InternetBanking transaction = new InternetBanking();
        ArrayList<InternetBanking> transactionList = new ArrayList<>();

//        transaction.setTransactionId(transactionList.size() + 1);



        // Thời gian giao dịch
        transaction.setTransactionDate(LocalDateTime.now());

        // Nhập STK ng nhận
        String regexReceiveAccount = "^[0-9]{8,16}$";
        boolean receiveAccountFlag = true;
        while (receiveAccountFlag) {
            System.out.println("- STK người nhận:");
            String inputReceiveAccount = sc.nextLine();
            if (Pattern.matches(regexReceiveAccount, inputReceiveAccount)){
                transaction.setReceiveAccount(inputReceiveAccount);
                receiveAccountFlag = false;
            }else {
                System.out.println("STK không hợp lệ. Vui lòng nhập lại.");
            }
        }

        // Nhập số tiền gửi
        boolean transactionAmountFlag = true;
        while (transactionAmountFlag) {
            System.out.println("- Nhập số tiền muốn gửi:");
            long inputTransactionAmount = Long.parseLong(sc.nextLine());
            if ((user.getBalance() - inputTransactionAmount) >= 50000){
                user.setBalance(user.getBalance() - inputTransactionAmount);
                transaction.setTransactionAmount(inputTransactionAmount);
                transactionAmountFlag = false;
            }else {
                System.out.println("Số dư TK không đủ để thực hiện giao dịch.");
            }
        }

        // Nhập ND chuyển tiền
        System.out.println("- ND chuyển tiền:");
        String inputTransactionDescription = sc.nextLine();
        transaction.setTransactionDescription(inputTransactionDescription);

//        transactionList.add(transaction);
//        user.setTransactionDetail(transactionList);


        // Mã giao dịch
        if (user.getTransactionDetail() == null){
            transaction.setTransactionId(1);
            transactionList.add(transaction);
            user.setTransactionDetail(transactionList);
        } else {
            transaction.setTransactionId(user.getTransactionDetail().size() + 1);
            user.getTransactionDetail().add(transaction);
        }

    }

    // Xem lịch sử giao dịch
    public void showTransactionDetail(ArrayList<InternetBanking> list){
        for (InternetBanking i : list){
            System.out.println(i);
        }
    }
}
