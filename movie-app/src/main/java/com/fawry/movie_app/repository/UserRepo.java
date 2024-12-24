package com.fawry.movie_app.repository;

import com.fawry.movie_app.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
   User findByUserName(String userName);
}
