package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void getMessageReturnsExpectedText() {
        assertEquals("Hello from Jenkins CI!", App.getMessage());
    }
}
