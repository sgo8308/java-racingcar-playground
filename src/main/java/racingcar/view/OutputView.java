package racingcar.view;

import java.util.List;
import racingcar.domain.CarDTO;
import racingcar.domain.WinnersDTO;

public class OutputView {

    public static void printCarNamesAndPosition(List<CarDTO> carDTOs) {
        String message = "";
        for (int i = 0; i < carDTOs.size(); i++) {
            CarDTO carDTO = carDTOs.get(i);
            message = carDTO.getName() + " : " + getPositionString(carDTO);
        }
        System.out.println(message);
    }

    private static String getPositionString(CarDTO carDTO) {
        String position = "";
        for (int j = 0; j < carDTO.getPosition(); j++) {
            position += "-";
        }
        return position;
    }

    public static void printWinners(WinnersDTO winnersDTO) {
        List<String> winners = winnersDTO.getWinnersNames();
        StringBuilder winnerNames = new StringBuilder();
        buildWinnerString(winners, winnerNames);
        System.out.println(winnerNames);
    }

    private static void buildWinnerString(List<String> winners, StringBuilder winnerNames) {
        for (int i = 0; i < winners.size(); i++) {
            winnerNames.append(winners.get(i));

            if (i == winners.size() - 1) {
                continue;
            }
            winnerNames.append(", ");
        }
    }
}
