package ru.job4j.list;

import org.junit.Ignore;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertMatrix2ListTest {
    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }

    @Test
    public void when4on2ArrayThenList10() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {1, 2, 3},
                {3, 3, 3},
                {4, 4, 4},
                {5}
        };
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 3, 3, 3, 4, 4, 4, 5
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
}
