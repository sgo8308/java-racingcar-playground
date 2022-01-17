package racingcar.domain;

import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CarsTest {

    @Test
    void move_규칙대로_모든_자동차들이_움직이는지() {
        //given
        List<CarName> carNames = CarNameParser.parseCarNames("jiwoo,soho");
        Cars cars = CarService.createCars(carNames);

        //when
        MovingRule movingRule = () -> true;
        cars.move(movingRule);

        Cars expectedCars = new Cars(Arrays.asList(
                new Car(carNames.get(0), new CarPosition(1)),
                new Car(carNames.get(1), new CarPosition(1))
        ));
        //then
        Assertions.assertThat(cars).isEqualTo(expectedCars);
    }
}