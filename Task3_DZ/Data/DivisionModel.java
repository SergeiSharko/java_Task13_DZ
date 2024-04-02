package Task3_DZ.Data;

public class DivisionModel extends ComplexNumberCalcModel {

    private ComplexNumber cnA;
    private ComplexNumber cnB;

    public DivisionModel() {

    }

    public DivisionModel(ComplexNumber cnA, ComplexNumber cnB) {
        this.cnA = cnA;
        this.cnB = cnB;
    }

    @Override
    public ComplexNumber result() {
        ComplexNumber resultDiv = new ComplexNumber();
        double dR, dDen;

        if (Math.abs(cnB.dReal) >= Math.abs(cnB.dImaginary)) {
            dR = cnB.dImaginary / cnB.dReal;
            dDen = cnB.dReal + dR * cnB.dImaginary;
            resultDiv.dReal = (cnA.dReal + dR * cnA.dImaginary) / dDen;
            resultDiv.dImaginary = (cnA.dImaginary - dR * cnA.dReal) / dDen;
        } else {
            dR = cnB.dReal / cnB.dImaginary;
            dDen = cnB.dImaginary + dR * cnB.dReal;
            resultDiv.dReal = (dR * cnA.dReal + cnA.dImaginary) / dDen;
            resultDiv.dImaginary = (dR * cnA.dImaginary - cnA.dReal) / dDen;
        }
        return (resultDiv);
    }    
}
