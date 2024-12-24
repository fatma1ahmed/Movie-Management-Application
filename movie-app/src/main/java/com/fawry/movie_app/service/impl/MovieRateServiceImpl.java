package com.fawry.movie_app.service.impl;

import com.fawry.movie_app.model.entity.Movie;
import com.fawry.movie_app.model.entity.MovieRate;
import com.fawry.movie_app.repository.MovieRateRepo;
import com.fawry.movie_app.security.SecurityUtil.SecurityUtil;
import com.fawry.movie_app.service.MovieRateService;
import com.fawry.movie_app.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieRateServiceImpl implements MovieRateService {
    private final MovieRateRepo movieRateRepo;
    private final MovieService movieService;
    @Override
    public void rateMovie(Long movieId, double rate) throws Exception {
        Movie movie = movieService.getEntityMovieById(movieId);

        MovieRate newMovieRate = MovieRate.builder()
                .username(SecurityUtil.getCustomUserDetails().getUsername())
                .rate(rate)
                .movie(movie)
                .build();
        movieRateRepo.save(newMovieRate);
    }
}
