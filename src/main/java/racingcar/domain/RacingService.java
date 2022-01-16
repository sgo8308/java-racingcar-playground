package racingcar.domain;

import java.util.List;

public class RacingService {

    Cars cars;
    Round round;

    public RacingService(String carNames, int totalRound) {
        readyCars(carNames);
        setRound(totalRound);
    }

    private void readyCars(String carNames) {
        List<CarName> carNameList = CarNameParser.parseCarNames(carNames);
        cars = CarService.createCars(carNameList);

    }

    private void setRound(int totalRound) {
        round = new Round(totalRound);
    }

    public boolean isEnd(int round) {
        return this.round.isEnd(round);
    }

    public void race() {

    }

    public List<CarDTO> getCarsDTO() {
        return null;
    }

    public WinnersDTO getWinnersDTO() {
        return null;
    }
}
