package com.valts.Cars.models.components.Motor;

public class InternalCombustionEngine extends Motor {
    public int hp;

    public InternalCombustionEngine(String motorName, boolean engineOn, int hp) {
        super(motorName, engineOn);
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "InternalCombustionEngine{" +
                "hp=" + hp +
                ", motorName='" + motorName + '\'' +
                ", engineOn=" + engineOn +
                '}';
    }
}

