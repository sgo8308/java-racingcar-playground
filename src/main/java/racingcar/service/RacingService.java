package racingcar.service;

import racingcar.domain.Cars;
import racingcar.domain.Round;
import racingcar.view.OutputView;

public class RacingService {

    Cars cars;
    Round round;

    public RacingService(Cars cars, Round round) {
        this.cars = cars;
        this.round = round;
    }

    public void race() {
        while (!round.isEnd()) {
            cars.moveAndPrintCarNameAndPosition();
            OutputView.printBlank();
            round.nextRound();
        }
    }
}
