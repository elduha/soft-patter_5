package facade;

public class Checker {
    protected boolean turnOnPrint;

    public boolean isTurnOnPrint(){
        return turnOnPrint;
    }

    public void startPrint(){
        System.out.println("Print are active");
        turnOnPrint = true;
    }

    public void endPrint(){
        System.out.println("Print have finish");
        turnOnPrint = false;
    }
}
