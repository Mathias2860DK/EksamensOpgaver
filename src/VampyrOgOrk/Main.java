package VampyrOgOrk;

public class Main {

    public static void main(String[] args) {
Kamp kamp = new Kamp(); //instanitierer en klasse for at kunne tilgå dets metoder via objektet af klassen.
for (int i = 0; i < 10; i++) {
    kamp.fight();
}

Ork ork = new Ork();
Player player = new Player(55,0);
ork.attackPlayer(player);

    }
}
