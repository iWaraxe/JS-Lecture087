package com.coherentsolutions.section3;

import java.util.HashMap;
import java.util.Map;

public class GenericDAO<T> {
    private final Map<Integer, T> store = new HashMap<>();

    public void save(int id, T entity) {
        store.put(id, entity);
    }

    public T findById(int id) {
        return store.get(id);
    }

    public static void main(String[] args) {
        GenericDAO<User> userDao = new GenericDAO<>();
        userDao.save(1, new User("John Doe"));
        User user = userDao.findById(1);
        System.out.println("User: " + user.getName());
    }

    static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
