package racingcar.view;

import java.util.Scanner;
import racingcar.domain.CarName;
import racingcar.utils.CarNameParser;

public class InputView {
    Scanner sc;

    public InputView(Scanner sc) {
        this.sc = sc;
    }

    public CarName[] inputCarNames() {
        return CarNameParser.parseCarNames(sc.nextLine());
    }
}


