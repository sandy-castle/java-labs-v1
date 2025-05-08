package chapter5.labs.lab3;

public class Book implements Buyable {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    @Override
    public String getDescription() {
        return title + " by " + author + ", 가격: " + price + "원";
    }

    public String getTitleWithAuthor() {
        return title + " by " + author;
    }
}
