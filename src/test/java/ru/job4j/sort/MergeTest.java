package ru.job4j.sort;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@Ignore
public class MergeTest {

    @Test
    public void whenBothEmpty() {
        Merge algo = new Merge();
        int[] expect = new int[0];
        int[] result = algo.merge(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscOrder() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = algo.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftGreat() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftEmpty() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[] {},
                new int[] {1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftAndRightIsEq() {
        Merge algo = new Merge();
        int[] expect = {2, 2, 2, 2, 2, 2, 2, 2};
        int[] result = algo.merge(
                new int[] {2, 2, 2, 2},
                new int[] {2, 2, 2, 2}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftHaveOneNum() {
        Merge algo = new Merge();
        int[] expect = {1, 1, 3, 6, 19, 19, 20};
        int[] result = algo.merge(
                new int[] {20},
                new int[] {1, 1, 3, 6, 19, 19}
        );
        assertThat(result, is(expect));
    }
}