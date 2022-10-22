import static java.lang.Math.pow;

public class BmiService {

    public double calculate(double weight, double height) {
        double bmi = weight / pow(height, 2);
        return bmi;
    }
}