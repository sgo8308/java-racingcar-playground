package racingcar.domain;

import java.util.List;

public class RacingService {

    Cars cars;
    Round round;
    MovingRule rule;

    public RacingService(String carNames, int totalRound,
            MovingRule movingRule) {
        readyCars(carNames);
        setRound(totalRound);
        rule = movingRule;
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
        cars.move(rule);
    }

    public List<CarDTO> getCarsDTO() {
        return cars.getCarDTOs();
    }

    public WinnersDTO getWinnersDTO() {
        return null;
    }
}
