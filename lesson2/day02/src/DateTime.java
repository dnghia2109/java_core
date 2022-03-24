import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate toDay = LocalDate.now();
        System.out.println(toDay);

        LocalDate currentDate = LocalDate.of(2022, 9, 21);
        System.out.println(currentDate);

        System.out.println(toDay.getDayOfMonth());
        System.out.println(toDay.getDayOfWeek());
        System.out.println(toDay.getDayOfYear());

        System.out.println(toDay.getMonth());
        System.out.println(toDay.getMonthValue());

        System.out.println("Ngày tiếp theo: " + toDay.plusDays(1));
        System.out.println("Ngày hôm trước: " + toDay.minusDays(1));
        System.out.println("Ngày này năm trước: " + toDay.minusYears(1));


        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime currentTime = LocalTime.of(12, 30,30);
        System.out.println(currentTime);

        System.out.println(time.getHour());
        System.out.println(time.plusMinutes(300));


        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime localDateTime = LocalDateTime.of(currentDate, currentTime);
        System.out.println(localDateTime);

//        Cách đẻ format ngày tháng năm
        String format = "dd/MM/yyyy, hh:mm";
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern(format);
        String rs = dateTime.format(myFormat);
        System.out.println(rs);


//        Viết ctrinh in ra thông tin cá nhân gồm tên, ngày sinh, quê quán
        LocalDate birthday =  LocalDate.of(2001, 9, 21);
        String format1 = "dd/MM/yyyy";
        DateTimeFormatter myFormat1 = DateTimeFormatter.ofPattern(format1);
        String birthday1 = birthday.format(myFormat1);
        String name = "Lại Duy Nghĩa", address = "Hà Nội";
        System.out.println("Tên tôi là: "+ name + " tôi sinh ngày: " + birthday1 + ", tôi đến từ " + address);
    }
}
