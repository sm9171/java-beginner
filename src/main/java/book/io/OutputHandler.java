package book.io;

import book.Books;

public class OutputHandler {
    private OutputHandler() {
    }

    public static void printStartMessage() {
        System.out.println("도서 프로그램을 시작합니다.");
    }

    public static void printSelectMessage() {
        System.out.println("실행하고 싶은 기능을 선택해주세요.");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 조회");
        System.out.println("3. 도서 삭제");
        System.out.println("4. 도서 프로그램 종료");
    }

    public static void printEndMessage() {
        System.out.println("도서 프로그램을 종료합니다.");
    }

    public static void printBookInfo(String title, String author, int price) {
        System.out.println("도서 정보");
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price);
    }

    public static void printTitleInputMessage() {
        System.out.println("도서 제목을 입력해주세요.");
    }

    public static void printAuthorInputMessage() {
        System.out.println("도서 저자를 입력해주세요.");
    }

    public static void printPriceInputMessage() {
        System.out.println("도서 가격을 입력해주세요.");
    }

    public static void printBooksInfo(final Books books) {
        System.out.println("도서 목록");
        books.getBooks()
                .forEach(book -> printBookInfo(book.getTitle(), book.getAuthor(), book.getPrice()));
    }

    public static void printErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }

    public static void printDeleteMessage() {
        System.out.println("삭제할 도서의 제목을 입력해주세요.");
    }
}
