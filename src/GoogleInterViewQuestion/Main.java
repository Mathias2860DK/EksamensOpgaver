package GoogleInterViewQuestion;

import javax.xml.crypto.Data;
import java.util.HashSet;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        int [] intArray = {3,8,6,6,5};
int sum = 12;
/*        for (int i = 0; i < intArray.length; i++){
            for (int j = i+1; j <intArray.length;j++){
                if (intArray[i] + intArray[j] == sum){
                    System.out.println("Par fundet " + intArray[i] +" + " + intArray[j] + " giver " + sum);
                }
            }
        }*/

        hasPairWithSum(intArray,12);

    }

    public static boolean hasPairWithSum ( int[] intArray, int sum ){
        HashSet<Integer> comp = new HashSet<>();
        //1,2,4,4 - Sum = 8
for (int i = 0; i < intArray.length; i++){
    int comple = sum - intArray[i];
    //comp.add(sum - intArray[i]);
    if (comp.contains(intArray[i])){
        System.out.println("fundet");
        return true;
    } else {
        comp.add(comple);
    }
//return false;
}
return false;

   /*     for (int value : intArray){
            if (comp.contains(value)!= comp.remove(value){
                return true;
            }
            comp.add(sum-value)
        }*/

    }
}
