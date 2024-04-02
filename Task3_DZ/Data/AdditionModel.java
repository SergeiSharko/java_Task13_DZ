package Task3_DZ.Data;

public class AdditionModel extends ComplexNumberCalcModel {

    private ComplexNumber cnA;
    private ComplexNumber cnB;

    public AdditionModel() {
        
    }

    public AdditionModel(ComplexNumber cnA, ComplexNumber cnB) {
        this.cnA = cnA;
        this.cnB = cnB;
    }
    
    @Override
    public ComplexNumber result() {
        ComplexNumber resultAdd = new ComplexNumber();
        resultAdd.dReal = cnA.dReal + cnB.dReal;
        resultAdd.dImaginary = cnA.dImaginary + cnB.dImaginary; 
        return (resultAdd);
    }
}
