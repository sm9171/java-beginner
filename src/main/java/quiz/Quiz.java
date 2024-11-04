package quiz;

public class Quiz {
    private final String question;
    private final String answer;

    private Quiz(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public static Quiz of(String question, String answer) {
        return new Quiz(question, answer);
    }

    public String getQuestion() {
        return question;
    }

    public boolean checkAnswer(final String answerInput) {
        return answer.equals(answerInput);
    }
}
