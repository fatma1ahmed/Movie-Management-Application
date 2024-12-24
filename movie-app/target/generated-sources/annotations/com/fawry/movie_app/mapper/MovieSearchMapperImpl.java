package com.fawry.movie_app.mapper;

import com.fawry.movie_app.model.dto.MovieResponse;
import com.fawry.movie_app.model.entity.Movie;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-24T21:02:14+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class MovieSearchMapperImpl implements MovieSearchMapper {

    @Override
    public List<MovieResponse> toResponses(List<Movie> movie) {
        if ( movie == null ) {
            return null;
        }

        List<MovieResponse> list = new ArrayList<MovieResponse>( movie.size() );
        for ( Movie movie1 : movie ) {
            list.add( movieToMovieResponse( movie1 ) );
        }

        return list;
    }

    @Override
    public List<Movie> toEntities(List<MovieResponse> moviesResponse) {
        if ( moviesResponse == null ) {
            return null;
        }

        List<Movie> list = new ArrayList<Movie>( moviesResponse.size() );
        for ( MovieResponse movieResponse : moviesResponse ) {
            list.add( movieResponseToMovie( movieResponse ) );
        }

        return list;
    }

    protected MovieResponse movieToMovieResponse(Movie movie) {
        if ( movie == null ) {
            return null;
        }

        MovieResponse movieResponse = new MovieResponse();

        movieResponse.setId( movie.getId() );
        movieResponse.setTitle( movie.getTitle() );
        movieResponse.setYear( movie.getYear() );
        movieResponse.setPlot( movie.getPlot() );
        movieResponse.setPoster( movie.getPoster() );
        movieResponse.setRate( movie.getRate() );

        return movieResponse;
    }

    protected Movie movieResponseToMovie(MovieResponse movieResponse) {
        if ( movieResponse == null ) {
            return null;
        }

        Movie movie = new Movie();

        movie.setId( movieResponse.getId() );
        movie.setTitle( movieResponse.getTitle() );
        movie.setYear( movieResponse.getYear() );
        movie.setPlot( movieResponse.getPlot() );
        movie.setPoster( movieResponse.getPoster() );
        movie.setRate( movieResponse.getRate() );

        return movie;
    }
}
