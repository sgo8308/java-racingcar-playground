package racingcar.utils;

import java.util.Arrays;
import racingcar.domain.CarName;
import racingcar.domain.CarNames;

public class CarNameParser {

    private CarNameParser() {
    }

    public static CarNames parseCarNames(String carNamesString) {
        return new CarNames(Arrays.stream(carNamesString.split(","))
                .map(CarName::new)
                .toArray(CarName[]::new));
    }
}
