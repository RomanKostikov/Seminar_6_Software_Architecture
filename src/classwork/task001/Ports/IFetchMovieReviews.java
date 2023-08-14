package classwork.task001.Ports;

import classwork.task001.Domain.MovieReview;
import classwork.task001.Domain.MovieSearchRequest;

import java.util.List;

public interface IFetchMovieReviews {
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
