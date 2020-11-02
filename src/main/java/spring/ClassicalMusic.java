package spring;

public class ClassicalMusic implements Music {
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
