package com.rplbo.musicplaylist;

import java.util.ArrayList;

public class Playlist {
    private String playlistName;

    private static ArrayList<Song> songs = new ArrayList<>();

    private int count;

    public Playlist(){

    }

    public String getPlaylistName() {
        return playlistName;
    }
    public static void print(){
        System.out.println("jumlah lagu = "+ songs.size()+" /kapasitas Playlist = 6");
        for(int i = 0; i < songs.size(); i++) {
            System.out.print("Listsong["+(i)+"] : "+songs.get(i).getName()+" - "+songs.get(i).getArtist()+"\n");
        }
    }

    public void setPlayListName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String totalTime(){
        for(int i = 0; i < songs.size(); i++) {
            this.count += songs.get(i).getLength();


        }
        String jadi = String.valueOf(count);
        System.out.print("Total Waktu "+getPlaylistName()+" = ");

        return jadi + " detik";
    }

    public void add(Song song){
        if(songs.size() >= 6) {
            System.out.println("Playlist Favorite penuh!. Tidak bisa menambahkan lagu lagi.");
        } else {
            songs.add(song);
        }


    }

    public Song remove(String song){
        System.out.println(song + " terhapus...."  );
        int index = songs.size() -1 ;
        songs.remove(index);
        return null;
    }

    public int size(){
        int hasil = songs.size();

        return hasil;
    }
}
