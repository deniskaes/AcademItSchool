package Lesson7;


public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        if (from <= to) {
            this.from = from;
            this.to = to;
        } else {
            this.to = to;
            this.from = from;
        }
    }


    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getDistance() {
        return Math.abs(to - from);
    }

    public boolean isInside(double number) {
        return (number >= from && number <= to);

    }
}
