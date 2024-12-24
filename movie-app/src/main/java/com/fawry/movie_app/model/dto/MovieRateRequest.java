package com.fawry.movie_app.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieRateRequest {

    @JsonProperty("movie_id")
    @NotNull(message = "movie_id can not be null")
    public Long movieId;

    @JsonProperty("rate")
    @NotNull(message = "rate can not be null")
    @Min(0)
    @Max(5)
    public double rate;
}
