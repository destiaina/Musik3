package com.example.musik.api.models;

public class Song {
    int album_id, duration, id, artist_id, position;
    String album_name,artist_idstr, artist_name, name, releasedate, license_ccurl, album_image, image, audio, audiodownload, prourl, shorturl, shareurl, wavefrom;

    public Song(int album_id, int duration, int id, int artist_id, int position, String album_name, String artist_idstr, String artist_name, String name, String releasedate, String license_ccurl, String album_image, String image, String audio, String audiodownload, String prourl, String shorturl, String shareurl, String wavefrom) {
        this.album_id = album_id;
        this.duration = duration;
        this.id = id;
        this.artist_id = artist_id;
        this.position = position;
        this.album_name = album_name;
        this.artist_idstr = artist_idstr;
        this.artist_name = artist_name;
        this.name = name;
        this.releasedate = releasedate;
        this.license_ccurl = license_ccurl;
        this.album_image = album_image;
        this.image = image;
        this.audio = audio;
        this.audiodownload = audiodownload;
        this.prourl = prourl;
        this.shorturl = shorturl;
        this.shareurl = shareurl;
        this.wavefrom = wavefrom;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getArtist_idstr() {
        return artist_idstr;
    }

    public void setArtist_idstr(String artist_idstr) {
        this.artist_idstr = artist_idstr;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public String getLicense_ccurl() {
        return license_ccurl;
    }

    public void setLicense_ccurl(String license_ccurl) {
        this.license_ccurl = license_ccurl;
    }

    public String getAlbum_image() {
        return album_image;
    }

    public void setAlbum_image(String album_image) {
        this.album_image = album_image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getAudiodownload() {
        return audiodownload;
    }

    public void setAudiodownload(String audiodownload) {
        this.audiodownload = audiodownload;
    }

    public String getProurl() {
        return prourl;
    }

    public void setProurl(String prourl) {
        this.prourl = prourl;
    }

    public String getShorturl() {
        return shorturl;
    }

    public void setShorturl(String shorturl) {
        this.shorturl = shorturl;
    }

    public String getShareurl() {
        return shareurl;
    }

    public void setShareurl(String shareurl) {
        this.shareurl = shareurl;
    }

    public String getWavefrom() {
        return wavefrom;
    }

    public void setWavefrom(String wavefrom) {
        this.wavefrom = wavefrom;
    }
}

