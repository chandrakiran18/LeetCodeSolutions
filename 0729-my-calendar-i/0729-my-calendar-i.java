class MyCalendar {
    private List<int[]> intervals;

    public MyCalendar() {
        intervals = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] cur : intervals) {
            int s = cur[0], e = cur[1];
            if (start < e && end > s) {
                return false;
            }
        }
        intervals.add(new int[]{start, end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */