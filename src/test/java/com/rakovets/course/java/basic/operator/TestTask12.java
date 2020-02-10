package com.rakovets.course.java.basic.operator;

import com.rakovets.course.util.StandardOutputTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask12 extends StandardOutputTest {
    @Test
    void test1() {
        Task12.main(new String[]{"1"});
        assertEquals("0 0:0:1", getStandardOutputContent());
    }

    @Test
    void test2() {
        Task12.main(new String[]{"61"});
        assertEquals("0 0:1:1", getStandardOutputContent());
    }

    @Test
    void test3() {
        Task12.main(new String[]{"3661"});
        assertEquals("0 1:1:1", getStandardOutputContent());
    }

    @Test
    void test4() {
        Task12.main(new String[]{"86401"});
        assertEquals("1 0:0:1", getStandardOutputContent());
    }

    @Test
    void test5() {
        Task12.main(new String[]{"914701"});
        assertEquals("10 14:5:1", getStandardOutputContent());
    }
}
