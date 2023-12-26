package org.d_merge_intervals.d_employee_free_time;

public class Interval {
    int start;
    int end;
    boolean closed;

    public Interval(int start, int end)
    {
        this.start = start;
        this.end = end;
        this.closed = true; // by default, the interval is closed
    }

    // set the flag for closed/open
    public void setClosed(boolean closed)
    {
        this.closed = closed;
    }
}
