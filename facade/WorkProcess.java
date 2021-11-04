package facade;

public class WorkProcess {
    Painter painter = new Painter();
    Print print = new Print();
    Checker checker = new Checker();

    public void PrintingPrint(){
        print.doPrint();
        checker.startPrint();
        painter.PrintUntillDate(checker);
    }
}
