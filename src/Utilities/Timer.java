package Utilities;

public class Timer {
    long startTime;
    long endTime;

    public Timer(int hours, int mins, int seconds) {
        startTime = System.currentTimeMillis();
        endTime = startTime + seconds * 1000 + mins * 60 * 1000 + hours * 1000 * 60 * 60;
    }

    /**
     * @return seconds since timer created
     */
    public Time getTime() {
        return new Time(System.currentTimeMillis() - startTime);
    }

    /**
     * @return seconds until timer end
     */
    public Time getTimeLeft() {
        return new Time(endTime - System.currentTimeMillis());
    }

}
