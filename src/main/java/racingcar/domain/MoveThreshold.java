package racingcar.domain;

public class MoveThreshold {
    private static int threshold = 4;

    private MoveThreshold(){}

    public static boolean canMove(int movePoint) {
        return movePoint >= threshold;
    }
}
