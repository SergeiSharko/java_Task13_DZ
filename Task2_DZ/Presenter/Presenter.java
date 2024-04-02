package Task2_DZ.Presenter;

import Task2_DZ.Data.*;
import Task2_DZ.Logging.*;
import Task2_DZ.View.*;

public class Presenter {
    private View view;
    private Model model;
    private OperationFactory operation;

    public Presenter(OperationFactory operation) {
        this.operation = operation;
        view = new View();            
    }

    public void startCalculate() {
        FileLogger fileLogger = new FileLogger();
        model = null;
        String oper = "";       
        double a = view.getValue("Первое число -> ");
        double b = view.getValue("Второе число -> ");        
        while (model == null) {            
            oper = view.getOperation("Операция -> ");
            model = operation.createModel(oper);
        } 
        model.setX(a);
        model.setY(b);
        double result = model.result();
        String logStr = fileLogger.getLogString(a, b, result, oper);
        fileLogger.writeToFile(logStr, "Task2_DZ/Logging/log.txt");
        view.print(result, "Результат -> ");        
    }
}
