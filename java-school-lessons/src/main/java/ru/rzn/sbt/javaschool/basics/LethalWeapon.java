package ru.rzn.sbt.javaschool.basics;

import java.util.Objects;

public class LethalWeapon {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LethalWeapon that = (LethalWeapon) o;
        return roundsLeft == that.roundsLeft &&
                color.equals(that.color) &&
                power.equals(that.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, roundsLeft, power);
    }

    public String color;
    private int roundsLeft;
    private Double power;
    private static long nextSerial = 0;
    private final long serial = 2L;

    public void reload(int i) {
        for (i = 1; i > 0; i++) {
            roundsLeft = roundsLeft + i;
        }
    }

    public void pewPew() {
        roundsLeft = roundsLeft - 2;
    }

    public long getNextSerial() {
        if (nextSerial < serial) {
            nextSerial = serial;
        }
        nextSerial++;
        return nextSerial;
    }


    public long getSerial() {
        return serial;
    }

    public LethalWeapon() {
    }

    public LethalWeapon(String color, Double power, int roundsLeft) {
        this.color = color;
        this.roundsLeft = roundsLeft;
        this.power = power;
    }
}