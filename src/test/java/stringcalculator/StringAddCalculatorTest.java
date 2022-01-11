package stringcalculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringAddCalculatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"1,3", "1:3", "1,0:3"})
    void splitAndSum_��ǥ_�Ǵ�_�ݷ�_�����ڸ�_��������_�и���_��_������_����_��ȯ(String input) {
        int result = StringAddCalculator.splitAndSum(input);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void splitAndSum_null�̳�_���ڿ���_0��_��ȯ() {
        int resultBlank = StringAddCalculator.splitAndSum("");
        int resultNull = StringAddCalculator.splitAndSum(null);
        assertThat(resultBlank).isZero();
        assertThat(resultNull).isZero();
    }

    @Test
    void splitAndSum_Ŀ����_�����ڸ�_����_��_Ŀ����_�����ڸ�_��������_�и���_��_������_����_��ȯ() {
        int result = StringAddCalculator.splitAndSum("//;\n1;2;3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void splitAndSum_Ŀ����_������_�Ϲ�_������_����_����_��() {
        int result = StringAddCalculator.splitAndSum("//;\n1;2:3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void splitAndSum_�����ϳ�() {
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