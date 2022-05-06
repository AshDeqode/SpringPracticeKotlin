package com.deqode.backend.springpractice.deqode.rest

import com.deqode.backend.springpractice.deqode.model.Friends
import com.deqode.backend.springpractice.deqode.service.FriendsServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/friends")
class FriendsRestController(@Autowired val friendsService: FriendsServiceImpl) {
//    //Dependency Injection of Service class
//    @Autowired
//    private val friendsService: FriendsServiceImpl? = null

    //controller method to get list of all the friends
    @GetMapping("/getall")
    fun getAllTheFriends(): List<Friends?>? {
        return friendsService?.getAllFriends()
    }

    //controller method to find your friend by ID
    @GetMapping("/findById/{id}")
    fun getFriendById(@PathVariable id: Int): Friends? {
        return friendsService?.findFriendById(id)
    }

    //controller method to create a new friend
    @PostMapping("/create")
    fun makeAFriend(@RequestBody theFriends: Friends): Friends? {
        return friendsService?.saveorUpdate(theFriends)
    }

    //controller method to update your friend
    @PutMapping("/update")
    fun updateAFriend(@RequestBody theFriends: Friends): Friends? {
        return friendsService?.saveorUpdate(theFriends)
    }

    //controller method to delete a friend by ID
    @DeleteMapping("/delete/{id}")
    fun deleteFriendship(@PathVariable id: Int): String {
        val theFriend = friendsService?.findFriendById(id)

        //checking if friend exist in DB or not
        return if (theFriend == null) {
            throw RuntimeException("Friend with id : $id does not exist")
        } else {
            friendsService?.deleteFriendship(id)
            ("Friendship deleted")
        }
    }
}