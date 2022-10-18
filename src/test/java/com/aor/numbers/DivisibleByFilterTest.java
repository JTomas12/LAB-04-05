package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisibleByFilterTest {
    private DivisibleByFilter filter;

    @Test
    public void divisible_by_4() {
        DivisibleByFilter filter = new DivisibleByFilter(4);
        boolean result = filter.accept(10);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void divisible_by_5() {
        DivisibleByFilter filter = new DivisibleByFilter(5);
        boolean result = filter.accept(10);
        Assertions.assertEquals(true, result);
    }
}
