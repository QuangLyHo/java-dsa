package com.quang;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClockTest {
    
    @Test
    void testClockInitialization() {
        // 1. Arrange: Set up the object
        Clock clock = new Clock(8, 30, 45);

        // 2. Act and Assert: Verify the values are set correctly
        assertEquals(8, clock.getHours(), "Hours should be initialized to 8");
        assertEquals(30, clock.getMinutes(), "Minutes should be initialized to 30");
        assertEquals(45, clock.getSeconds(), "Seconds should be initialized to 45");
    }

    @Test
    void testTimeStringFormatting() {
        // Arrange: Create a clock with single-digit values to test 
        Clock clock = new Clock(5,9,2);

        String actualTime = clock.getTimeString();

        assertEquals("05:09:02", actualTime, "Time string should format with leading zeros");
    }

}
