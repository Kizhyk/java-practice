package com.rakovets.course.java.basic.operator;

import com.rakovets.course.util.StandardOutputTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask09 extends StandardOutputTest {
    @Test
    void test1() {
        Task09.main(new String[]{"2"});
        assertEquals("680.58", getStandardOutputContent());
    }

    @Test
    void test2() {
        Task09.main(new String[]{"0.1"});
        assertEquals("34.029003", getStandardOutputContent());
    }

    @Test
    void test3() {
        Task09.main(new String[]{"0"});
        assertEquals("0.0", getStandardOutputContent());
    }
}