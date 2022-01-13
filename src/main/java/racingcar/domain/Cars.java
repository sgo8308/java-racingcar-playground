package racingcar.domain;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Cars {

    List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars findWinCars() {
        Car winCar = findWinCar();
        return findCarsAtSamePosition(winCar);
    }

    private Car findWinCar() {
        Collections.sort(cars, Collections.reverseOrder());
        return cars.get(0);
    }

    private Cars findCarsAtSamePosition(Car winCar) {
        List<Car> winCars = cars.stream()
                .filter(winCar::isSamePositionAs)
                .collect(Collectors.toList());

        return new Cars(winCars);
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

        return hasSameCar(cars1) && isSameSize(cars1);
    }

    private boolean hasSameCar(Cars cars) {
        return this.cars.stream().allMatch(cars::contains);
    }

    private boolean isSameSize(Cars cars) {
        return this.size() == cars.size();
    }

    private boolean contains(Car car) {
        return cars.contains(car);
    }

    private int size() {
        return cars.size();
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < cars.size(); i++) {
            string.append(cars.get(i).toString());
            appendCommaIfNeeded(string, i);
        }
        return string.toString();
    }

    private void appendCommaIfNeeded(StringBuilder string, int order) {
        if (isLastCar(order)) {
            return;
        }
        string.append(", ");
    }

    private boolean isLastCar(int order) {
        return order == cars.size() - 1;
    }
}
