package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Oleg");
        User user2 = new User("Anton");
        User user3 = new User("John");

        user1.sendMessage(user2, "Hello Anton");
        user1.sendMessage(user2, "Wassup!");

        user2.sendMessage(user1, "Fine" );
        user2.sendMessage(user1, "But i have a question");
        user2.sendMessage(user1, "Where is 3rd?");

        user3.sendMessage(user1, "I hate Anton" );
        user3.sendMessage(user1, "u know that?");
        user3.sendMessage(user1, "He is dumb");

        user1.sendMessage(user3, "Yes, he is dumb a little bit" );
        user1.sendMessage(user3, "but there is no reason to hate him");
        user1.sendMessage(user3, ":/");

        user3.sendMessage(user1, "copied understood");

        MessageDatabase.showDialog(user1, user3);
    }
}
