public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 69;
        double height = 1.8;
        double myBmi = service.calculate(weight, height);

        System.out.printf("%.1f", myBmi);
    }
}