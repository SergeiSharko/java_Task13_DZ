package Task3_DZ.Data;

public class MultiplicationModel extends ComplexNumberCalcModel {

    private ComplexNumber cnA;
    private ComplexNumber cnB;

    public MultiplicationModel() {

    }

    public MultiplicationModel(ComplexNumber cnA, ComplexNumber cnB) {
        this.cnA = cnA;
        this.cnB = cnB;
    }

    @Override
    public ComplexNumber result() {
        ComplexNumber resultMult = new ComplexNumber();
        resultMult.dReal = cnA.dReal * cnB.dReal - cnA.dImaginary * cnB.dImaginary;
        resultMult.dImaginary = cnA.dImaginary * cnB.dReal + cnA.dReal * cnB.dImaginary;

        return (resultMult);
    }
}
