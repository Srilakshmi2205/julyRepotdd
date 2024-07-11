package com.neoteric.project.loops;

public class Character {
    public static void main(String[] args) {
         char  ch ='A';

        while (ch <= 'Z'){
            System.out.println(ch + " "+(ch-64) + (char)(ch+32));
            ch++;

        }
    }
}
