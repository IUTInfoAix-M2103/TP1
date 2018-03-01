package fr.univ_amu.iut.exercice2;

import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FizzBuzzTest {
    private FizzBuzzer fizzBuzz = new FizzBuzzer();

    @Ignore
    @Test
    public void test_computeString_Should_Return_1_when_1() {
        String resultat = fizzBuzz.computeString(1);
        assertThat(resultat).isEqualTo("1");
    }

    @Ignore
    @Test
    public void test_computeString_Should_Return_2_when_2() {
        String resultat = fizzBuzz.computeString(2);
        assertThat(resultat).isEqualTo("2");
    }

    @Ignore
    @Test
    public void test_computeString_Should_Return_Fizz_when_3() {
        String resultat = fizzBuzz.computeString(3);
        assertThat(resultat).isEqualTo("Fizz");
    }

    @Ignore
    @Test
    public void test_computeString_Should_Return_Buzz_when_5() {
        String resultat = fizzBuzz.computeString(5);
        assertThat(resultat).isEqualTo("Buzz");
    }

    @Ignore
    @Test
    public void test_computeString_Should_Return_Fizz_when_6() {
        String resultat = fizzBuzz.computeString(6);
        assertThat(resultat).isEqualTo("Fizz");
    }

    @Ignore
    @Test
    public void test_computeString_Should_Return_Buzz_when_10() {
        String resultat = fizzBuzz.computeString(10);
        assertThat(resultat).isEqualTo("Buzz");
    }

    @Ignore
    @Test
    public void test_computeString_Should_Return_FizzBuzz_when_15() {
        String resultat = fizzBuzz.computeString(15);
        assertThat(resultat).isEqualTo("FizzBuzz");
    }

    @Ignore
    @Test
    public void test_computeList_Should_Return_a_sequence_of_5_elements_when_5() {
        String[] resultat = fizzBuzz.computeList(5);
        assertThat(resultat.length).isEqualTo(5);
    }

    @Ignore
    @Test
    public void test_computeList_Should_Return_a_sequence_of_5_FizzBuzz_elements_when_5() {
        String[] resultat = fizzBuzz.computeList(5);
        assertThat(resultat[0]).isEqualTo("1");
        assertThat(resultat[1]).isEqualTo("2");
        assertThat(resultat[2]).isEqualTo("Fizz");
        assertThat(resultat[3]).isEqualTo("4");
        assertThat(resultat[4]).isEqualTo("Buzz");
    }

    @Ignore
    @Test
    public void test_computeList_Should_Return_a_sequence_of_15_FizzBuzz_elements_when_15() {
        String[] resultat = fizzBuzz.computeList(15);
        int i = 0;
        for (String number : resultat) {
            assertThat(resultat[i]).isEqualTo(fizzBuzz.computeString(i + 1));
            i++;
        }
    }
}