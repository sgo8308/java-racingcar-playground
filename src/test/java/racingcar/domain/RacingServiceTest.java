package racingcar.domain;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RacingServiceTest {

    @Test
    void race_전체_차가_움직여야_한다() {
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
}