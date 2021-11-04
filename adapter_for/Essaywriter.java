package adapter_for;

public class Essaywriter {
    public static void main(String[] args) {
        Essay essay = new Adapter();
        essay.intro();
        essay.bodypart();
        essay.conclusion();
    }
}
