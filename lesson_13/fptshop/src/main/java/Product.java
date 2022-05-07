import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private String description;
    private long price;
    private String brand;
    private int quantity;
    private int quantitySold;
    private ArrayList<String> category;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", quantitySold=" + quantitySold +
                ", category=" + category +
                '}';
    }
}
