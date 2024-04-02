package Task2_DZ.Data;

public class OperationFactory {

    public Model createModel(String operation) {

        switch (operation) {
            case "+":
                return new AdditionModel();                
            case "-":
                return new SubtractionModel();                
            case "*":
                return new MultiplicationModel();
            case "/":
                return new DivisionModel();
            default:
                System.out.println("Неверная операция! Введите: +, -, *, /.");;
        }
        return null;
    }
}
