package com.rakovets.course.java.basic.operator;

import com.rakovets.course.util.StandardOutputTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask08 extends StandardOutputTest {
    @Test
    void test1() {
        Task08.main(new String[]{"256", "3"});
        assertEquals("13.581221810508403", getStandardOutputContent());
    }

    @Test
    void test2() {
        Task08.main(new String[]{"3", "1"});
        assertEquals("0.477464829275686", getStandardOutputContent());
    }

    @Test
    void test3() {
        Task08.main(new String[]{"-100", "5"});
        assertEquals("-3.183098861837907", getStandardOutputContent());
    }
}