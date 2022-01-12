package racingcar.utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;
import racingcar.domain.CarName;

class CarNameParserTest {

    @Test
    void parseCarNames_��ǥ��_��������_��_�̸���_�и��ؼ�_CarName_�迭��_��ȯ�ؾ�_�Ѵ�() {
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
    void parseCarNames_��_�̸���_�ϳ���_����_ũ�Ⱑ_1��_CarName_�迭��_��ȯ�ؾ�_�Ѵ�() {
        //given
        String carNamesString = "name";
        CarName[] expectedCarNames = {new CarName("name")};

        //when
        CarName[] carNames = CarNameParser.parseCarNames(carNamesString);

        //then
        assertThat(carNames).isEqualTo(expectedCarNames);
    }

    @Test
    void parseCarNames_5�ڸ�_�Ѵ�_��_�̸���_������_Exception��_��ȯ�Ѵ�() {
        //given
        String carNamesString = "name1,name2,namesesas";

        //when
        assertThatIllegalArgumentException().isThrownBy(
                () -> CarNameParser.parseCarNames(carNamesString))
                .withMessage("�ڵ����� �̸��� 5�ڸ� �ʰ��� �� �����ϴ�.");
    }
}