package spring;

public class ClassicalMusic implements Music {
    private ClassicalMusic () {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit() {
        System.out.println("Classical: Doing my initialisation");
    }

    public void doMyDestroy() {
        System.out.println("Classical: Doing my destroy");
    }
}
