package racingcar.service;

import java.util.Arrays;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.CarName;
import racingcar.domain.CarPosition;
import racingcar.domain.Cars;
import racingcar.domain.MovePoint;
import racingcar.domain.Round;

class RacingServiceTest {

    @Test
    void race_주어진_라운드만큼_레이싱을_해야_한다() {
        //given
        Car car = new Car(new CarName("name"), CarPosition.fromStartPosition()) {
            @Override
            public void moveIfpossilble(MovePoint movePoint) {
                super.moveIfpossilble(MovePoint.from(5)); // 무조건 앞으로 이동하게
            }
        };

        Cars cars = new Cars(Arrays.asList(car));
        RacingService racingService = new RacingService(cars, new Round(3));

        //when
        racingService.race();
        Car expectedCar = new Car(new CarName("name"), CarPosition.fromCustomPosition(3));
        boolean isSamePosition = car.isSamePositionAs(expectedCar);

        //then
        Assertions.assertThat(isSamePosition).isTrue();
    }
}