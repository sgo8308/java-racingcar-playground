package stringcalculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringAddCalculatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"1,3", "1:3", "1,0:3"})
    void splitAndSum_쉼표_또는_콜론_구분자를_기준으로_분리한_각_숫자의_합을_반환(String input) {
        int result = StringAddCalculator.splitAndSum(input);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void splitAndSum_null이나_빈문자열은_0을_반환() {
        int resultBlank = StringAddCalculator.splitAndSum("");
        int resultNull = StringAddCalculator.splitAndSum(null);
        assertThat(resultBlank).isZero();
        assertThat(resultNull).isZero();
    }

    @Test
    void splitAndSum_커스텀_구분자만_있을_때_커스텀_구분자를_기준으로_분리한_각_숫자의_합을_반환() {
        int result = StringAddCalculator.splitAndSum("//;\n1;2;3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void splitAndSum_커스텀_구분자_일반_구분자_같이_있을_때() {
        int result = StringAddCalculator.splitAndSum("//;\n1;2:3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void splitAndSum_숫자하나() {
        int result = StringAddCalculator.splitAndSum("5");
        assertThat(result).isEqualTo(5);
    }

    @Test
    void splitAndSum_negativeNumber_RuntimeException() {
        assertThatThrownBy(()->StringAddCalculator.splitAndSum("-1,2,3"))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void splitAndSum_negativeNumber_RuntimeException2() {
        assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(()->StringAddCalculator.splitAndSum("-1,2,3"));
    }
}