package book;

import book.exception.BookException;
import book.io.InputHandler;
import book.io.OutputHandler;

import java.io.IOException;

public class BookApplication {

    private static Books books;

    public void initialize() {
        books = Books.initializeBooks();
    }

    public void start() throws IOException {
        OutputHandler.printStartMessage();
        run();
        OutputHandler.printEndMessage();
    }

    private void run() throws IOException {
        while (true) {
            OutputHandler.printSelectMessage();
            int selected = InputHandler.selectMenu();

            if (selected == 1) {
                OutputHandler.printTitleInputMessage();
                String title = InputHandler.getInput();
                OutputHandler.printAuthorInputMessage();
                String author = InputHandler.getInput();
                OutputHandler.printPriceInputMessage();
                int price = Integer.parseInt(InputHandler.getInput());
                try {
                    books.addBook(Book.createBook(title, author, price));
                } catch (BookException e) {
                    OutputHandler.printErrorMessage(e.getMessage());
                }

            } else if (selected == 2) {
                if (books.empty()) {
                    OutputHandler.printErrorMessage("등록된 도서가 없습니다.");
                    continue;
                }
                OutputHandler.printBooksInfo(books);
            } else if (selected == 3) {
                OutputHandler.printDeleteMessage();
                String title = InputHandler.getInput();
                try {
                    books.deleteBook(title);
                } catch (BookException e) {
                    OutputHandler.printErrorMessage(e.getMessage());
                }
            } else if (selected == 4) {
                break;
            }else {
                OutputHandler.printErrorMessage("잘못된 입력입니다.");
            }
        }
    }
}
