import java.time.LocalDate;

public class Film {
    private String id, title, category, director;
    private LocalDate premiereDay;

    public Film(String id, String title, String category, String director, LocalDate premiereDay) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.premiereDay = premiereDay;
    }

    public Film() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getPremiereDay() {
        return premiereDay;
    }

    public void setPremiereDay(LocalDate premiereDay) {
        this.premiereDay = premiereDay;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", director='" + director + '\'' +
                ", premiereDay=" + premiereDay +
                '}';
    }
}
