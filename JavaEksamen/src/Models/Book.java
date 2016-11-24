package Models;

import java.util.ArrayList;

/**
 * Created by EmilEhrenreich on 24/11/2016.
 */
public class Book {

    private String bookID;
    private String title;
    private String version;
    private String ISBN;
    private int priceAB;
    private int priceSaxo;
    private int price CDON;
    private String Publisher;
    private ArrayList<Author> authors;

    public Book(String bookID, String title, String version, String ISBN, int priceAB, int priceSaxo, int price, String publisher, ArrayList<Author> authors) {
        this.bookID = bookID;
        this.title = title;
        this.version = version;
        this.ISBN = ISBN;
        this.priceAB = priceAB;
        this.priceSaxo = priceSaxo;
        this.price = price;
        Publisher = publisher;
        this.authors = authors;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPriceAB() {
        return priceAB;
    }

    public void setPriceAB(int priceAB) {
        this.priceAB = priceAB;
    }

    public int getPriceSaxo() {
        return priceSaxo;
    }

    public void setPriceSaxo(int priceSaxo) {
        this.priceSaxo = priceSaxo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }
}
