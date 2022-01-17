package racingcar.domain;

import java.util.Objects;

public class CarName {

    String name;

    public CarName(String s) {
        validation(s);
        this.name = s;
    }

    public void validation(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("�̸��� 5�ڸ� �ʰ��ϸ� �ȵ˴ϴ�.");
        }
    }

    public String getName() {
        return name;
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
