package racingcar.domain;

public class Round {

    private int totalRound;
    private int nowRound = 0;

    public Round(int totalRound) {
        this.totalRound = totalRound;
    }

    public void nextRound() {
        nowRound++;
    }

    public boolean isEnd() {
        return this.totalRound == nowRound;
    }
}
