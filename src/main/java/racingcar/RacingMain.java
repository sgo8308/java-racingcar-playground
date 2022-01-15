package racingcar;

import racingcar.domain.RacingService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingMain {

    public static void main(String[] args) {
        String carNames = InputView.getCarNames();
        String totalRound = InputView.getTotalRound();
        RacingService racingService = new RacingService(carNames, totalRound);
        while (!racingService.isEnd()) {
            racingService.race();
            OutputView.printCarNamesAndPosition(racingService.getCarsDTO());
        }
        OutputView.printWinners(racingService.getWinnersDTO());
    }
}