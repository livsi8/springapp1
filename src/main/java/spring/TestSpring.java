package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("classicalMusicBean", Music.class);
//        Music music = context.getBean("rockMusicBean", Music.class);

        MusicPlayer musicPlayer1 = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayerBean", MusicPlayer.class);
        Boolean aBoolean = musicPlayer1 == musicPlayer2;
        System.out.println("musicPlayer1 == musicPlayer2 = " + aBoolean);
        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);

        musicPlayer1.setVolume(25);
        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getVolume());

//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
