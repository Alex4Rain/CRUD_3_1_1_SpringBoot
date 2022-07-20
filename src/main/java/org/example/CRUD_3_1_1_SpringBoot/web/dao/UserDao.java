package org.example.CRUD_3_1_1_SpringBoot.web.dao;

import org.example.CRUD_3_1_1_SpringBoot.web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void removeUser(User user);
    List<User> listUsers();
    void editUser(User user);
    User getUser(Long id);
}
