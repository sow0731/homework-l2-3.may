import java.util.List;

public class MovieList {
    public static List<MovieInfo> initMovieList() {
        return List.of(
                new MovieInfo("Dark Waters", "Todd Haynes", 2019, 2),
                new MovieInfo("Rocket Man", "Dexter Fletcher", 2019, 0),
                new MovieInfo("The Squid and the Whale", "Noah Baumbach", 2005, 1),
                new MovieInfo("Frances Ha", "Noah Baumbach", 2012, 2),
                new MovieInfo("Moonlight", "Barry Jenkins", 2016, 0),
                new MovieInfo("BlacKkKlansman", "Spike Lee", 2018, 2),
                new MovieInfo("The French Dispatch ", "Wes Anderson", 2020, 2)
        );

    }
}
