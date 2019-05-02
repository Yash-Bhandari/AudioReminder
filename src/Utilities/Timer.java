package Utilities;

public class Timer {
    long startTime;
    long endTime;

    public Timer(int mins, int seconds) {
        startTime = System.currentTimeMillis();
        endTime = startTime + seconds * 1000 + mins * 60 * 1000;
    }

    /**
     * @return seconds since timer created
     */
    public int getTime() {
        return (int)(System.currentTimeMillis() - startTime) / 1000;
    }

    /**
     * @return seconds until timer end
     */
    public int getTimeLeft() {
        return (int)(endTime - System.currentTimeMillis()) / 1000;
    }
}
