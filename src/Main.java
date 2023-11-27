
public class Main {
    public static void main(String[] args) {

        int startBalance = 100;
        int replenishmentMore500 = 1100;
        int replenishmentLess500 = 300;

        int bonus;
        if (replenishmentMore500 > 500) {
            bonus = replenishmentMore500 / startBalance;
        } else {
            bonus = replenishmentLess500 / startBalance;
        }

        int balance = bonus + replenishmentMore500 + startBalance;
        System.out.println("Итоговая сумма" + balance);

        int amountBonus = replenishmentMore500 / startBalance;
        System.out.println("Полученные бонусы" + amountBonus);
    }

}
