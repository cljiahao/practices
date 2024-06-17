package org.meicode;

public class Heart {

    private String name;
    private String condition;
    private int heartRate;

    public Heart(String name, String condition, int heartRate) {
        this.name = name;
        this.condition = condition;
        this.heartRate = heartRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
}
