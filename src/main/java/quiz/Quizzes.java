package quiz;

import quiz.io.InputHandler;
import quiz.io.OutputHandler;

import java.io.IOException;
import java.util.List;

public class Quizzes {
    private final List<Quiz> quizs;
    private int score;

    private Quizzes(List<Quiz> quizs) {
        this.quizs = quizs;
        this.score = 0;
    }

    public static Quizzes createQuiz(final List<Quiz> quizList) {
        return new Quizzes(quizList);
    }

    public void startQuiz() throws IOException {
        OutputHandler.printStart();

        for (Quiz quiz : quizs) {
            OutputHandler.printQuestion(quiz.getQuestion());
            String answerInput = InputHandler.getAnswerInput();
            boolean collectAnswer = quiz.checkAnswer(answerInput);
            if (collectAnswer) {
                score++;
            }
        }

        OutputHandler.printScore(score, quizs.size());
        OutputHandler.printEnd();
    }
}
