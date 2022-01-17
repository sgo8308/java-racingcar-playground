package racingcar.domain;

import java.util.Objects;

public class Car implements Comparable<Car> {

    private CarName name;
    private CarPosition position;

    public Car(CarName name, CarPosition position) {
        this.name = name;
        this.position = position;
    }

    public void move(MovingRule rule) {
        if (rule.canMove()) {
            position.addPosition();
        }
    }

    public CarDTO getCarDTO() {
        return new CarDTO(name.getName(), position.getPosition());
    }

    @Override
    public int compareTo(Car o) {
        return position.compareTo(o.position);
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
