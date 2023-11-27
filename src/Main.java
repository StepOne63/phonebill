
public class Main {
    public static void main(String[] args) {

        int StartBalance = 100;
        int PayMore500 = 1100;
        int PayLess500 = 300;
        boolean PaymentMore500 = true;

        int bonus;
        if (PaymentMore500) {
            bonus = PayMore500 / StartBalance;
        } else {
            bonus = PayLess500 / StartBalance;
        }

        int balance = bonus + PayMore500 + StartBalance;
        System.out.println("Итоговая сумма" + balance);
    }

}
