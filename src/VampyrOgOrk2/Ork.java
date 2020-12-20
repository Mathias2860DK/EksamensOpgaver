package VampyrOgOrk2;

import java.util.Random;

public class Ork implements Monster {
    @Override
    public int angrebsMetode() {
        Random random = new Random();
        double damage = random.nextDouble()*100;

        return (int) damage;
    }
}
