package com.example.brokenStuff;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AWSVersionTest {
    @Test
    public void testLombokVersionIsCorrect() {
        Assertions.assertEquals("1.11.140", AWSVersion.getVersion());
    }
}
