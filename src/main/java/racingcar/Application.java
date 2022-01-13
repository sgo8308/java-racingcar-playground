package racingcar;

import racingcar.domain.CarNames;
import racingcar.domain.Cars;
import racingcar.domain.Round;
import racingcar.service.RacingService;
import racingcar.utils.CarNameParser;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {

    private static RacingService racingService;
    private static Cars cars;

    public static void main(String[] args) {
        run();
    }

    /**
     * 자동차를 만들고, 레이싱을 진행하고, 우승자를 발표한다.
     */
    private static void run() {
        setting();
        racingService.race();
        announceWinners();
    }

    private static void setting() {
        carsSetting();
        racingServiceSetting();
    }

    private static void carsSetting() {
        OutputView.printMessageToGetCarNames();
        CarNames carNames = CarNameParser.parseCarNames(InputView.inputCarNames());
        cars = carNames.createCars();
    }

    private static void racingServiceSetting() {
        OutputView.printMessageToGetRound();
        Round round = new Round(InputView.inputRound());
        racingService = new RacingService(cars, round);
    }

    private static void announceWinners() {
        Cars winCars = cars.findWinCars();
        OutputView.printWinCars(winCars.toString());
    }
}
