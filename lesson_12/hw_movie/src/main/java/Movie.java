import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movie {
    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("category")
    private String[] category;
    @SerializedName("director")
    private String director;
    @SerializedName("length")
    private int length;
    @SerializedName("release")
    private String release;
    @SerializedName("view")
    private int view;

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category=" + Arrays.toString(category) +
                ", director='" + director + '\'' +
                ", length=" + length +
                ", release='" + release + '\'' +
                ", view=" + view +
                '}';
    }
}
