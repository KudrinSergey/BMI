public class BmiService {
    public int calculate(double height, double weight) {
        double v = height / Math.pow(weight, 2);
        return (int) v;
    };
}
