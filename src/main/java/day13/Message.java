package day13;

import java.util.Date;

class Message {
    private User sender, receiver;
    private String text;
    private Date date;

    Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "FROM: " + getSender() +
                "\nTO: " + getReceiver() +
                "\nON: " + getDate() +
                "\n" + getText();
    }
}
