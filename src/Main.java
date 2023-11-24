
public class Main {
    public static void main(String[] args) {

        int startbalance = 100;
        int payone = 1100;
        int paytwo = 300;
        boolean More500 = true;

        int bonus;
        if (More500) {
            bonus = payone / startbalance;
        } else {
            bonus = paytwo / startbalance;
        }

        int balance = bonus + payone + startbalance;
        System.out.println("Итоговая сумма" + balance);
    }

}
