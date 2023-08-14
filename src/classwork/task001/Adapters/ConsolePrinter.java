package classwork.task001.Adapters;

import classwork.task001.Domain.MovieReview;
import classwork.task001.Ports.IPrintMovieReviews;

import java.util.List;

public class ConsolePrinter implements IPrintMovieReviews {
    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });
    }
}
