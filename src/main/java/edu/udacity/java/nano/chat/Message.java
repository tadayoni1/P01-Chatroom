package edu.udacity.java.nano.chat;

/**
 * WebSocket message model
 */
public class Message {

    private String msg;
    private String type;
    private String username;
    private int onlineCount;

    public Message() {
    }

    public Message(String msg, String type, String username, int onlineCount) {
        this.msg = msg;
        this.type = type;
        this.username = username;
        this.onlineCount = onlineCount;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(int onlineCount) {
        this.onlineCount = onlineCount;
    }
}
