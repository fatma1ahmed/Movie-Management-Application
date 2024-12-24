package com.fawry.movie_app.repository;

import com.fawry.movie_app.model.entity.MovieRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRateRepo extends JpaRepository<MovieRate,Long> {
}
