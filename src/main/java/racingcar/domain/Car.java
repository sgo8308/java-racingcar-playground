package racingcar.domain;

public class Car {
    private CarName name;
    private CarPosition position;

    public Car(CarName name, CarPosition position) {
        this.name = name;
        this.position = position;
    }

    public void move() {
        position.addPosition();
    }
}
