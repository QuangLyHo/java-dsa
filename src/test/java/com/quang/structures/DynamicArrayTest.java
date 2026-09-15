package com.quang.structures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DynamicArrayTest {

    private DynamicArray dynamicArray;

    @BeforeEach
    void setUp() {
        dynamicArray = new DynamicArray(3);
    }

    @Test
    void testInitialState() {
        assertTrue(dynamicArray.isEmpty(), "Array should be empty upon creation");
        assertEquals("[]", dynamicArray.toString(), "String layout should be emoty brackets");
    }

    @Test
    void testAddAndGrow() {
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        assertFalse(dynamicArray.isEmpty());
        assertEquals("[A, B, C]", dynamicArray.toString());

        dynamicArray.add("D");
        assertEquals("[A, B, C, D]", dynamicArray.toString(), "Array should dynamically expand and append 'D'");
    }
    
    @Test
    void testInsert() {
        dynamicArray.add("A");
        dynamicArray.add("C");

        dynamicArray.insert(1, "B");

        assertEquals("[A, B, C]", dynamicArray.toString(), "Elements should shift right to make room for 'B'");

    }

    @Test
    void testSearch() {
        dynamicArray.add("Apple");
        dynamicArray.add("Banana");
        dynamicArray.add("Cherry");

        assertEquals(1, dynamicArray.search("Banana"), "Should return index 1 for 'Banana'");
        assertEquals(-1, dynamicArray.search("Grape"), "Should return -1 if element does not exist");
    }

    @Test
    void testDeleteAndShrink() {
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");

        dynamicArray.delete("B");
        
        assertEquals("[A, C, D]", dynamicArray.toString(), "Elements should shift left after deletion");
        
        dynamicArray.delete("C");
        assertEquals("[A, D]", dynamicArray.toString(), "Array should preserve structure and shrink capacity cleanly");
        assertEquals(3, dynamicArray.capacity, "Capacity should equal 3");
    }
}
