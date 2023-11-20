package com.example.tp_rest.service;

import com.example.tp_rest.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> userList;
    public UserService(){
        userList=new ArrayList<>();
        User user1=new User(1,"Mohammed","Med@gmail.com");
        User user2=new User(2,"Moad","Moad@gmail.com");
        User user3=new User(3,"Sanaa","Sanaa@gmail.com");
        User user4=new User(4,"Ahlam","Ahlam@gmail.com");
    }
    public User getUser (int id){
        for (User usr :userList)
            if (id== usr.getId()){
                return usr;
            }
        return null;
    }

    public void setUser (int id, User user) {
        int i= 0;
        for (User usr: userList)
            if (id==usr.getId())
                userList.set(0,user);
    }

    public void suppUser( int id) {
        for (User usr : userList)
            if (id == usr.getId()) {
                userList.remove(usr);
            }
    }
        public List<User> getUsers() {
            return userList;
        }
    }

