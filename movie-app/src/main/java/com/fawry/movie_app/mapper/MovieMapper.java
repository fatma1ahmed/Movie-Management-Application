package com.fawry.movie_app.mapper;
import com.fawry.movie_app.model.dto.MovieRequest;
import com.fawry.movie_app.model.dto.MovieResponse;
import com.fawry.movie_app.model.entity.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MovieMapper {
    @Mapping(target = "response", constant = "True")
    @Mapping(target = "rate", expression = "java(movie.getRate())")
    MovieResponse toResponse(Movie movie);

    Movie toEntity(MovieRequest movieRequest);

}
