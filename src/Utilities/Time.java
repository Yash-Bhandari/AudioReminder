package Utilities;

public class Time {
    private int hours;
    private int mins;
    private int secs;

    public Time(long ms){
        secs = (int)(ms / 1000);
        mins = secs / 60;
        secs = secs % 60;
        hours = mins /60;
        mins = mins % 60;
    }

    public Time(int hours, int mins, int secs) {
        this.hours = hours;
        this.mins = mins;
        this.secs = secs;
    }

    public boolean isPositive(){
        return secs >= 0;
    }

    public long toMS() {
        return 1000 * (secs + 60 * (mins + 60 * hours));
    }

    public void add(Time toAdd){
        secs += toAdd.getSecs();
        mins += secs / 60 + toAdd.getMins();
        secs = secs % 60;
        hours += mins / 60 + toAdd.getHours();
    }

    @Override
    public String toString(){
        String output = "";
        if (hours != 0) {
            output += hours + ":";
            if (mins < 10)
                output += "0";
        }
        if(mins > 0)
            output += mins + ":";
        if (secs < 10)
            output += "0";
        output += secs;

        return output;
    }

    public int getHours() {
        return hours;
    }

    public int getMins() {
        return mins;
    }

    public int getSecs() {
        return secs;
    }
}
