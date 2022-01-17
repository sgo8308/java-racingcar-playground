package racingcar.domain;

import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CarServiceTest {

    @Test
    void createCars() {
        //given
        String carName = "jiwoo,soho";
        List<CarName> carNames = CarNameParser.parseCarNames(carName);

        //when
        Cars cars = CarService.createCars(carNames);
        Cars expectedCars = new Cars(Arrays.asList(
                new Car(carNames.get(0), new CarPosition(0)),
                new Car(carNames.get(1), new CarPosition(0))
        ));

        //then
        Assertions.assertThat(cars).isEqualTo(expectedCars);
    }
}



