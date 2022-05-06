package com.deqode.backend.springpractice.deqode.dao

import com.deqode.backend.springpractice.deqode.model.Friends
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate


class FriendsDAOMongoImpl (var mongoTemplate: MongoTemplate): FriendsDAO {
//    //DI for Mongo Template to access all methods of Mongo Repository
//    @Autowired
//    var mongoTemplate: MongoTemplate? = null

    //method to get list of all friends
    override fun saveorUpdate(friend: Friends?): Friends? {
        return mongoTemplate.save(friend)
    }

    //method to create or update a friend
    override fun getAllFriends(): List<Friends?>? {
        return mongoTemplate.findAll(Friends::class.java)
    }

    //method to delete friend by ID
    override fun deleteFriendship(id: Int) {
        val thefriend: Friends = mongoTemplate.findById(id, Friends::class.java)
        mongoTemplate.remove<Any>(thefriend)
    }

    //method to find friend by ID
    override fun findFriendById(id: Int): Friends? {
        return mongoTemplate.findById(id, Friends::class.java)
    }
}