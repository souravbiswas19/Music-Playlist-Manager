
public class Song {

    private String title;
    private String artist;
    private double duration; // duration in minutes

    // Constructor
    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    // toString method to print song details
    @Override
    public String toString() {
        return "Title: " + title + ", Artist: " + artist + ", Duration: " + duration + " minutes";
    }
}
