package com.deqode.backend.springpractice.deqode.service

import com.deqode.backend.springpractice.deqode.model.Friends




interface FriendsService {
    //method to get list of all the friends
    fun getAllFriends(): List<Friends?>?

    //method to save or update your friend
    fun saveorUpdate(friend: Friends): Friends?

    //method to find friend by ID
    fun findFriendById(id: Int): Friends?

    //method to delete friend by ID
    fun deleteFriendship(id: Int)
}