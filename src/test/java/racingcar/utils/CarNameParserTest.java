package racingcar.utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;
import racingcar.domain.CarName;

class CarNameParserTest {

    @Test
    void parseCarNames_쉼표를_기준으로_차_이름을_분리해서_CarName_배열로_반환해야_한다() {
        //given
        String carNamesString = "name1,name2,name3";
        CarName[] expectedCarNames = {new CarName("name1"), new CarName("name2"),
                new CarName("name3")};

        //when
        CarName[] carNames = CarNameParser.parseCarNames(carNamesString);

        //then
        assertThat(carNames).isEqualTo(expectedCarNames);
    }

    @Test
    void parseCarNames_차_이름이_하나일_때는_크기가_1인_CarName_배열을_반환해야_한다() {
        //given
        String carNamesString = "name";
        CarName[] expectedCarNames = {new CarName("name")};

        //when
        CarName[] carNames = CarNameParser.parseCarNames(carNamesString);

        //then
        assertThat(carNames).isEqualTo(expectedCarNames);
    }

    @Test
    void parseCarNames_5자를_넘는_차_이름이_들어오면_Exception을_반환한다() {
        //given
        String carNamesString = "name1,name2,namesesas";

        //when
        assertThatIllegalArgumentException().isThrownBy(
                () -> CarNameParser.parseCarNames(carNamesString))
                .withMessage("자동차의 이름은 5자를 초과할 수 없습니다.");
    }
}