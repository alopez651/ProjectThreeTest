package com.revature.repositories;

import com.revature.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmailAndPassword(String email, String password);

//    @Query("SELECT FIRST_NAME, LAST_NAME FROM USERS WHERE FIRST_NAME LIKE %1% " +
//            "OR LAST_NAME LIKE %1% " +
//            "OR EMAIL LIKE %1?%")
//    public List<User> searchUser(String find);
//    @Query(value = "SELECT FIRST_NAME, LAST_NAME FROM USERS WHERE FIRST_NAME =?1 AND LAST_NAME =?1", nativeQuery = true)
//    public List<User> findByName(String firstName, String lastName);
////    public List<User> findByName(String firstName, String lastName);

}
