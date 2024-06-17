package org.meicode;

public class LeftEye {

    private String name;
    private String condition;
    private String color;

    public LeftEye(String name, String condition, String color) {
        this.name = name;
        this.condition = condition;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
