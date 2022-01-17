package racingcar;

import racingcar.domain.RacingService;
import racingcar.domain.RandomMovingRule;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingMain {

    public static void main(String[] args) {
        String carNames = InputView.getCarNames();
        int totalRound = InputView.getTotalRound();
        RacingService racingService = new RacingService(carNames, totalRound,
                new RandomMovingRule());

        int round = 0;
        while (!racingService.isEnd(round++)) {
            racingService.race();
            OutputView.printCarNamesAndPosition(racingService.getCarsDTO());
        }

        OutputView.printWinners(racingService.getWinnersDTO());
    }
}