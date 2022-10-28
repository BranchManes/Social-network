package Socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<User> subscriptions; // В этом списке будут хранится те пользователи, на которых подписан пользователь.

    public User(String name) {
        this.name = name;
        this.subscriptions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        System.out.println("Вы подписались на пользователя " + user.getName());
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        System.out.println("Вы подписаны на пользователя" + user.getName());
        return this.subscriptions.contains(user);
    }

    public void isFriend(User user) {
        if( this.subscriptions.contains(user) && user.subscriptions.contains(this)){
            System.out.println("Вы друзья с пользователем " + user.getName());
        }
        else {
            System.out.println("Вы не являетесь друзьями с пользователем " + user.getName());
        }
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

}
