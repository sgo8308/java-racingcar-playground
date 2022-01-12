package racingcar.domain;

import java.lang.reflect.Field;
import java.util.Random;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void move() {
        //given
        CarPosition carPosition = new CarPosition();
        Car car = new Car(new CarName("name"), carPosition);

        //when
        car.move();
        CarPosition expectedCarPosition = new CarPosition();
        expectedCarPosition.addPosition();

        //then
        Assertions.assertThat(carPosition).isEqualTo(expectedCarPosition);
    }
}
