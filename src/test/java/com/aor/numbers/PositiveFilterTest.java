package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PositiveFilterTest {
    private PositiveFilter filter;

    @BeforeEach
    private void helper() {
        filter = new PositiveFilter();
    }

    @Test
    public void accept_positive() {
        boolean result = filter.accept(1);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void reject_negative() {
        boolean result = filter.accept(-1);
        Assertions.assertEquals(false, result);
    }

}
