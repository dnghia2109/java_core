import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Serial extends Cinema {
    private int episode;
    private String status;

    @Override
    public String toString() {
        return super.toString() +
                "episode=" + episode +
                ", status='" + status + '\'' +
                '}';
    }
}
