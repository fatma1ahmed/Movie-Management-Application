package com.fawry.movie_app.mapper;

import com.fawry.movie_app.model.dto.MovieResponse;
import com.fawry.movie_app.model.entity.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
@Mapper(componentModel = "spring")

public interface MovieSearchMapper {
    @Mapping(target = "response", constant = "True")
    @Mapping(target = "plot", constant = "N/A")
    @Mapping(target = "rate", expression = "java(movie.getRate())")
    List<MovieResponse> toResponses(List<Movie> movie);

    List<Movie> toEntities(List<MovieResponse> moviesResponse);
}
