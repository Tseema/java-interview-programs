package com.example.demo;

import javax.security.auth.callback.TextInputCallback;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Song {

    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isInRepeatingPlaylist() {

        boolean isInRepeatingPlaylist = false;
        Set<Song> playlist = new HashSet<>();
        Song currentsong = this;
        Song nexton = this.nextSong;
        while(currentsong != null&& nexton != null){
            playlist.add(currentsong);


            if(playlist.contains(nexton.nextSong)){
                isInRepeatingPlaylist = true;
                return isInRepeatingPlaylist;
            }
            else
            {
                currentsong = nexton;
                nexton = nexton.nextSong;
            }

        }


        return isInRepeatingPlaylist;
        //playlist.contains(playlist.stream().forEach(song -> {song.nextSong.equals()});)
       /* Song firstSong = this;

        Song nexton = this.nextSong;

        while( nexton != null && nexton.nextSong != null){

            if(nexton.nextSong == firstSong){
                return true;
            }
            else
                nexton = nexton.nextSong;
        }

        return false;*/
            //throw new UnsupportedOperationException("Waiting to be implemented.");

        /* Song firstSong = this;

        Song nexton = this.nextSong;

        while( nexton != null && nexton.nextSong != null){

            if(nexton.nextSong == firstSong){
                return true;
            }
            else
                nexton = nexton.nextSong;
        }

     return false;
        * */
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");
        Song third = new Song("" + "tiger2");

        first.setNextSong(second);
        second.setNextSong(third);
        //third.setNextSong(first);

        System.out.println(first.isInRepeatingPlaylist());
    }
}
