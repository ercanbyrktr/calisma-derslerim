package day16_methodCreation;

public class C04_MethodCreationReturn {
    // verilen isim ve soyismi ilk harfi buyuk
    // geriye kalanlari * olacak sekilde degistirip
    // bize bu halini donduren bir method olusturun
    // NOT: programin ilerleyen kisimlarinda isim ve soyisim
    public static void main(String[] args) {

        String isim="Emre";
        String soyisim="Bozkurt";

        String gizliIsim=isimGizle(isim,soyisim);
        System.out.println(isim+" "+soyisim); // Enes Bozkurt
        System.out.println(gizliIsim); // E*** B******


    }

    public static String isimGizle(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()
                +soyisim.substring(1).replaceAll("\\w","*");
        return isim+" "+soyisim;
    }
}
