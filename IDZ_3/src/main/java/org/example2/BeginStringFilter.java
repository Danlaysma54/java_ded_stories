package org.example2;

public class BeginStringFilter implements filter {
    private final String pattern;

    public BeginStringFilter(String input) {
        this.pattern = input;
    }

    @Override
    public boolean apply(String input) {
        return input.startsWith(this.pattern);
    }

    @Override
    public int da(String input) {
        return input.lastIndexOf(this.pattern);
    }

    @Override
    public void smaller() {
        this.pattern.toLowerCase();
    }
}
