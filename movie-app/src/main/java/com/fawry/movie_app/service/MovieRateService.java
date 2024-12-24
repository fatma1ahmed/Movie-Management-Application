package com.fawry.movie_app.service;

import org.springframework.stereotype.Service;

@Service
public interface MovieRateService {
    void rateMovie(Long movieId , double rate) throws Exception;
}
