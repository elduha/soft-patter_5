package adapter_for;

public class Adapter extends OnlineEssay implements Essay{
    @Override
    public void intro() {
        writeIntro();
    }

    @Override
    public void bodypart() {
        writeBodyPart();
    }

    @Override
    public void conclusion() {
        writeConclusion();
    }
}
