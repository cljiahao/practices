package org.meicode;

public class Contacts {

    private String names;
    private int phoneNum;

    public Contacts(String names, int phoneNum) {
        this.names = names;
        this.phoneNum = phoneNum;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
}
