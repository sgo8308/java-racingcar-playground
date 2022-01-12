package racingcar.domain;

public class MovePoint {

    private int point;

    private MovePoint(int point) {
        this.point = point;
    }

    public static MovePoint from(int movePoint) {
        return new MovePoint(movePoint);
    }

    public boolean canMove() {
        return MoveThreshold.canMove(point);
    }
}
