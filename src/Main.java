public class Main {
    public static void main(String[] args) {

        int startBalance = 100;
        int replenishment = 300; // Платеж

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / startBalance;
        } else {
            bonus = 0;
        }

        int balance = bonus + replenishment + startBalance;
        System.out.println("Итоговая сумма" + balance);

        int amountBonus = replenishment / startBalance;
        if (replenishment < 1000) {
            amountBonus = 0;
        }
        System.out.println("Полученные бонусы" + amountBonus);
    }
}


