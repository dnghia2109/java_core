package model;

public class Library {
    private int id,quantity;
    private String name, author,publishingYear;

    public Library() {
    }

    public Library(int id, int quantity, String publishingYear, String name, String author) {
        this.id = id;
        this.quantity = quantity;
        this.publishingYear = publishingYear;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "model.Library{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", publishingYear=" + publishingYear +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
