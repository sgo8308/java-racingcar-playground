package racingcar.domain;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DriverTest {

    private Driver driver;
    private Car car;
    private CarPosition firstCarPosition;

    @BeforeEach
    void setUp() {
        firstCarPosition = CarPosition.fromStartPosition();
        car = new Car(new CarName("name"), firstCarPosition);
        driver = new Driver(car);
    }

    @ParameterizedTest
    @MethodSource("provideMovePointAndExpectedPosition")
    void drive_차를_움직일_수_있을_때만_움직인다(int number, CarPosition expectedPosition) {
        //given
        MovePoint movePoint = MovePoint.from(number);

        //when
        driver.drive(movePoint);

        //then
        Assertions.assertThat(firstCarPosition).isEqualTo(expectedPosition);
    }

    private static Stream<Arguments> provideMovePointAndExpectedPosition() {
        return Stream.of(
                Arguments.of(5, CarPosition.fromCustomPosition(1)),
                Arguments.of(9, CarPosition.fromCustomPosition(1)),
                Arguments.of(3, CarPosition.fromStartPosition()),
                Arguments.of(0, CarPosition.fromStartPosition())
        );
    }
}
