import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher(1, "Hưng", LocalDate.of(1999, 12,12), "Nam",
                "Hà nội", "Toán", 100000);
        System.out.println(t.getName());
    }
}

