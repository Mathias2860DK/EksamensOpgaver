package VampyrOgOrk;

public class Vampyr implements Monstre {
private int currentTime;

    @Override
    public int attack() {
        double damge = 0;
        int currentTime = 18;
        for (int i = 0; i <= 10; i++) {
            if (currentTime >= 18) {
                damge += Math.random() * 12;
            } if (currentTime >= 22){
                damge += Math.random()*20;
            }else if (currentTime < 18) {
                damge += Math.random()*5;
            }
        }

        return (int) damge;
    }

    @Override
    public void attackPlayer(Player player) {

    }

    public int setCurrentTime(int currentTime){
        return this.currentTime;
 }

}
