package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CarServiceTest {

    @Test
    void createCars() {
        //given
        String carName = "jiwoo,seungho";
        List<CarName> carNames = CarNameParser.parseCarNames(carName);

        //when
        Cars cars = CarService.createCars(carNames);

        Car jiwoo = new Car(carNames.get(0), new CarPosition(0));
        Car seungho = new Car(carNames.get(1), new CarPosition(0));
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(jiwoo);
        carList.add(seungho);

        Cars expectedCars = new Cars(carList);

        //then
        Assertions.assertThat(cars).isEqualTo(expectedCars);
    }

}