package com.revature.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.revature.models.Likes;
import com.revature.models.User;
import com.revature.repositories.UserRepository;
import org.springframework.stereotype.Service;

import com.revature.models.Post;
import com.revature.repositories.PostRepository;

@Service
public class PostService {

	private PostRepository postRepository;
	//private UserRepository userRepository;
	
	public PostService(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	public List<Post> getAll() {
		return this.postRepository.findAll();
	}

	public Post upsert(Post post) {
		return this.postRepository.save(post);
	}

//	public Post likePost(Likes likes){
//		Post post = new Post();
//		Optional<Post> optionalPost = postRepository.findById(likes.getL1());
//		Post targetPost = optionalPost.get();
//		List<String> postLike = targetPost.getLiked();
//		if(postLike == null){
//			postLike = new ArrayList<>();
//		}
//		if(!postLike.contains(likes.getL2())){
//			postLike.add(likes.getL2());
//		} else {
//			postLike.remove(likes.getL2());
//		} return post;
//	}

//	public Post addLike(int userId, int quantity){
//		User users = getById(userId);
//	}
}
