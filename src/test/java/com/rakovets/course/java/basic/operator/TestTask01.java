package com.rakovets.course.java.basic.operator;

import com.rakovets.course.util.StandardOutputTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestTask01 extends StandardOutputTest {
    @Test
    void test1() {
        Task01.main(new String[]{"2", "2"});
        assertEquals("1", getStandardOutputContent());
    }

    @Test
    void test2() {
        Task01.main(new String[]{"9", "1"});
        assertEquals("9", getStandardOutputContent());
    }

    @Test
    void test3() {
        Task01.main(new String[]{"5", "2"});
        assertEquals("2", getStandardOutputContent());
    }

    @Test
    void test4() {
        Task01.main(new String[]{"20", "50"});
        assertEquals("0", getStandardOutputContent());
    }
}