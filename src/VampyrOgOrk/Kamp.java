package VampyrOgOrk;

public class Kamp {
   Vampyr vampyr = new Vampyr();
Ork ork = new Ork();

    public int [] fight () {

            int vampyrAttack = vampyr.attack();
            int orkAttack = ork.attack();
            System.out.println("Vampyrens angreb: " + vampyrAttack);
            System.out.println("orkens angreb: " + orkAttack);
            int[] retVal = {vampyrAttack, orkAttack};
            if (retVal[0] > retVal[1]) {
                System.out.println("Vampyren vinder!");
            } else {
                System.out.println("Orken vinder!");
            }
            return retVal;
        }


    public void winner (int [] kæmperne){

    }
}
