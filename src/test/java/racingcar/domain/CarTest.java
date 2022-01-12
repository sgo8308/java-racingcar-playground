package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void move() {
        //given
        CarPosition firstCarPosition = CarPosition.fromStartPosition();
        Car car = new Car(new CarName("name"), firstCarPosition);

        //when
        car.move();
        CarPosition expectedCarPosition = CarPosition.fromCustomPosition(1);

        //then
        Assertions.assertThat(firstCarPosition).isEqualTo(expectedCarPosition);
    }
}
