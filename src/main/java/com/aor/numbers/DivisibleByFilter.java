package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{
    private int x;
    public DivisibleByFilter(int integer) {
        this.x = integer;
    }
    @Override
    public boolean accept(Integer number) {
        return (number % x) == 0;
    }

}
