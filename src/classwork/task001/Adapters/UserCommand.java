package classwork.task001.Adapters;

import classwork.task001.Application.MovieApp;
import classwork.task001.Domain.Model;
import classwork.task001.Domain.MovieSearchRequest;
import classwork.task001.Ports.IFetchMovieReviews;
import classwork.task001.Ports.IPrintMovieReviews;
import classwork.task001.Ports.IUserInput;

public class UserCommand implements IUserInput {
    private Model model;

    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest)userCommand);
    }
}
