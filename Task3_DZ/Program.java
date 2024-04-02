package Task3_DZ;

import Task3_DZ.Data.OperationFactory;
import Task3_DZ.Presenter.Presenter;

public class Program {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new OperationFactory());
        presenter.startCalculate();            
    }
}