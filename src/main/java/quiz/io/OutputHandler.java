package quiz.io;

public class OutputHandler {
    private OutputHandler() {
    }

    public static void printStart() {
        System.out.println("퀴즈 프로그램 시작");
    }

    public static void printEnd() {
        System.out.println("퀴즈 프로그램 종료");
    }

    public static void printQuestion(String question) {
        System.out.println(question);
    }

    public static void printScore(final int score, final int size) {
        System.out.println("당신의 점수는 " + score + " / " + size + "입니다.");
    }
}
