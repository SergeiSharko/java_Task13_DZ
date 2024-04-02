package Task2_DZ;

import Task2_DZ.Data.OperationFactory;
import Task2_DZ.Presenter.Presenter;

public class Program {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new OperationFactory());
        presenter.startCalculate();
        presenter.startCalculate();        
    }
}