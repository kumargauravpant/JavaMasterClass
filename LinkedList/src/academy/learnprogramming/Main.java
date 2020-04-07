package academy.learnprogramming;

import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static MusicPlayer musicPlayer = new MusicPlayer();
    private static Scanner scanner = new Scanner(System.in);
    private static ListIterator<Song> listIterator ;
    private static boolean isForward = true;

    public static void main(String[] args) {
        Song song1 = new Song("Bekhayali", 4.50);
        Song song2 = new Song("Tujhe kitna",5.00);
        Song song3 = new Song("Mere samne", 4.50);
        Song song4 = new Song("Jab bhi mai",5.00);
        Song song5 = new Song("Tujhe dekha to", 4.50);
        Song song6 = new Song("Dhadkan",5.00);
        Song song7 = new Song("Tum dil ki", 4.50);

        Album kabirSingh = new Album("Kabir Singh");
        kabirSingh.addSongs(song1);
        kabirSingh.addSongs(song2);
        musicPlayer.addAlbum(kabirSingh);

        Album retro = new Album("Retro");
        retro.addSongs(song3);
        retro.addSongs(song4);
        retro.addSongs(song5);
        musicPlayer.addAlbum(retro);

        Album dhadkan = new Album("Dhadkan");
        dhadkan.addSongs(song6);
        dhadkan.addSongs(song7);
        musicPlayer.addAlbum(dhadkan);

        musicPlayer.createPlayList("Retro", "Mere samne");
        musicPlayer.createPlayList("Retro", "Jab bhi mai");
        musicPlayer.createPlayList("Retro", "Tujhe dekha to");
        musicPlayer.createPlayList("Kabir Singh", "Bekhayali");
        musicPlayer.createPlayList("Kabir Singh", "Tujhe kitna");
        musicPlayer.createPlayList("Dhadkan", "Dhadkakn");
        musicPlayer.createPlayList("Dhadkan", "Tum Dil KI");

        boolean isTrue;

        System.out.println("Starting Music Player");
        System.out.println("Playlist : ");
        musicPlayer.listSongs();
        boolean quit = false;
        listIterator = musicPlayer.getPlayList().listIterator();
        printMessage();
        while (!quit) {
            System.out.println("Please select option: ");

            int action = scanner.nextInt();
            switch(action) {
                case 0:
                    printMessage();
                    break;
                case 1:
                    moveForward(listIterator);
                    break;
                case 2:
                    moveBackward(listIterator);
                    break;
                case 3:
                    repeatSong(listIterator);
                    break;
                case 4:
                    removeCurrentSong(listIterator);
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    public static void printMessage() {
        System.out.println("Select action :" +
                "\t0. Show action list\n" +
                "\t1. Forward\n" +
                "\t2. Backward\n" +
                "\t3. Repeat\n" +
                "\t4. Remove Current Song from the list\n" +
                "\t5. Power Off\n");
    }

    public static void moveForward(ListIterator<Song> listIterator) {

        if (!isForward) {
            isForward = true;
            listIterator.next();
        }
        if (listIterator.hasNext()) {
            System.out.println("Now Playing: " + listIterator.next().getTitle());
        } else {
            System.out.println("Already playing the last song.");
            repeatSong(listIterator);
        }
    }

    public static void moveBackward(ListIterator<Song> listIterator) {

        if (isForward) {
            isForward = false;
            listIterator.previous();
        }
        if (listIterator.hasPrevious()) {
            System.out.println("Now Playing: " + listIterator.previous().getTitle());
        } else {
            System.out.println("Already playing the first song.");
            repeatSong(listIterator);
        }
    }

    public static void repeatSong(ListIterator<Song> listIterator) {
        if (isForward) {
            System.out.println("Now Playing: " + listIterator.previous().getTitle());
            isForward = false;
        }
        else {
            System.out.println("Now Playing: " + listIterator.next().getTitle());
            isForward = true;
        }
    }

    public static void removeCurrentSong(ListIterator<Song> listIterator){
        listIterator.remove();
        System.out.println("Removed current song");
        if (listIterator.hasNext()) {
            listIterator.next();
        } else if (listIterator.hasPrevious()) {
            listIterator.previous();
        } else {
            System.out.println("Playlist is empty");
            return;
        }
    }
}
