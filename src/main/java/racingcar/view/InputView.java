package racingcar.view;

import java.util.Scanner;

public class InputView {

    Scanner sc;

    public InputView(Scanner sc) {
        this.sc = sc;
    }

    public String inputCarNames() {
        return sc.nextLine();
    }

    public int inputRound() {
        return sc.nextInt();
    }
}


