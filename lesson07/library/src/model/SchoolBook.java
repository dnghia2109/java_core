package model;



public class SchoolBook extends Library {
    private String status;
    private int pageNumber, borrow;

    public SchoolBook() {
    }

    public SchoolBook(int id, int quantity, String publishingYear, String name, String author, String status, int pageNumber, int borrow) {
        super(id, quantity, publishingYear, name, author);
        this.status = status;
        this.pageNumber = pageNumber;
        this.borrow = borrow;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getBorrow() {
        return borrow;
    }

    public void setBorrow(int borrow) {
        this.borrow = borrow;
    }
}
