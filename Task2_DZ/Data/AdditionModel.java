package Task2_DZ.Data;

public class AdditionModel extends CalcModel {

    public AdditionModel() {
        
    }
    
    @Override
    public double result() {
        return x + y;
    }

    @Override
    public void setX(double value) {
        super.x = value;
    }

    @Override
    public void setY(double value) {
        super.y = value;
    }
}
