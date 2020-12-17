package VampyrOgOrk;

public class Player {
    private int playerLife = 60;
    private int lossCount = 0;

    public Player (int playerLife, int lossCount){
        this.playerLife = playerLife;
    }

    public int defend(){
        double defendingDmg = 0;
        for (int i = 0; i < 10; i++) {
            defendingDmg += Math.random()*10;
        }
        return (int) defendingDmg;
    }

}
