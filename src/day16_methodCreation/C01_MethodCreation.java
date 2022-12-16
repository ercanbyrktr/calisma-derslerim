package day16_methodCreation;

import day15_MethodCreation.C04_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        // input olarak verilen 4 harfli bir stringi
        // tersten yazdiran bir method olusturalim
        terstenYazdir("Okan");
    }

    public static void terstenYazdir(String input){
        String tersInput=input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println("Verilen kelimenin terstesn yazilisi :" + tersInput);
    }
}
