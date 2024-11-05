import book.BookApplication;
import calculator.Calculator;
import quiz.QuizGame;

import java.io.IOException;

public class application {
    public static void main(String[] args) throws IOException {
//        Calculator calculator = new Calculator();
//        calculator.start();

//        QuizGame quizGame = new QuizGame();
//        quizGame.initialize();
//        quizGame.start();

        BookApplication bookApplication = new BookApplication();
        bookApplication.initialize();
        bookApplication.start();
    }
}
