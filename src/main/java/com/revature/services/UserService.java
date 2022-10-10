package com.revature.services;

import com.revature.models.Post;
import com.revature.models.User;
import com.revature.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findByCredentials(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

//    public User getById(int id){
//        return userRepository.findById(id).get();
//    }
//    public List<Post> like(User users){
//        Post post = new Post();
//        String like1;
//        String like2;
//       // List <Post> likePost
//    }

}
