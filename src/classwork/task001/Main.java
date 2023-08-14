package classwork.task001;

import classwork.task001.Adapters.ConsolePrinter;
import classwork.task001.Adapters.MovieReviewsRepo;
import classwork.task001.Adapters.UserCommand;
import classwork.task001.Application.MovieUser;
import classwork.task001.Domain.MovieSearchRequest;
import classwork.task001.Ports.IFetchMovieReviews;
import classwork.task001.Ports.IPrintMovieReviews;
import classwork.task001.Ports.IUserInput;

public class Main {
    public static void main(String[] args) throws Exception {

        IFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo();
        IPrintMovieReviews printMovieReviews = new ConsolePrinter();

        IUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReviews);

        MovieUser movieUser = new MovieUser(userCommand);

        MovieSearchRequest starWarsRequest = new MovieSearchRequest("StarWars");
        MovieSearchRequest starTreckRequest = new MovieSearchRequest("StarTreck");

        System.out.println("Displaying reviews for movie " + starTreckRequest.getMovieName());
        movieUser.processInput(starTreckRequest);

        System.out.println("Displaying reviews for movie " + starWarsRequest.getMovieName());
        movieUser.processInput(starWarsRequest);

    }
}
