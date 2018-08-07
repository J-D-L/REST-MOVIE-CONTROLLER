package com.josh.movieservice.domain;

import java.util.Objects;

public class Rating {
    private String source;
    private double value;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rating)) return false;
        Rating rating = (Rating) o;
        return Double.compare(rating.getValue(), getValue()) == 0 &&
                Objects.equals(getSource(), rating.getSource());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getSource(), getValue());
    }
}
