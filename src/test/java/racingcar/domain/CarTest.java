package racingcar.domain;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
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
    void moveIfPossible_움직일_수_있을_때만_움직인다(int number, CarPosition expectedPosition) {
        //given
        actualCarPosition = CarPosition.fromStartPosition();
        car = new Car(new CarName("name"), actualCarPosition);

        MovePoint movePoint = MovePoint.from(number);

        //when
        car.moveIfpossilble(movePoint);

        //then
        Assertions.assertThat(actualCarPosition).isEqualTo(expectedPosition);
    }
}
