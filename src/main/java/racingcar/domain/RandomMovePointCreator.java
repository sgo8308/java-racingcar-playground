package racingcar.domain;

import java.util.Random;

public class RandomMovePointCreator {

    private RandomMovePointCreator() {
    }

    public static MovePoint createMovePoint() {
        Random random = new Random();
        int randNum = random.nextInt(10);
        return MovePoint.from(randNum);
    }
}
