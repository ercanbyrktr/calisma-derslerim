package day20_while_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        /*
        soru 7) Kullanicidan bir sayi alin
        ve bu sayinin rakamlarini toplayin
         */

        int input=524321;

        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=input;

        while(temp>0){
            birlerBasamagi=temp%10;
            rakamlarToplami +=birlerBasamagi;
            temp/=10;
        }
        System.out.println(input+ "sayisinin rakamlar toplami:" + rakamlarToplami);
    }
}
