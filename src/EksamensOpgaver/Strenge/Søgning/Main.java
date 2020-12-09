package EksamensOpgaver.Strenge.Søgning;

public class Main {

    public static void main(String[] args) {
Main main = new Main();
String [] test = {"Audi", "Bmw", "Ford"};
String isInString = "Ford";
        System.out.println(main.isInArray(test,isInString));
    }

public int isInArray (String[] stringArr, String isInString){
        int index = -1;
        for (int i = 0; i < stringArr.length; i ++){
            if (stringArr[i].equals(isInString)){
                index = i;
                return  index;
        }
}
        return index;
    }
}
