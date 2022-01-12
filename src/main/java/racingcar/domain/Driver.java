package racingcar.domain;

public class Driver {

    private Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public void drive(MovePoint movePoint) {
        if (movePoint.canMove()) {
            car.move();
        }
    }
}
