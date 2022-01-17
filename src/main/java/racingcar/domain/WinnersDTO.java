package racingcar.domain;

import java.util.List;
import java.util.Objects;

public class WinnersDTO {

    List<String> winnersNames;

    public WinnersDTO(List<String> winnerNames) {
        this.winnersNames = winnerNames;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWinnersNames());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WinnersDTO that = (WinnersDTO) o;
        return Objects.equals(getWinnersNames(), that.getWinnersNames());
    }

    public List<String> getWinnersNames() {
        return winnersNames;
    }
}
