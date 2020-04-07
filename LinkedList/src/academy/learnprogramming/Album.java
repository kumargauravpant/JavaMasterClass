package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Iterator;

public class Album {

    private String title;
    private ArrayList<Song> songs;

    public Album(String title) {
        this.title = title;
        this.songs = new ArrayList<Song>();
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSongs(Song song) {
        if (findSong(song.getTitle()) == null) {
            songs.add(song);
            return true;
        }

        return  false;
    }

    public Song findSong(String title) {
        Iterator<Song> songIterator = songs.iterator();
        while(songIterator.hasNext()) {
            Song nextSong = songIterator.next();
            if (nextSong.getTitle().equalsIgnoreCase(title)) {
                return nextSong;
            }
        }

        return null;
    }
}
