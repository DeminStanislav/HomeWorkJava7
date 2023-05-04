public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        int time = 24;
        double percent = (int) (sum * 9.99 / 100/12);
        int payment = service.calculate(sum, time, percent);
        System.out.println("Ежемесячный платеж:" + payment);
    }

}
