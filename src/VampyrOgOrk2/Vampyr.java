package VampyrOgOrk2;

import java.util.Random;

public class Vampyr implements Monster {
    @Override
    public int angrebsMetode() {
        int currentTime = 20;
        double damage = 0;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            if (currentTime >= 18) {
                damage = random.nextDouble() * 100;
            } else if (currentTime >= 20) {
                damage = random.nextDouble() * 120;
            } else if (currentTime >= 23) {
                damage = random.nextDouble() * 150;
            }
            System.out.println((int) damage);
        }

        return (int) damage;
    }
}
