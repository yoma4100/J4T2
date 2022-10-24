public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println("Индекс массы моего тела:");
        System.out.printf("%.1f", service.calculate(69, 1.8));
    }
}