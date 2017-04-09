package com.kingbbode.controller;

import com.kingbbode.model.Friend;
import com.kingbbode.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by YG-MAC on 2017. 4. 9..
 */
@RestController
@RequestMapping("/friend")
public class RestFriendController {

    @Autowired
    private FriendRepository friendRepository;

    @GetMapping
    public List<Friend> friends(){
        return friendRepository.findAll();
    }
}
