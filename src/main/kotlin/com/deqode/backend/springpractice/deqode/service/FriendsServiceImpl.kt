package com.deqode.backend.springpractice.deqode.service

import com.deqode.backend.springpractice.deqode.dao.FriendsDAO
import com.deqode.backend.springpractice.deqode.model.Friends
import org.springframework.beans.factory.annotation.Autowired


class FriendsServiceImpl(@Autowired val friendsDao: FriendsDAO) : FriendsService {
//    //Dependency Injection of DAO class
//    @Autowired
//    private val friendsDao: FriendsDAO? = null

    //method to get list of all the friends
    override fun getAllFriends(): List<Friends?>? {
        return friendsDao?.getAllFriends()
    }

    //method to save or update your friend
    override fun saveorUpdate(friend: Friends): Friends? {
        return friendsDao?.saveorUpdate(friend)
    }

    //method to find friend by ID
    override fun findFriendById(id: Int): Friends? {
        return friendsDao?.findFriendById(id)
    }

    //method to delete friend by ID
    override fun deleteFriendship(id: Int) {
        friendsDao?.deleteFriendship(id)
    }
}