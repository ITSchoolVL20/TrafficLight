package com.company;

public class TalkingTrafficLight extends TrafficLight {
    @Override
    void onLamp(int idx) {
        super.onLamp(idx);
        System.out.printf("Lamp %d is on with color %s\n",
                idx, lamps[idx].color);
    }
}
