package Task2_DZ.Data;

public class DivisionModel extends CalcModel {

    public DivisionModel() {

    }

    @Override
    public double result() {
        return x / y;
    }

    @Override
    public void setX(double value) {
        super.x = value;
    }

    @Override
    public void setY(double value) {
        if (value == 0) {
            System.out.println("Делить на 0 нельзя!");
        } else { 
            super.y = value;
        }
    }

}
