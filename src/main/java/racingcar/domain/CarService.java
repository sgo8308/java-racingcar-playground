package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public static Cars createCars(List<CarName> carNameList) {
        List<Car> carList = new ArrayList<>();
        addCarToCarList(carNameList, carList);
        return new Cars(carList);
    }

    private static void addCarToCarList(List<CarName> carNameList, List<Car> carList) {
        for (int i = 0; i < carNameList.size(); i++) {
            carList.add(new Car(carNameList.get(i), new CarPosition(0)));
        }
    }
}
