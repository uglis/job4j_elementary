package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2Then1() {
        int result = Max.max(6, 1);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax1To2ThenEquals() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void when4Numbers() {
        int result = Max.max(4, 10, 11, 14);
        assertThat(result, is(14));
    }

    @Test
    public void when3Numbers() {
        int result = Max.max(11, 11, 24);
        assertThat(result, is(24));
    }
}
