package stringcalculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    private StringAddCalculator() {
    }

    public static int splitAndSum(String input) {
        if (isNullOrBlank(input)) {
            return 0;
        }

        String customDelimiter = getCustomDelimiterIfPresent(input);
        String refinedInput = getRefinedInputIfNeed(input);

        return splitAndSum(customDelimiter, refinedInput);
    }

    private static String getCustomDelimiterIfPresent(String input) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(input);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    private static String getRefinedInputIfNeed(String input) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(input);
        if (matcher.find()) {
            return matcher.group(2);
        }
        return input;
    }

    private static int splitAndSum(String customDelimiter, String input) {
        return Arrays.stream(input.split("[" + customDelimiter + ",:]"))
                .mapToInt(Integer::parseInt)
                .map(StringAddCalculator::verifyPositive)
                .sum();
    }

    private static int verifyPositive(int number) {
        if (number < 0) {
            throw new RuntimeException();
        }
        return number;
    }

    private static boolean isNullOrBlank(String input) {
        return input == null || "".equals(input);
    }
}
