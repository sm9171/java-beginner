package calculator.io;

public class OutputHandler {
    private OutputHandler() {
    }
    public static void printStart() {
        System.out.println("계산기 프로그램 시작");
        System.out.println("숫자 2개와 연산자를 입력해 주세요 ex) 1 + 2");
    }
    public static void printEnd() {
        System.out.println("계산기 프로그램 종료");
    }
    public static void printInvalidOperator() {
        System.out.println("잘못된 연산자입니다.");
    }
    public static void printResult(int result) {
        System.out.println("결과값은 : " + result + "입니다.");
    }
    public static void printDivideWithZero() {
        System.out.println("나누기 연산 시 0으로 나눌 수 없습니다.");
    }
}
