package Utilities;

public class Time {
    int hours;
    int mins;
    int secs;

    public Time(int ms){
        secs = ms / 1000;
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



    @Override
    public String toString(){
        String output = "";
        if (hours != 0) {
            output += hours + ":";
            if (mins < 10)
                output += "0";
        }
        output += 0 + ":";
        if (secs < 10)
            output += 0;
        output += secs;

        return output;
    }

}
