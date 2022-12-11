package day11_stringManipulations;

public class C04_contains {
    public static void main(String[] args) {

        /*
        Soru2) Kullanicidan bir cumle isteyin.
        Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa "Cumle kucuk ya da buyuk kelimesi icermiyor" yazdirin.
         */

        String cumle="Java buyuk, dunya kucuk";
        cumle=cumle.toLowerCase();
        // requirements'de buyuk harf kucuk harf hassasiyeti hakkında birsey soylenmemiş
        // ikinci olarak da her iki kelimeyi de icerme durumu acıklanmamış
        // bu durumda görevi bize kim verdiyse ona sormak lazim

        // ek requirements : ikisini de iceriyorsa "Karar ver buyuk mu yazdirayim, kucuk mu?"
        // case sensitive olmasin
        if (cumle.contains("kucuk")&&cumle.contains("buyuk")){
            System.out.println("Karar ver buyuk mu yazdirayim, kucuk mu?");
        }else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }else if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else{
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }
    }
}
