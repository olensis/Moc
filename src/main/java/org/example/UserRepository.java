package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private List<User> users = new ArrayList<>();


    public void addUser(User user){
        this.users.add(user);
    }

    public Collection<User> getAllUser(){
        return users;
    }

    public Optional<User> getUserByLogin(String login){
        return  users.stream().filter(user -> user.getLogin().equals(login)).findFirst();
    }

    public Optional<User> getUserByLoginAndPassword(String login , String password){
        return  users.stream().filter(user -> user.getLogin().equals(login)&&user.getPassword().equals(password)).findFirst();
    }
}

