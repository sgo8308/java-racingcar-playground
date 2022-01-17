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

    @Test
    void getWinnersDTO() {
        //given
        Car jiwoo = new Car(new CarName("jiwoo"), new CarPosition(5));
        Car soho = new Car(new CarName("soho"), new CarPosition(3));
        Car shy = new Car(new CarName("shy"), new CarPosition(5));

        Cars cars = new Cars(Arrays.asList(jiwoo, soho, shy));

        //when
        WinnersDTO winnersDTO = cars.getWinnersDTO();
        WinnersDTO expected = new WinnersDTO(Arrays.asList("jiwoo", "shy"));
        //then
        Assertions.assertThat(winnersDTO).isEqualTo(expected);
    }
}