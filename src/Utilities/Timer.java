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

    public static void main(String[] args) throws InterruptedException {
        Timer t = new Timer(0, 10);
        System.out.println(t.getTime());
        Thread.sleep(5000);
        System.out.println(t.getTime());
    }
}
