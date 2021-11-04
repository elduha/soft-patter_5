package facade;

public class Painter {
    public void PrintUntillDate(Checker checker){
        if(checker.isTurnOnPrint()){
            System.out.println("Printer print print");
        }else {
            System.out.println("Print not print");
        }
    }
}
