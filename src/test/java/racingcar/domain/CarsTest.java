package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class CarsTest {

    @Test
    void findWinCars_가장_멀리_있는_자동차가_포함된_Cars를_반환해야_한다() {
        //given
        Car carAtPosition1 = new Car(new CarName("name1"), CarPosition.fromCustomPosition(1));
        Car carAtPosition3 = new Car(new CarName("name3"), CarPosition.fromCustomPosition(3));
        Car carAtPosition5 = new Car(new CarName("name5"), CarPosition.fromCustomPosition(5));

        Cars cars = new Cars(Arrays.asList(carAtPosition1, carAtPosition3, carAtPosition5));

        //when
        Cars winCars = cars.findWinCars();

        Cars expectedWinCars = new Cars(Arrays.asList(carAtPosition5));
        //then
        assertThat(winCars).isEqualTo(expectedWinCars);
    }

    @Test
    void findWinCars_가장_멀리_있는_자동차가_2개이상일땐_그차들을_모두_포함해서_Cars를_반환() {
        //given
        Car carAtPosition1 = new Car(new CarName("name1"), CarPosition.fromCustomPosition(1));
        Car carAtPosition3 = new Car(new CarName("name3"), CarPosition.fromCustomPosition(3));
        Car carAtPosition5_1 = new Car(new CarName("n5_1"), CarPosition.fromCustomPosition(5));
        Car carAtPosition5_2 = new Car(new CarName("n5_2"), CarPosition.fromCustomPosition(5));

        Cars cars = new Cars(
                Arrays.asList(carAtPosition1, carAtPosition3, carAtPosition5_1, carAtPosition5_2));

        //when
        Cars winCars = cars.findWinCars();

        Cars expectedWinCars = new Cars(Arrays.asList(carAtPosition5_1, carAtPosition5_2));
        Cars expectedWinCarsReverseOrder = new Cars(
                Arrays.asList(carAtPosition5_2, carAtPosition5_1));
        //then
        assertThat(winCars).isEqualTo(expectedWinCars).isEqualTo(expectedWinCarsReverseOrder);
    }

    @Test
    void equals_순서_상관_없이_동일한_차들을_포함하고_있으면_같다() {
        //given
        Car car1 = new Car(new CarName("name1"), CarPosition.fromStartPosition());
        Car car2 = new Car(new CarName("name2"), CarPosition.fromStartPosition());

        Cars actualCars = new Cars(Arrays.asList(car1, car2));

        Car carSameAsCar1 = new Car(new CarName("name1"), CarPosition.fromStartPosition());
        Car carSameAsCar2 = new Car(new CarName("name2"), CarPosition.fromStartPosition());

        Cars expectedCars = new Cars(Arrays.asList(carSameAsCar1, carSameAsCar2));
        Cars expectedCarsReverseOrder = new Cars(Arrays.asList(carSameAsCar2, carSameAsCar1));

        //when
        boolean isEqualWithExpectedCars = actualCars.equals(expectedCars);
        boolean isEqualWithExpectedCarsReversOrder = actualCars.equals(expectedCarsReverseOrder);

        //then
        assertThat(isEqualWithExpectedCars).isTrue();
        assertThat(isEqualWithExpectedCarsReversOrder).isTrue();
    }

    @Test
    void toString_담겨_있는_자동차가_여러개면_자동차_이름을_쉼표로_구분해서_반환() {
        //given
        Car car1 = new Car(new CarName("name1"), CarPosition.fromStartPosition());
        Car car2 = new Car(new CarName("name2"), CarPosition.fromStartPosition());

        Cars cars = new Cars(Arrays.asList(car1, car2));

        //when
        String actualString = cars.toString();
        String expectedString = "name1, name2";

        //then
        assertThat(actualString).hasToString(expectedString);
    }

    @Test
    void toString_담겨_있는_자동차가_하나면_자동차_이름을_반환() {
        //given
        Car car1 = new Car(new CarName("name1"), CarPosition.fromStartPosition());

        Cars cars = new Cars(Arrays.asList(car1));

        //when
        String actualString = cars.toString();
        String expectedString = "name1";

        //then
        assertThat(actualString).hasToString(expectedString);
    }
}
