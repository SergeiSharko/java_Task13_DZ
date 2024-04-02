package Task3_DZ.Data;

public class OperationFactory {   

    public Model createModel(String operation, ComplexNumber cnA, ComplexNumber cnB) {        

        switch (operation) {
            case "+":
                return new AdditionModel(cnA, cnB);
            case "-":
                return new SubtractionModel(cnA, cnB);
            case "*":
                return new MultiplicationModel(cnA, cnB);
            case "/":
                return new DivisionModel(cnA, cnB);
            default:
                System.out.println("Неверная операция! Введите: +, -, *, /.");;
        }
        return null;
    }
}
