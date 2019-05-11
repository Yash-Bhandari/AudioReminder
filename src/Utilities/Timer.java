package Utilities;

public class Timer {
    long startTime;
    long endTime;
    long pauseTime;
    boolean paused;

    public Timer(int hours, int mins, int seconds) {
        startTime = System.currentTimeMillis();
        endTime = startTime + seconds * 1000 + mins * 60 * 1000 + hours * 1000 * 60 * 60;
        pauseTime = startTime;
        paused = false;
    }

    /**
     * @return seconds since timer created
     */
    public Time getTime() {
        if (!paused)
            return new Time(System.currentTimeMillis() - startTime);
        else
            return new Time(pauseTime - startTime);
    }

    /**
     * @return seconds until timer end
     */
    public Time getTimeLeft() {
        if (!paused)
            return new Time(endTime - System.currentTimeMillis());
        else
            return new Time(endTime - pauseTime);

    }

    public void addTime(Time toAdd) {
        System.out.println("added " + toAdd);
        endTime += toAdd.toMS();
    }

    public void pause() {
        if (!isPaused()) {
            pauseTime = System.currentTimeMillis();
            paused = true;
        }
    }

    public void resume() {
        if(isPaused()) {
            long timePaused = System.currentTimeMillis() - pauseTime;
            endTime += timePaused;
        }
        paused = false;
    }

    public void switchState() {
        if(isPaused())
            resume();
        else
            pause();
    }


    public boolean isPaused() {
        return paused;
    }
}
