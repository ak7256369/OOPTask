package week3task2;

public class Music {
    String Title;
    String Duration;
    String Genre;
    Date releaseDate;
    Singer singer;

    Music(String title, String duration, String genre, Date releaseDate, Singer singer) {
        Title = title;
        Duration = duration;
        Genre = genre;
        this.releaseDate = releaseDate;
        this.singer = singer;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }
    public String toString() {
        return String.format("Title: %s%nDuration: %s%nGenre: %s%nRelease Date: %s%nSinger: %s",
                Title, Duration, Genre, releaseDate, singer);
    }

}
