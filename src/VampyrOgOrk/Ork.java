package VampyrOgOrk;

public class Ork implements Monstre{
    @Override
    public int attack() {
        double damage = 0;
        for (int i = 0; i < 10; i++) {
            damage += Math.random()*10;
        }
        return (int) damage;
    }

    @Override
    public void attackPlayer(Player player) {
        //55
        if (player.defend() > attack()){
            System.out.println("Player vinder!");
        } else {
            System.out.println("Ork vinder!");
        }

    }
}
