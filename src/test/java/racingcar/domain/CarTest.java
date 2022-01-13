package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CarTest {

    private Car car;
    private CarPosition actualCarPosition;

    private static Stream<Arguments> provideMovePointAndExpectedPosition() {
        return Stream.of(
                Arguments.of(5, CarPosition.fromCustomPosition(1)),
                Arguments.of(9, CarPosition.fromCustomPosition(1)),
                Arguments.of(3, CarPosition.fromStartPosition()),
                Arguments.of(0, CarPosition.fromStartPosition())
        );
    }

    @ParameterizedTest
    @MethodSource("provideMovePointAndExpectedPosition")
    void moveIfPossible_������_��_����_����_�����δ�(int number, CarPosition expectedPosition) {
        //given
        actualCarPosition = CarPosition.fromStartPosition();
        car = new Car(new CarName("name"), actualCarPosition);

        MovePoint movePoint = MovePoint.from(number);

        //when
        car.moveIfpossilble(movePoint);

        //then
        assertThat(actualCarPosition).isEqualTo(expectedPosition);
    }

    @Test
    void equals_�̸���_��������_������_����() {
        //given
        Car car1 = new Car(new CarName("name"), CarPosition.fromStartPosition());
        Car car2 = new Car(new CarName("name"), CarPosition.fromStartPosition());

        //when
        boolean isSame = car1.equals(car2);

        //then
        assertThat(isSame).isTrue();
    }

    @Test
    void equals_CarPosition��_����_�����_����_�޶�_�̸���_��ġ��_������_����() {
        //given
        Car car1 = new Car(new CarName("name"), CarPosition.fromStartPosition());
        Car car2 = new Car(new CarName("name"), CarPosition.fromCustomPosition(3));

        //when
        car1.moveIfpossilble(MovePoint.from(5));
        car1.moveIfpossilble(MovePoint.from(5));
        car1.moveIfpossilble(MovePoint.from(5));

        boolean isSame = car1.equals(car2);

        //then
        assertThat(isSame).isTrue();
    }
}
