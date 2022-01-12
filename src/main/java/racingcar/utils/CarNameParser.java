package racingcar.utils;

import java.util.Arrays;
import racingcar.domain.CarName;

public class CarNameParser {

    private CarNameParser() {
    }

    public static CarName[] parseCarNames(String carNamesString) {
        return Arrays.stream(carNamesString.split(","))
                .map(CarName::new)
                .toArray(CarName[]::new);
    }
}
