package racingcar.service;

import racingcar.domain.Cars;

public class RacingService {

    private Cars cars;

    public RacingService(Cars cars) {
        this.cars = cars;
    }

    public void race(int count) {
        for (int i = 0; i < count; i++) {
            cars.move();
        }
    }
}
