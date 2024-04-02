package Task3_DZ.Data;

public class SubtractionModel extends ComplexNumberCalcModel {
    
    private ComplexNumber cnA;
    private ComplexNumber cnB;

    public SubtractionModel() {
        
    }

    public SubtractionModel(ComplexNumber cnA, ComplexNumber cnB) {
        this.cnA = cnA;
        this.cnB = cnB;
    }
    
    @Override
    public ComplexNumber result() {
        ComplexNumber resultDiff = new ComplexNumber();
        resultDiff.dReal = cnA.dReal - cnB.dReal;
        resultDiff.dImaginary = cnA.dImaginary - cnB.dImaginary; 
        return (resultDiff);
    }
}
