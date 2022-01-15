package day13;

import java.util.ArrayList;
import java.util.List;

class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for(int i = 0; i < messages.size(); i++) {
            if(messages.get(i).getSender() == u1 & messages.get(i).getReceiver() == u2 ||
                    messages.get(i).getSender() == u2 & messages.get(i).getReceiver() == u1 )
                System.out.println(messages.get(i).getSender() + ": " + messages.get(i).getText());
        }
    }
}
