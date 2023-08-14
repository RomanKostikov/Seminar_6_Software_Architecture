package classwork.task001.Ports;

import classwork.task001.Domain.MovieReview;

import java.util.List;

public interface IPrintMovieReviews {
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
