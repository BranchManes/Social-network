package Socialnetwork;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Ivan");
        User user2 = new User("Braen");
        User user3 = new User("Nikole");
        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как у тебя дела?");

        user2.sendMessage(user1, "Привет!, как поживаешь?");
        user2.sendMessage(user1, "У меня все отлично, вот написал программу:)");
        MessageDatabase.showDialog(user1, user2);
        user1.subscribe(user2);
        user1.isFriend(user2);

    }
}
