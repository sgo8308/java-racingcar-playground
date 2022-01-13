package racingcar.view;

public class OutputView {

    private OutputView() {
    }

    public static void printMessageToGetCarNames() {
        System.out.println("������ �ڵ��� �̸��� �Է��ϼ���(�̸��� ��ǥ(,)�� �������� ����).");
    }

    public static void printMessageToGetRound() {
        System.out.println("�õ��� ȸ���� ��ȸ�ΰ���?");
    }

    public static void printCarNameAndPosition(String name, String position) {
        System.out.println(name + " : " + position);
    }

    public static void printWinCars(String winners) {
        System.out.println(winners + "�� ���� ����߽��ϴ�.");
    }

    public static void printBlank() {
        System.out.println();
    }
}
