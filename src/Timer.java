public class Timer {
    long startTime;
    long endTime;

    public Timer(int durationMS) {
        startTime = System.currentTimeMillis();
        endTime = startTime + durationMS;
    }
}
