package racingcar.service;

import racingcar.domain.CarName;
import racingcar.utils.CarNameParser;
import racingcar.view.InputView;

public class CarNameService {

    private InputView inputView;

    public CarNameService(InputView inputView) {
        this.inputView = inputView;
    }

    public CarName[] enterCarNames() {
        String carNames = inputView.inputCarNames();
        return CarNameParser.parseCarNames(carNames);
    }
}
