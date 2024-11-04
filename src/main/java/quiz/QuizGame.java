package quiz;

import quiz.io.OutputHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuizGame {
    private Quizzes quizzes;

    public void initialize() {
        List<Quiz> quizList = new ArrayList<>();
        quizList.add(Quiz.of("1 + 1 = ?", "2"));
        quizList.add(Quiz.of("2 + 2 = ?", "4"));
        quizList.add(Quiz.of("3 + 3 = ?", "6"));
        quizList.add(Quiz.of("4 + 4 = ?", "8"));
        quizList.add(Quiz.of("5 + 5 = ?", "10"));

        quizzes = Quizzes.createQuiz(quizList);
    }

    public void start() throws IOException {
        quizzes.startQuiz();
    }
}
