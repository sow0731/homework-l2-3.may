public class MovieInfo {
    private String title;
    private String filmDirector;
    private int releaseYear;
    private int rating;

    public MovieInfo(String title, String filmDirector, int releaseYear, int rating) {
        this.title = title;
        this.filmDirector = filmDirector;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getFilmDirector() {
        return filmDirector;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "[Movie Title : " + title + " / " + "Film Director : " + filmDirector + " / "
                + "Release Year : " + releaseYear + " / " + "Rating : " + rating + "]";
    }
}
