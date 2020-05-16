package academy.pocu.comp2500.lab2;

public class ComplexNumber {

    double real;
    double imaginary;

    public ComplexNumber() {
        this(0.0, 0.0);
    }

    public ComplexNumber(double real) {
        this(real, 0.0);
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public boolean isReal() {
        return imaginary == 0.0;
    }

    public boolean isImaginary() {
        return real == 0.0;
    }

    public ComplexNumber getConjugate() {
        return new ComplexNumber(real, -imaginary);
    }

    public ComplexNumber add(ComplexNumber b) {
        return new ComplexNumber(this.real + b.real, this.imaginary + b.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber b) {
        return new ComplexNumber(this.real - b.real, this.imaginary - b.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber b) {
        return new ComplexNumber((this.real * b.real) - (this.imaginary * b.imaginary), (this.real * b.imaginary) + (b.real * this.imaginary));
    }

    public ComplexNumber divide(ComplexNumber b) {
        ComplexNumber mul = this.multiply(new ComplexNumber(b.real, -b.imaginary));
        double denominator = (b.real * b.real) + (b.imaginary * b.imaginary);

        return new ComplexNumber(mul.real / denominator, mul.imaginary / denominator);
    }

}
