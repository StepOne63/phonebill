
public class Main {
    public static void main(String[] args) {

        int startBalance = 100;
        int replenishmentMore1000 = 1100; // Платеж больше тысячи
        int replenishmentLess1000 = 300; // Платеж меньше тысячи

        int bonus;
        if (replenishmentMore1000 > 1000) {
            bonus = replenishmentMore1000 / startBalance;
        } else {
            bonus = replenishmentLess1000 / startBalance;
        }

        int balance = bonus + replenishmentMore1000 + startBalance;
        System.out.println("Итоговая сумма" + balance);

        int amountBonus = replenishmentMore1000 / startBalance;
        System.out.println("Полученные бонусы" + amountBonus);
    }

}
