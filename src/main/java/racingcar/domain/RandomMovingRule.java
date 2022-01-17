package racingcar.domain;

import java.util.Random;

public class RandomMovingRule implements MovingRule {

    @Override
    public boolean canMove() {
        return new Random().nextInt(10) > 4;
    }
}
