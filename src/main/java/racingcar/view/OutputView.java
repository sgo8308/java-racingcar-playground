package racingcar.view;

public class OutputView {

    public void printCarNameAndPosition(String name, int position) {
        StringBuilder positionString = new StringBuilder();
        for (int i = 0; i < position; i++) {
            positionString.append("-");
        }
        System.out.println(name + " : " + positionString);
    }

    public void printWinCars(String winners) {
        System.out.println(winners + "가 최종 우승했습니다.");
    }
}
