package racingcar.domain;

public class Round {

    private final int totalRound;

    public Round(int totalRound) {
        this.totalRound = totalRound;
    }

    public boolean isEnd(int round) {
        return round == totalRound;
    }
}
