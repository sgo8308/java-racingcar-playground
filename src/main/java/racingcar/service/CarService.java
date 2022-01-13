package racingcar.service;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.CarName;
import racingcar.domain.CarPosition;
import racingcar.domain.Cars;

public class CarService {

    public Cars createCars(CarName[] carNames) {
        List<Car> carList = new ArrayList<>();
        for (CarName carName : carNames) {
            carList.add(new Car(carName, CarPosition.fromStartPosition()));
        }

        return new Cars(carList);
    }
}
