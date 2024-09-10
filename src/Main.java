public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(65, 1.75);
        int standard;
        if (bmi < 18.5) {
            System.out.println("Ваш индекс массы тела: " + bmi + " - у Вас недостаточная масса.");
        }
        if (bmi > 18.5 && bmi <= 25) {
            System.out.println("Ваш индекс массы тела: " + bmi + " - у Вас нормальная масса.");
        }
        if (bmi > 25) {
            System.out.println("Ваш индекс массы тела: " + bmi + " - у Вас избыточная масса тела.");}
    }
}