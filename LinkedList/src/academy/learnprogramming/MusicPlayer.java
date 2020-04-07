package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MusicPlayer {

    private ArrayList<Album> albums;
    private LinkedList<Song> playList;
    private boolean isForward;
    ListIterator<Song> playListIterator;

    public MusicPlayer() {
        this.albums = new ArrayList<Album>();
        this.playList = new LinkedList<Song>();
        this.isForward = true;

    }

    public boolean addAlbum(Album album) {
        if ( findAlbum(album.getTitle()) != null) {
            return false;
        }
        this.albums.add(album);
        return true;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public LinkedList<Song> getPlayList() {
        return playList;
    }

    public boolean createPlayList(String albumName, String title) {
        Album album = findAlbum(albumName);
        if(album != null) {
            Song song = album.findSong(title);
            if (song != null) {
                playList.add(song);
                return true;
            } else {
                System.out.println("Song " + title + " does not exist in album " + album.getTitle());
                return false;
            }
        } else {
            System.out.println("album " + albumName + " is not found.");
        }

        return false;
    }

    private Album findAlbum(String name) {
        Iterator<Album> albumIterator = this.albums.iterator();
        while(albumIterator.hasNext()) {
            Album album = albumIterator.next();
            if (album.getTitle().equalsIgnoreCase(name)) {
                return album;
            }
        }

        return null;
    }

    public void listSongs() {
        Iterator<Song> currentList = playList.iterator();
        while (currentList.hasNext()) {
            System.out.println(currentList.next().getTitle());
        }
    }
}
