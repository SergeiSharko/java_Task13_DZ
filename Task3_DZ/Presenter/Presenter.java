package Task3_DZ.Presenter;

import Task3_DZ.Data.*;
import Task3_DZ.Logging.*;
import Task3_DZ.View.*;

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
        double a = view.getValue("Введите действительную часть первого комплексного числа -> ");
        double b = view.getValue("Введите мнимую часть первого комплексного числа -> ");
        ComplexNumber cnA = new ComplexNumber(a, b);
        System.out.println("Первое комплексное число -> " + cnA.comlexNumtoString());
        a = view.getValue("Введите действительную часть второго комплексного числа -> ");
        b = view.getValue("Введите мнимую часть второго комплексного числа -> ");
        ComplexNumber cnB = new ComplexNumber(a, b);
        System.out.println("Второе комплексное число -> " + cnB.comlexNumtoString());
        while (model == null) {
            oper = view.getOperation("Операция -> ");
            model = operation.createModel(oper, cnA, cnB);
        }
        ComplexNumber result = model.result();
        String logStr = fileLogger.getLogString(cnA.comlexNumtoString(), cnB.comlexNumtoString(),
                result.comlexNumtoString(), oper);
        fileLogger.writeToFile(logStr, "Task3_DZ/Logging/log.txt");
        view.print("Результат -> ", result.comlexNumtoString());
    }
}
