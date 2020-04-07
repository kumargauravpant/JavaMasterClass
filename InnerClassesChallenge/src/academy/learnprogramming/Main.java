package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Song> playList = new ArrayList<Song>();
    private static boolean isForward = true;

    public static void main(String[] args) {
        Album kabirSingh = new Album("Kabir Singh");
        kabirSingh.addSong(new Song("Bekhayali", 4.50));
        kabirSingh.addSong(new Song("Tujhe kitna", 5.00));

        Album retro = new Album("Retro");
        retro.addSong(new Song("Mere samne", 4.50));
        retro.addSong(new Song("Jab bhi mai", 5.00));
        retro.addSong(new Song("Tujhe dekha to", 4.50));

        Album dhadkan = new Album("Dhadkan");
        dhadkan.addSong(new Song("Dhadkan", 5.00));
        dhadkan.addSong(new Song("Tum dil ki", 4.50));



        retro.createPlayList(playList, "Mere samne");
        retro.createPlayList(playList, "Jab bhi mai");
        retro.createPlayList(playList, "Tujhe dekha to");
        kabirSingh.createPlayList(playList, "Bekhayali");
        kabirSingh.createPlayList(playList, "Tujhe kitna");
        dhadkan.createPlayList(playList, "Dhadkakn");
        dhadkan.createPlayList(playList, "Tum Dil KI");

        boolean isTrue;

        System.out.println("Starting Music Player");
        System.out.println("Playlist : ");
        boolean quit = false;
        ListIterator<Song> listIterator = playList.listIterator();
        printMessage();
        while (!quit) {
            System.out.println("Please select option: ");

            int action = scanner.nextInt();
            switch (action) {
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
        } else {
            System.out.println("Now Playing: " + listIterator.next().getTitle());
            isForward = true;
        }
    }

    public static void removeCurrentSong(ListIterator<Song> listIterator) {
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
