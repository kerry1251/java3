import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ваш баланс:");
        int account = 150;
        int replenishment = 1100;
        boolean balance = true;

        int bonus;
        if (balance) {
            bonus = 1;
        } else {
            bonus = 0;}
        int money = account + replenishment + bonus;

        System.out.println(money);
     }
}
