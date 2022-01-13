package racingcar.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.CarName;
import racingcar.domain.CarPosition;
import racingcar.domain.Cars;
import racingcar.view.InputView;

class CarServiceTest {

    @Test
    void createCars_입력받은_이름의_자동차들이_들어있는_Cars를_반환해야_한다() {
        //given
        InputView inputView = new InputView(new Scanner(System.in));
        CarService carService = new CarService();
        CarName name1 = new CarName("name1");
        CarName name2 = new CarName("name2");
        CarName name3 = new CarName("name3");
        CarName[] carNames = {name1, name2, name3};

        //when
        Cars actualCars = carService.createCars(carNames);

        Car car1 = new Car(name1, CarPosition.fromStartPosition());
        Car car2 = new Car(name2, CarPosition.fromStartPosition());
        Car car3 = new Car(name3, CarPosition.fromStartPosition());
        Cars expectedCars = new Cars(Arrays.asList(car1, car2, car3));

        //then
        assertThat(actualCars).isEqualTo(expectedCars);
    }
}