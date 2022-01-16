package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RoundTest {

    @Test
    void isEnd() {
        Round round = new Round(3);
        boolean isEnd = round.isEnd(3);
        Assertions.assertThat(isEnd).isTrue();
    }
}