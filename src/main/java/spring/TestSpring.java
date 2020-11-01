package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("classicalMusicBean", Music.class);
//        Music music = context.getBean("rockMusicBean", Music.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayer.playMusic();
//        System.out.println("classicalMusicBean.getSong = " + music.getSong());
        context.close();
    }
}
