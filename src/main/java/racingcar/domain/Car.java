package racingcar.domain;

import java.util.Objects;

public class Car {

    private CarName name;
    private CarPosition position;

    public Car(CarName name, CarPosition position) {
        this.name = name;
        this.position = position;
    }

    public CarDTO getCarDTO() {
        return new CarDTO(name, position);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position,
                car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
