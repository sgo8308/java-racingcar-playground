package racingcar.view;

public class OutputView {

    private OutputView() {
    }

    public static void printMessageToGetCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void printMessageToGetRound() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void printCarNameAndPosition(String name, String position) {
        System.out.println(name + " : " + position);
    }

    public static void printWinCars(String winners) {
        System.out.println(winners + "가 최종 우승했습니다.");
    }

    public static void printBlank() {
        System.out.println();
    }
}
