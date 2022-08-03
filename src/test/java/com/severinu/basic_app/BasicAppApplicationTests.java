package com.severinu.basic_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
class BasicAppApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void failedTest () {
        fail("This test should fail.");
    }

}
