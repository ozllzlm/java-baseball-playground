package study;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class
StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {

        String ex = "1,2";
        String ex2 = "1";

        String[] exArray = ex.split(",");
        String[] exArray2 = ex2.split(",");

        assertThat(exArray).contains("1");
        assertThat(exArray).contains("2");
        assertThat(exArray).containsExactly("1", "2");
        assertThat(exArray2).containsExactly("1");
    }

    // shfit 두번 :  검색
    // 메소드가 시작하기전에 공통되는 함수 정의
    // alt + insert -> Tear Down 메서드
    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    // 메소드  끝날떄 공통 함수 정의
    // sout -> tab 누르면 자동완성
    @AfterEach
    void tearDown() {
        System.out.println();
    }

    @Test
    void 곱셈테스트() {
        int result = calculator.multi(2,3);
        assertThat(result).isEqualTo(6);
    }

    // alt + insert : 테스트 코드 작성
    // alt + enter : 메세드 만들기
    @Test
    void 덧셈테스트() {
        int result = calculator.plus(3,1);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void 뺄셈테스트() {
        int result = calculator.minus(3,1);
        assertThat(result).isEqualTo(2);
    }

}

