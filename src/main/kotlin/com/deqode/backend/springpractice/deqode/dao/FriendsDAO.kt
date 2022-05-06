package com.deqode.backend.springpractice.deqode.dao

import com.deqode.backend.springpractice.deqode.model.Friends
import org.springframework.data.mongodb.repository.MongoRepository

interface FriendsDAO : MongoRepository<Friends, Int> {
    //method to create or update a friend
    fun saveorUpdate(friend: Friends?): Friends?

    //method to get list of all friends
    fun getAllFriends(): List<Friends?>?

    //method to find friend by ID
    fun findFriendById(id: Int): Friends?

    //method to delete friend by ID
    fun deleteFriendship(id: Int)
}