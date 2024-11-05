package book;

import book.exception.BookException;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private final List<Book> books;

    public Books() {
        this.books = new ArrayList<>();
    }

    public static Books initializeBooks() {
        return new Books();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(final Book book) {
        if (book == null) {
            throw new BookException("도서의 정보가 없습니다.");
        }
        if (containByTitle(book.getTitle())) {
            throw new BookException("이미 추가된 도서입니다.");
        }
        books.add(book);
    }

    public void deleteBook(final String title) {
        if (title == null) {
            throw new IllegalArgumentException("삭제할 도서의 제목이 없습니다.");
        }
        if (notContainByTitle(title)) {
            throw new BookException("삭제할 도서가 존재하지 않습니다.");
        }
        books.removeIf(book -> book.getTitle().equals(title));
    }

    public boolean containByTitle(final String title) {
        return books.stream()
                .anyMatch(book -> book.getTitle().equals(title));
    }

    public boolean notContainByTitle(final String title) {
        return !containByTitle(title);
    }

    public boolean empty() {
        return books.isEmpty();
    }
}
