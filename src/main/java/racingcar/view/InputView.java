package racingcar.view;

import java.util.Scanner;

public class InputView {

    static Scanner scanner = new Scanner(System.in);

    public static String getCarNames() {
        return scanner.nextLine();
    }

    public static int getTotalRound() {
        return scanner.nextInt();
    }
}
