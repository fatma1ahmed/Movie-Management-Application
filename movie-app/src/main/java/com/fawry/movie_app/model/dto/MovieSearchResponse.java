package com.fawry.movie_app.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieSearchResponse {
    @JsonProperty("Response")
    private String response;
    @JsonProperty("Search")
    private List<MovieResponse> movieResponseList;
}
