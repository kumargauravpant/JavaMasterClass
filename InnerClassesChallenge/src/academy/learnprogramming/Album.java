package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Album {
    private String title;
    private SongList songList;

    public Album(String title) {
        this.title = title;
        songList = new SongList();
    }

    public boolean createPlayList(List<Song> playList, String title) {
        Song songToAdd = this.songList.findSong(title);
        if (songToAdd != null) {
                playList.add(songToAdd);
                return true;
        }

        System.out.println("Song " + title + " is not available in this Album.");
        return false;
    }

    public boolean addSong(Song song) {
        return this.songList.addSong(song);
    }

    private class SongList {

        private List<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public List<Song> getSongs() {
            return songs;
        }

        private boolean addSong(Song song) {
            if (findSong(song) == null ) {
                this.songs.add(song);
                return true;
            }

            System.out.println("Song " + song.getTitle() +" is already added to the album");
            return false;
        }

        private Song findSong(String title) {
            Iterator<Song> songIterator = songs.iterator();
            while(songIterator.hasNext()) {
                Song nextSong = songIterator.next();
                if (nextSong.getTitle().equalsIgnoreCase(title)) {
                    return nextSong;
                }
            }

            return null;
        }

        private Song findSong(Song song) {
            if (songs.contains(song)) {
                return song;
            }
            return null;
        }
    }
}
