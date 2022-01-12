package racingcar.domain;

import java.util.Objects;

public class CarName {
    private String name;

    public CarName(String name) {
        validation(name);
        this.name = name;
    }

    private void validation(String name) throws IllegalArgumentException {
        if (name.length() > 5) {
            throw new IllegalArgumentException("�ڵ����� �̸��� 5�ڸ� �ʰ��� �� �����ϴ�.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CarName carName = (CarName) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
