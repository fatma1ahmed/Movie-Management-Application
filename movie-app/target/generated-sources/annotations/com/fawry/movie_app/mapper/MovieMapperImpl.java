package com.fawry.movie_app.mapper;

import com.fawry.movie_app.model.dto.MovieRequest;
import com.fawry.movie_app.model.dto.MovieResponse;
import com.fawry.movie_app.model.entity.Movie;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-24T21:02:14+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class MovieMapperImpl implements MovieMapper {

    @Override
    public MovieResponse toResponse(Movie movie) {
        if ( movie == null ) {
            return null;
        }

        MovieResponse movieResponse = new MovieResponse();

        movieResponse.setId( movie.getId() );
        movieResponse.setTitle( movie.getTitle() );
        movieResponse.setYear( movie.getYear() );
        movieResponse.setPlot( movie.getPlot() );
        movieResponse.setPoster( movie.getPoster() );

        movieResponse.setResponse( "True" );
        movieResponse.setRate( movie.getRate() );

        return movieResponse;
    }

    @Override
    public Movie toEntity(MovieRequest movieRequest) {
        if ( movieRequest == null ) {
            return null;
        }

        Movie movie = new Movie();

        movie.setTitle( movieRequest.getTitle() );
        movie.setYear( movieRequest.getYear() );
        movie.setPlot( movieRequest.getPlot() );
        movie.setPoster( movieRequest.getPoster() );

        return movie;
    }
}
