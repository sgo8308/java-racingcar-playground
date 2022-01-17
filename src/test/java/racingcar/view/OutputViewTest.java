package racingcar.view;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import racingcar.domain.CarDTO;

class OutputViewTest {

    @Test
    void printCarNamesAndPosition() {
        ArrayList<CarDTO> carDTOS = new ArrayList<>();
        carDTOS.add(new CarDTO("jiwoo", 3));
        carDTOS.add(new CarDTO("soho", 2));
        OutputView.printCarNamesAndPosition(carDTOS);
    }
}