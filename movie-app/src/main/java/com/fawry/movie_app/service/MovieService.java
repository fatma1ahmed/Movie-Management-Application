package com.fawry.movie_app.service;

import com.fawry.movie_app.model.dto.MovieRequest;
import com.fawry.movie_app.model.dto.MovieResponse;
import com.fawry.movie_app.model.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MovieService {

    public MovieResponse fetchMovieFromOMDb(String title);


    public List<MovieResponse> fetchMovieListFromOMDb( String title) ;

    public MovieResponse addMovie( MovieRequest movie) ;

    public MovieResponse updateMovie(MovieRequest movie,long id);
   public Movie getEntityMovieById(long id);

    public MovieResponse getMovieById( long id);
    public List<MovieResponse> getAllMovies() ;

    public void removeMovieById(long id) ;

    public void removeAllMovies() ;
    public List<MovieResponse> findMoviesByTitle( String title);


}
