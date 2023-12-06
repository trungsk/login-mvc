package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
class AllApplicationTests {
    @Test
    void localTest(){

    }
    @Test
    void awYesSir(){
        int a = 3;
        int b = 5;
        int result = a + b;
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

}
