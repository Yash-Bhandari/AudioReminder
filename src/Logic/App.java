package Logic;

import UI.Gui;
import Utilities.Timer;

public class App {

    public App(){
        Timer timer = new Timer(0, 0,0);
        timer.pause();
        Gui gui = new Gui(timer);
    }

    public static void main(String[] args) {
        new App();
    }
}
