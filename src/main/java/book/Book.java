package book;

import java.util.Objects;

public class Book {
    private final String title;
    private final String author;
    private final int price;

    private Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static Book createBook(String title, String author, int price) {
        return new Book(title, author, price);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Book book = (Book) o;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }
}
