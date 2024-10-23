
import java.util.Scanner;

public class PlaylistManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();

        while (true) {
            System.out.println("\n--- Playlist Manager ---");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song by Title");
            System.out.println("3. Remove Song by Position");
            System.out.println("4. Display Playlist");
            System.out.println("5. Move Song");
            System.out.println("6. Reverse Playlist");
            System.out.println("7. Search for a Song");
            System.out.println("8. Save Playlist");
            System.out.println("9. Load Playlist");
            System.out.println("10. Shuffle Playlist");
            System.out.println("11. Sort by Title");
            System.out.println("12. Sort by Artist");
            System.out.println("13. Toggle Repeat Mode");
            System.out.println("14. Play in Repeat Mode");
            System.out.println("15. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist: ");
                    String artist = scanner.nextLine();
                    System.out.print("Enter duration (in minutes): ");
                    double duration = scanner.nextDouble();
                    playlist.addSong(new Song(title, artist, duration));
                    break;

                case 2:
                    System.out.print("Enter the title of the song to remove: ");
                    String titleToRemove = scanner.nextLine();
                    playlist.removeSongByTitle(titleToRemove);
                    break;

                case 3:
                    System.out.print("Enter the position of the song to remove: ");
                    int positionToRemove = scanner.nextInt();
                    playlist.removeSongByPosition(positionToRemove);
                    break;

                case 4:
                    playlist.displayPlaylist();
                    break;

                case 5:
                    System.out.print("Enter the current position of the song: ");
                    int oldPosition = scanner.nextInt();
                    System.out.print("Enter the new position: ");
                    int newPosition = scanner.nextInt();
                    playlist.moveSong(oldPosition, newPosition);
                    break;

                case 6:
                    playlist.reversePlaylist();
                    break;

                case 7:
                    System.out.print("Enter the title or artist to search: ");
                    String query = scanner.nextLine();
                    playlist.searchSong(query);
                    break;

                case 8:
                    System.out.print("Enter filename to save the playlist: ");
                    String saveFile = scanner.nextLine();
                    playlist.savePlaylist(saveFile);
                    break;

                case 9:
                    System.out.print("Enter filename to load the playlist: ");
                    String loadFile = scanner.nextLine();
                    playlist.loadPlaylist(loadFile);
                    break;

                case 10:
                    playlist.shufflePlaylist();
                    break;

                case 11:
                    playlist.sortByTitle();
                    break;

                case 12:
                    playlist.sortByArtist();
                    break;

                case 13:
                    playlist.toggleRepeatMode();
                    break;

                case 14:
                    playlist.playInRepeatMode();
                    break;

                case 15:
                    System.out.println("Exiting Playlist Manager.");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
