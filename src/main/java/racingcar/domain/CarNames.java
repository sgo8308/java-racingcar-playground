package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarNames {

    CarName[] carNames;

    public CarNames(CarName[] carNames) {
        this.carNames = carNames;
    }

    public Cars createCars() {
        List<Car> carList = new ArrayList<>();
        for (CarName carName : carNames) {
            carList.add(new Car(carName, CarPosition.fromStartPosition()));
        }

        return new Cars(carList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CarNames carNames1 = (CarNames) o;
        return Arrays.equals(carNames, carNames1.carNames);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(carNames);
    }
}
