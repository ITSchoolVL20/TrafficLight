package com.company;

import java.awt.*;

class Lamp {
    Color color;
    boolean on;

    public Lamp(Color color) {
        this.color = color;
    }
}

public class TrafficLight {
    Lamp[] lamps = new Lamp[3];

    public TrafficLight() {
        lamps[0] = new Lamp(Color.RED);
        lamps[1] = new Lamp(Color.YELLOW);
        lamps[2] = new Lamp(Color.GREEN);
    }

    void run() {
        int curLamp = 2;
        onLamp(curLamp);

        while(true) {
            waitLamp();

            curLamp -= 1;
            if(curLamp < 0)
                curLamp = 2;

            onLamp(curLamp);
        }
    }

    void onLamp(int idx) {
        for (int i = 0; i < lamps.length; i++) {
            lamps[i].on = (i == idx);
        }
    }

    void waitLamp() {
        int millis = 3000;
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
