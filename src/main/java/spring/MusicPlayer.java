package spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public MusicPlayer() {}

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Music aMusicList : musicList) {
            System.out.println("music.getSong() = " + aMusicList.getSong());
        }
    }

    public void doMyInit() {
        System.out.println("MusicPlayer: Doing my initialisation");
    }

    public void doMyDestroy() {
        System.out.println("MusicPlayer: Doing my destroy");
    }
}
