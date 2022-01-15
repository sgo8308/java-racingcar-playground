package racingcar.domain;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CarNameParserTest {

    @Test
    void parseCarNames_��ǥ��_��������_�߶�_CarName��_��ȯ�Ѵ�() {
        //given
        String names = "jiwoo,hee,joo";

        //when
        List<CarName> carNames = CarNameParser.parseCarNames(names);

        //then
        Assertions.assertThat(carNames.get(0)).isEqualTo(new CarName("jiwoo"));
        Assertions.assertThat(carNames.get(1)).isEqualTo(new CarName("hee"));
        Assertions.assertThat(carNames.get(2)).isEqualTo(new CarName("joo"));
    }
}