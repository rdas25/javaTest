import java.sql.Time;

public class ChapterEleven {
    
    // private variables can be accessed from within the ChapterEleven class, but not another class
    private int hour;
    private int minute;
    private double second;
    
    public int getHour() {
        return this.hour;
    }
    
    public int getMinute() {
        return this.minute;
    }
    
    public double getSecond() {
        return this.second;
    }

    ChapterEleven() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    ChapterEleven(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(int hour) {
        return this.hour;
    }
    
    public int getMinute(int minute) {
        return this.minute;
    }
    
    public double getSecond(double second) {
        return this.second;
    }

    public static void printTime(ChapterEleven t) {
        System.out.print(t.hour);
        System.out.print(":");
        System.out.print(t.minute);
        System.out.print(":");
        System.out.println(t.second);
    }

    public static void betterPrintTime(ChapterEleven t) {
        System.out.printf("%02d:%02d:%04.1f\n", t.hour, t.minute, t.second);
    }

    public String toString() { // overriding toString method, doesn't have to be static because it is called on an instance of the class
        return String.format("%02d:%02d:%04.1f\n", this.hour, this.minute, this.second);
    }

    public boolean equals(ChapterEleven that) {
        return this.hour == that.hour && this.minute == that.minute && this.second == that.second;
    }

    public static ChapterEleven add(ChapterEleven t1, ChapterEleven t2) { // static version
        ChapterEleven sum = new ChapterEleven();
        sum.hour = t1.hour + t2.hour;
        sum.minute = t1.minute + t2.minute;
        sum.second = t1.second + t2.second;

        if (sum.second >= 60.0) {
            sum.second -= 60.0;
            sum.minute += 1;
        }
        if (sum.minute >= 60) {
            sum.minute -= 60;
            sum.hour += 1;
        }
        if (sum.hour >= 24) {
            sum.hour -= 24;
        }

        return sum;
    }

    public ChapterEleven add(ChapterEleven t2) { // instance version
        ChapterEleven sum = new ChapterEleven();
        sum.hour = this.hour + t2.hour;
        sum.minute = this.minute + t2.minute;
        sum.second = this.second + t2.second;

        if (sum.second >= 60.0) {
            sum.second -= 60.0;
            sum.minute += 1;
        }
        if (sum.minute >= 60) {
            sum.minute -= 60;
            sum.hour += 1;
        }
        if (sum.hour >= 24) {
            sum.hour -= 24;
        }

        return sum;
    }

    public void increment(double seconds) {
        this.second += seconds;
        while (this.second >= 60.0) {
            this.second -= 60.0;
            this.minute += 1;
        }
        while (this.minute >= 60) {
            this.minute -= 60;
            this.hour += 1;
        }
    }

    public static void main(String[] args) {
        ChapterEleven timeOne = new ChapterEleven();

        ChapterEleven timeTwo = new ChapterEleven(11, 59, 59.9);
    
        ChapterEleven time = new ChapterEleven(11, 59, 59.9);
        System.out.print(time);

        printTime(time);
        betterPrintTime(time);

        String s = time.toString();
        System.out.print(s);
        System.out.print(time);

        ChapterEleven time1 = new ChapterEleven(9, 30, 0.0);
        ChapterEleven time2 = time1;
        ChapterEleven time3 = new ChapterEleven(9, 30, 0.0);

        // time1 == time2 is true because they reference the same object in memory
        // time1.equals(time3) is true because the values of the objects are the same, even though they are different objects in memory

        ChapterEleven startTime = new ChapterEleven(18, 50, 0.0);
        ChapterEleven runningTime = new ChapterEleven(2, 16, 0.0);

        ChapterEleven endTime = ChapterEleven.add(startTime, runningTime);
        System.out.print(endTime);
        endTime = startTime.add(runningTime);
        System.out.print(endTime);
    }

}