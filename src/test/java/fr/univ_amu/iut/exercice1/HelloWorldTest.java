package fr.univ_amu.iut.exercice1;

import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HelloWorldTest {

    @Ignore
    @Test
    public void test_hello_with_no_name_should_return_helloworld() {
        assertThat(HelloWorld.hello("")).isEqualTo("Hello, World!");
        assertThat(HelloWorld.hello(null)).isEqualTo("Hello, World!");
    }

    @Ignore
    @Test
    public void test_hello_with_empty_string_is_compared_by_value() {
        assertThat(HelloWorld.hello(new String())).isEqualTo("Hello, World!");
    }

    @Ignore
    @Test
    public void test_hello_should_return_hello_alice_when_alice() {
        assertThat(HelloWorld.hello("Alice")).isEqualTo("Hello, Alice!");
    }

    @Ignore
    @Test
    public void test_hello_should_return_hello_bob_when_bob() {
        assertThat(HelloWorld.hello("Bob")).isEqualTo("Hello, Bob!");
    }
}