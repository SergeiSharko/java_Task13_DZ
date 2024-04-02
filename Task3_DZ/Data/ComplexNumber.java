package Task3_DZ.Data;

public class ComplexNumber {
    protected double dReal, dImaginary;

    public ComplexNumber() {
    }

    public ComplexNumber(double dReal, double dImaginary) {
        this.dReal = dReal;
        this.dImaginary = dImaginary;
    }

    public double getReal() {
        return dReal;
    }

    public double getImaginary() {
        return dImaginary;
    }

    public String comlexNumtoString() {
        if (dImaginary >= 0)
          return dReal + " + " +  dImaginary + "i";
        else
          return dReal + " - " + -dImaginary + "i";
    }
}
