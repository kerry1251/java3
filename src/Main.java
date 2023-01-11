
public class Main {

    public static void main(String[] args) {
        System.out.println("Здравствуйте!");
        System.out.println("Ваш баланс:");

        int balance = 150;
        int replenesmint = 6500;

        int amount;
        if (replenesmint >= 1000) {
            amount = 1;
        } else {
            amount = 0;
        }

        int bonus = replenesmint / 100 * amount;

        System.out.println(balance + replenesmint);

        System.out.println("Ваш бонус:");

        System.out.println(bonus);


        System.out.println("Спасибо, что доверяете нам!");
    }
}

