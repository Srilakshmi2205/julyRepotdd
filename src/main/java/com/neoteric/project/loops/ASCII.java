package com.neoteric.project.loops;

public class ASCII {

    public static void main(String[] args) {
         int i = 1;
         while(i<=26){
             System.out.println(i+" "+(char)(i+64)+" "+(char)(i+96));
             i++;
         }

    }
}
