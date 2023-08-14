package classwork.task001.Domain;

import classwork.task001.Application.MovieApp;

public class Model {
    private MovieApp movieApp;

    public Model(MovieApp movieApp) {
        this.movieApp = movieApp;
    }

    public void Run(MovieSearchRequest userCommand)
    {
        movieApp.accept(userCommand);
    }
}
