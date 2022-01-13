package racingcar.view;

import java.util.Scanner;

public class InputView {

    private static Scanner sc = new Scanner(System.in);

    private InputView() {
    }

    public static String inputCarNames() {
        return sc.nextLine();
    }

    public static int inputRound() {
        return sc.nextInt();
    }
}


