package org.meicode;

public class Messages {

    private String name;
    private String messages;

    public Messages(String name, String messages) {
        this.name = name;
        this.messages = messages;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
