package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetUserStrings {
    Scanner scanner = new Scanner(System.in);
    List<String> strings;


    public GetUserStrings(List<String> strings) {
        strings = new ArrayList<>();

    }

    public void readStrings(){
        int counter = 0;

        while (counter < 5 ){
            System.out.println("Indtast et navneord");
        }

    }
}
