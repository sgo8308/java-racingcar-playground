package racingcar.domain;

import java.util.Objects;

public class CarPosition implements Comparable<CarPosition> {

    int position;

    private CarPosition(int position) {
        this.position = position;
    }

    public static CarPosition fromStartPosition() {
        return new CarPosition(0);
    }

    public static CarPosition fromCustomPosition(int position) {
        return new CarPosition(position);
    }

    public void addPosition() {
        position++;
    }

    @Override
    public int compareTo(CarPosition o) {
        return Integer.compare(this.position, o.position);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CarPosition that = (CarPosition) o;
        return position == that.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
