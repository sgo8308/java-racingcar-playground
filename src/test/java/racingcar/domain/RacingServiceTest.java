package racingcar.domain;

import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RacingServiceTest {

    @Test
    void race_��ü_����_��������_�Ѵ�() {
        //given
        Car jiwoo = new Car(new CarName("jiwoo"), new CarPosition(1));
        Car seungho = new Car(new CarName("soho"), new CarPosition(1));

        //when
        RacingService racingService = new RacingService("jiwoo,soho", 1, () -> true);
        racingService.race();
        List<CarDTO> carsDTOs = racingService.getCarsDTO();

        //then
        Assertions.assertThat(carsDTOs.get(0).getPosition())
                .isEqualTo(jiwoo.getCarDTO().getPosition());
        Assertions.assertThat(carsDTOs.get(1).getPosition())
                .isEqualTo(seungho.getCarDTO().getPosition());
    }

    @Test
    void getWinnersDTO_����ڵ���_�̸���_����ִ�_WinnersDTO��_��ȯ�Ѵ�() {
        //given
        Car jiwoo = new Car(new CarName("jiwoo"), new CarPosition(0));
        Car soho = new Car(new CarName("soho"), new CarPosition(1));
        Car shy = new Car(new CarName("shy"), new CarPosition(1));
        Cars cars = new Cars(Arrays.asList(jiwoo, soho, shy));

        //when
        RacingService racingService = new RacingService(cars, 1, () -> true);
        WinnersDTO winnersDTO = racingService.getWinnersDTO();
        WinnersDTO expected = new WinnersDTO(Arrays.asList("soho", "shy"));

        //then
        Assertions.assertThat(winnersDTO).isEqualTo(expected);
    }
}