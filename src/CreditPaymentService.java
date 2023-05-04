public class CreditPaymentService {
    public int calculate(int sum, int time, double percent) {

        int result;
        result = (int) ((sum / time + percent));
        return result;
    }
}