package classwork.task001.Domain;

public class MovieSearchRequest {
    String request;

    public MovieSearchRequest(String name) {
        this.request = name;
    }

    public String getMovieName() {
        return request;
    }
}
