package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class CarNameParser {

    public static List<CarName> parseCarNames(String carNames) {
        String[] carNamesArr = carNames.split(",");
        ArrayList<CarName> carNameList = new ArrayList<>();
        addCarNameToList(carNamesArr, carNameList);
        return carNameList;
    }

    private static void addCarNameToList(String[] carNamesArr, ArrayList<CarName> carNameList) {
        for (int i = 0; i < carNamesArr.length; i++) {
            CarName carName = new CarName(carNamesArr[i]);
            carNameList.add(carName);
        }
    }
}
