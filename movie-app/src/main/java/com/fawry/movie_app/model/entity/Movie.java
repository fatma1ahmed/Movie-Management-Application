package com.fawry.movie_app.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title",nullable = false)
    private String title;
    @Column(name = "year", nullable = false)
    private String year;
    @Column(name = "plot", nullable = false)
    private String plot;
    @Column(name = "poster", nullable = false, columnDefinition = "MEDIUMBLOB")
    private String poster;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    @JsonManagedReference
    private List<MovieRate> movieRates;

    @Transient
    private double rate;

    public double getRate() {
        if (movieRates != null && !movieRates.isEmpty()) {
            double totalRate = movieRates.stream().mapToDouble(MovieRate::getRate).sum();
            int numberOfRates = movieRates.size();
            return totalRate / (double) numberOfRates;
        }
        return 0;
    }

}
