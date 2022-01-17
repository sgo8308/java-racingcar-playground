package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {

    List<Car> cars;

    public Cars(List<Car> carList) {
        this.cars = carList;
    }

    public void move(MovingRule rule) {
        for (Car car : cars) {
            car.move(rule);
        }
    }

    public List<CarDTO> getCarDTOs() {
        ArrayList<CarDTO> carDTOS = new ArrayList<>();
        for (Car car : cars) {
            carDTOS.add(car.getCarDTO());
        }
        return carDTOS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
