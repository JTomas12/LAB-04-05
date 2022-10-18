package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTester {
    @Test
    public void positive() {
        PositiveFilter positiveFilter = new PositiveFilter();
        ListFilterer listFilterer = new ListFilterer(positiveFilter);
        List<Integer> list = Arrays.asList(-1, 4, -4, 6, 8, 0);
        List<Integer> expected = Arrays.asList(4, 6, 8);
        Assertions.assertEquals(expected, listFilterer.filter(list));
    }
    @Test
    public void divisible() {
        DivisibleByFilter divisibleByFilter = new DivisibleByFilter(2);
        ListFilterer listFilterer = new ListFilterer(divisibleByFilter);
        List<Integer> list = Arrays.asList(-4, -8, 10, 13, 5, 40);
        List<Integer> expected = Arrays.asList(-4, -8, 10, 40);
        Assertions.assertEquals(expected, listFilterer.filter(list));
    }
    @Test
    public void tester() {
        GenericListFilter filter = new DivisibleByFilter(4);
        ListFilterer listFilterer = new ListFilterer(filter);
        List<Integer> list = Arrays.asList(-4, 10, 12, 25, -29, 40, 99);
        list = listFilterer.filter(list);
        filter = new PositiveFilter();
        listFilterer = new ListFilterer(filter);
        List<Integer> expected = Arrays.asList(12, 40);
        Assertions.assertEquals(expected, listFilterer.filter(list));
    }
}
